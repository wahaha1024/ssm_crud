package com.whh.service;

import com.whh.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    //新增书籍
    public int addBook(Books books);
    //删除书籍
    public int delBook(int id);
    //修改书籍
    public int updateBook(Books books);
    //查询书籍
    public Books queryBook(int id);
    //查询全部
    public List<Books> queryAll();

    public List<Books> queryByName(String bookName);
}
