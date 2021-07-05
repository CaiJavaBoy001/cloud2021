package com.javaboy.springcloud.service;

import com.javaboy.springcloud.client.AccountServiceClient;
import com.javaboy.springcloud.client.StockServiceClient;
import com.javaboy.springcloud.entities.ResultMessage;
import com.javaboy.springcloud.entity.OrderTable;
import com.javaboy.springcloud.mapper.OrderTableMapper;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author javaboy
 */
@Service
@Slf4j
public class OrderTableService {

    @Resource
    private OrderTableMapper orderTableMapper;
    @Resource
    private StockServiceClient stockServiceClient;
    @Resource
    private AccountServiceClient accountServiceClient;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说:
     * 下订单->减库存->减余额->改状态
     * GlobalTransactional seata开启分布式事务,异常时回滚,name保证唯一即可
     * @param orderTable 订单对象
     */
    @GlobalTransactional(name = "first_transactional", rollbackFor = Exception.class)
    public ResultMessage create(OrderTable orderTable){

        // 开始创建订单
        log.info("-----【开始创建订单】");
        orderTableMapper.insertOrder(orderTable);

        // 库存扣减
        log.info("-----【订单服务调用库存服务，扣减库存】");
        stockServiceClient.decrease(orderTable.getProductId(), orderTable.getCount());

        // 账户扣减
        log.info("-----【订单服务调用账户服务，扣减金额】");
        accountServiceClient.decrease(orderTable.getUserId(), orderTable.getMoney());

        // 更新订单状态
        log.info("-----【更新订单状态】");
        orderTableMapper.updateStatus(orderTable.getUserId(), 0);

        log.info("订单创建结束");
        return ResultMessage.success("订单创建成功");
    }

}
