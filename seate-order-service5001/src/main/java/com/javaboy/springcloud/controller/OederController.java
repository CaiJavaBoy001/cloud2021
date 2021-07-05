package com.javaboy.springcloud.controller;

import com.javaboy.springcloud.entities.ResultMessage;
import com.javaboy.springcloud.entity.OrderTable;
import com.javaboy.springcloud.service.OrderTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author javaboy
 */
@RestController
public class OederController {

    @Autowired
    private OrderTableService orderTableService;

    @PostMapping("/order/create")
    public ResultMessage create(@RequestBody OrderTable orderTable){
        ResultMessage resultMessage = orderTableService.create(orderTable);
        return resultMessage;
    }

}
