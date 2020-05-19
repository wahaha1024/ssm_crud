package com.whh.service;

import com.whh.dao.BookMapper;
import com.whh.pojo.Books;
import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements  BookService {

    private BookMapper bookMapper;
    //调用dao层的操作，设置一个set接口，方便Spring管理
    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper=bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int delBook(int id) {
        return bookMapper.delBook(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBook(int id) {
        return bookMapper.queryBook(id);
    }

    public List<Books> queryByName(String bookName) {
        return bookMapper.queryByName(bookName);
    }

    public List<Books> queryAll() {
        System.out.println("queryAll.............");
        return bookMapper.queryAll();
    }
}
