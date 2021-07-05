package com.javaboy.springcloud.controller;

import com.javaboy.springcloud.entities.ResultMessage;
import com.javaboy.springcloud.service.StockTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author javaboy
 */
@RestController
public class StockController {

    @Autowired
    private StockTableService stockTableService;

    @PostMapping("/stock/decrease")
    public ResultMessage decrease(int productId, int count){
        ResultMessage resultMessage = stockTableService.stockDecrease(productId, count);
        return resultMessage;
    }

}
