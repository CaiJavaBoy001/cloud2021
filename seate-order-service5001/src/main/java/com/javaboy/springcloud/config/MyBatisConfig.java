package com.javaboy.springcloud.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author javaboy
 */
@Configuration
@MapperScan({"com.javaboy.springcloud.mapper"})
public class MyBatisConfig {


}
