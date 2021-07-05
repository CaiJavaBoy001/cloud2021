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
public class AccountMain5003 {

    public static void main(String[] args) {
        SpringApplication.run(AccountMain5003.class, args);
    }

}
