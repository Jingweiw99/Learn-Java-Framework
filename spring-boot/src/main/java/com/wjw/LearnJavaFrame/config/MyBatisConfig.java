package com.wjw.LearnJavaFrame.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.wjw.LearnJavaFrame.mapper")
public class MyBatisConfig {
}
