import com.whh.pojo.Books;
import com.whh.service.BookService;
import com.whh.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSSm {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");

        System.out.println(bookServiceImpl.queryAll());
        System.out.println("================================");
        for(Books books:bookServiceImpl.queryAll()){
            System.out.println(books.getBookID()+books.getBookName());
        }
    }
    @Test
    public void test2(){
        BookService bookService = new BookServiceImpl();
        List<Books> booksList = bookService.queryAll();
        System.out.println(booksList);
    }
}

