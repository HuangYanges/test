package com.test.hy.test.books.Dao;

import com.test.hy.test.books.Entity.BookEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName: IBookDao
 * @TODO：书籍的数据访问层接口
 * @Auther: huang
 * @Date: 2020/12/29 22:28
 * @Version: 1.0
 **/
@Repository
public interface IBookDao {

    BookEntity queryBookAll();
}
