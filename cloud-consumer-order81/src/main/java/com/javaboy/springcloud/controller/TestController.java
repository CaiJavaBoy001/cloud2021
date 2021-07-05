package com.javaboy.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.javaboy.springcloud.client.PaymentFeignClient;
import com.javaboy.springcloud.entities.ResultMessage;
import com.javaboy.springcloud.myfallback.TestFallback;
import com.javaboy.springcloud.myhandler.TestHandlaer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author javaboy
 */
@RestController
@Slf4j
public class TestController {

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;
    @Resource
    private RestTemplate restTemplate;
    @Resource
    PaymentFeignClient paymentFeignClient;

    @GetMapping(value = "/consumer/payment/nacos")
    @SentinelResource(value = "/consumer/payment/nacos",
            blockHandlerClass = TestHandlaer.class, blockHandler = "blockPaymentInfo",
            fallbackClass = TestFallback.class, fallback = "fallPaymentInfo")
    public ResultMessage pagmentInfo(){
        ResultMessage resultMessage = paymentFeignClient.getPayment();
        log.info("返回消息：{}", resultMessage);
        return resultMessage;
    }

}
