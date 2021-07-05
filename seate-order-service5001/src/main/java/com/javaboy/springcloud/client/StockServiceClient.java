package com.javaboy.springcloud.client;

import com.javaboy.springcloud.entities.ResultMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author javaboy
 */
@FeignClient(value = "seata-stock-service")
public interface StockServiceClient {

    @PostMapping("/stock/decrease")
    public ResultMessage decrease(@RequestParam("productId") int productId, @RequestParam("count") int count);


}
