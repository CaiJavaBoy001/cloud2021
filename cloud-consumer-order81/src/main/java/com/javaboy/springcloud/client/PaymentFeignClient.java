package com.javaboy.springcloud.client;

import com.javaboy.springcloud.entities.ResultMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author javaboy
 */
@FeignClient(value = "cloud-provider-payment", fallback = PaymentFallback.class)
public interface PaymentFeignClient {

    @GetMapping(value = "/payment/nacos")
    public ResultMessage getPayment();

}
