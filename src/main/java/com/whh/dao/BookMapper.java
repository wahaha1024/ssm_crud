package com.whh.dao;

import com.whh.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookMapper {
    //新增书籍
    int addBook(Books books);
    //删除书籍
    int delBook(@Param("bookId") int id);
    //修改书籍
    int updateBook(Books books);
    //查询书籍
    Books queryBook(@Param("bookId") int id);
    //查询全部
    List<Books> queryAll();
    List<Books> queryByName(@Param("bookName") String bookName);
}
