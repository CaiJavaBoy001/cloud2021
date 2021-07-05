package com.javaboy.springcloud.client;

import com.javaboy.springcloud.entities.ResultMessage;
import org.springframework.stereotype.Component;

/**
 * @author javaboy
 */
@Component
public class PaymentFallback implements PaymentFeignClient{

    @Override
    public ResultMessage getPayment() {
        return ResultMessage.fail("OpenFeign Fallback 方法");
    }

}
