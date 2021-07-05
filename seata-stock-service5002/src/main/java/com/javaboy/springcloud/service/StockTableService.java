package com.javaboy.springcloud.service;

import com.javaboy.springcloud.entities.ResultMessage;
import com.javaboy.springcloud.mapper.StockTableMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author javaboy
 */
@Service
public class StockTableService {

    @Resource
    private StockTableMapper stockTableMapper;

    public ResultMessage stockDecrease(int productId, int count){
        stockTableMapper.stockDecrease(productId, count);
        return ResultMessage.success("库存扣减成功");
    }


}
