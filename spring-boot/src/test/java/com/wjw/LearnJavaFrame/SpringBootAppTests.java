package com.wjw.LearnJavaFrame;

import com.wjw.LearnJavaFrame.config.IgnoreUrlsConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
@Slf4j
public class SpringBootAppTests {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private IgnoreUrlsConfig ignoreUrlsConfig;


    @Test
    public void test1() throws SQLException {
        System.out.println(dataSource.getClass());
    }
    @Test
    public void test2() {
        log.info("忽略的urls为：{}",ignoreUrlsConfig.getUrls());
    }
    @Test
    public void test3() {
        int a = 1;
        Assertions.assertEquals(1, a);
    }

}
