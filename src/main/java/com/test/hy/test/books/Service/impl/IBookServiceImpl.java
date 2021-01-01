package com.test.hy.test.books.Service.impl;

import com.test.hy.test.books.Dao.IBookDao;
import com.test.hy.test.books.Entity.BookEntity;
import com.test.hy.test.books.Service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: IBookServiceImpl
 * @TODO：
 * @Auther: huang
 * @Date: 2020/12/29 23:20
 * @Version: 1.0
 **/
@Service
public class IBookServiceImpl implements IBookService {
    @Autowired
    IBookDao bookDao;

    @Override
    public BookEntity queryBooks() {
        System.out.println("2222");
        return bookDao.queryBookAll();
    }
}
