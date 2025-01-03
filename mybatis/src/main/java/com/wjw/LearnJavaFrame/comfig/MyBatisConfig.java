package com.wjw.LearnJavaFrame.comfig;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther macrozheng
 * @description MyBatis配置类
 * @date 2019/4/8
 * @github https://github.com/macrozheng
 */
@Configuration
@MapperScan("com.wjw.LearnJavaFrame.dao")
public class MyBatisConfig {
}
