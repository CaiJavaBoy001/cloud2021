package com.javaboy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author javaboy
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class StockMain5002 {

    public static void main(String[] args) {
        SpringApplication.run(StockMain5002.class, args);
    }

}
