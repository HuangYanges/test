package com.test.hy.test.books.Controller;

import com.test.hy.test.books.Entity.BookEntity;
import com.test.hy.test.books.Service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: BooksController
 * @TODO：
 * @Auther: HuangYang
 * @Date: 2020/12/29 23:22
 * @Version: 1.0
 **/
@Controller
@RequestMapping("books")
public class BooksController {
    @Autowired
    IBookService bookService;

    @RequestMapping(value = "/queryList/1.0")
    public String queryBooks() {
        System.out.println("1111");
        BookEntity b=bookService.queryBooks();
        String s=b.toString();
        return "books";
    }
}
