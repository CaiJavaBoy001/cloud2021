package com.javaboy.springcloud.client;

import com.javaboy.springcloud.entities.ResultMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author javaboy
 */
@FeignClient(value = "seata-account-service")
public interface AccountServiceClient {

    @PostMapping("/account/decrease")
    public ResultMessage decrease(@RequestParam("userId") int userId, @RequestParam("money") BigDecimal money);

}
