package com.whh.controller;

import com.whh.pojo.Books;
import com.whh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        try {
            List<Books> list = bookService.queryAll();
            model.addAttribute("list", list);
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "allBook";
    }
    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model) {
        Books book = bookService.queryBook(id);
        model.addAttribute("oBook",book);
        return "updateBook";
    }
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        try {
            int i = bookService.addBook(books);
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/books/allBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        try {
            int i = bookService.updateBook(books);
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/books/allBook";
    }
    @RequestMapping("/delBook")
    public String delBook(int id) {
        try {
            int i = bookService.delBook(id);
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/books/allBook";
    }
    @RequestMapping("/findBook")
    public String findBook(String bookName,Model model) {
        bookName=bookName.trim();
        List<Books> booksList = bookService.queryByName(bookName);
        System.err.println("booksList = " + booksList);
        if(booksList==null||booksList.isEmpty()){
            System.out.println("booksList==null");
            List<Books> list = bookService.queryAll();
            model.addAttribute("list", list);
            model.addAttribute("error", "无相关结果");
        }else{
            model.addAttribute("list", booksList);
        }

        return "allBook";
    }
}
