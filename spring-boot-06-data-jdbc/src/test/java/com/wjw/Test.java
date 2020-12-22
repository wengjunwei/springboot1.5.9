package com.wjw;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created on 2020/12/22 0022
 *
 * @author weng
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    DataSource dataSource;



    @org.junit.Test
    public void show() throws SQLException {
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }
}
