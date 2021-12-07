package com.xzit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class HbmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HbmsApplication.class, args);
    }

   // @SpringBootTest
//    class Springboot08ApplicationTests {
//        // 注入数据源对象
//        @Autowired
//        private DataSource dataSource;
//
//        //@Test
//        public void datasourceTest() throws SQLException {
//            // 获取数据库连接对象
//            Connection connection = dataSource.getConnection();
//            // 判断连接对象是否为空
//            System.out.println(connection != null);
//            connection.close();
//        }
//    }

}
