package com.javaboy.springcloud.service;

import com.javaboy.springcloud.entities.ResultMessage;
import com.javaboy.springcloud.mapper.AccountTableMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author javaboy
 */
@Service
public class AccountTableService {

    @Resource
    private AccountTableMapper accountTableMapper;

    public ResultMessage accountDecrease(int userId, BigDecimal money){
        accountTableMapper.accountDecrease(userId, money);
        return ResultMessage.success("账户扣减成功");
    }

}
