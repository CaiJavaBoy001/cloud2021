package com.javaboy.springcloud.myfallback;

import com.javaboy.springcloud.entities.ResultMessage;

/**
 * @author javaboy
 */
public class TestFallback {

    public static ResultMessage fallPaymentInfo(){
        return ResultMessage.fail("Fallback 方法");
    }

}
