package com.javaboy.springcloud.controller;

import com.javaboy.springcloud.entities.ResultMessage;
import com.javaboy.springcloud.entities.UserTable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author javaboy
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos")
    public ResultMessage getPayment(){
        UserTable userTable = new UserTable("wangwu", 30, "福建省厦门市海沧区");
        return ResultMessage.success(userTable.toString());
    }

}
