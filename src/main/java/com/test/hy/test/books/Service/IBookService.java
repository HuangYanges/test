package com.test.hy.test.books.Service;

import com.test.hy.test.books.Entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @InterfaceName: IBookService
 * @TODO：
 * @Auther: huang
 * @Date: 2020/12/29 23:18
 * @Version: 1.0
 **/

public interface IBookService {
    BookEntity queryBooks();
}
