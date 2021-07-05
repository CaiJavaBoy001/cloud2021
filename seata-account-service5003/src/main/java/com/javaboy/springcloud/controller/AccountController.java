package com.javaboy.springcloud.controller;

import com.alibaba.fastjson.serializer.BigDecimalCodec;
import com.javaboy.springcloud.entities.ResultMessage;
import com.javaboy.springcloud.service.AccountTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author javaboy
 */
@RestController
public class AccountController {

    @Autowired
    private AccountTableService accountTableService;

    @PostMapping("/account/decrease")
    public ResultMessage decrease(int userId, BigDecimal money){
        ResultMessage resultMessage = accountTableService.accountDecrease(userId, money);
        return resultMessage;
    }

}
