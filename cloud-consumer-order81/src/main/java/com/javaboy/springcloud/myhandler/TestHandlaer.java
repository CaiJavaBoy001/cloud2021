package com.javaboy.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.javaboy.springcloud.entities.ResultMessage;

/**
 * @author javaboy
 */
public class TestHandlaer {

    public static ResultMessage blockPaymentInfo(BlockException blockException){
        return ResultMessage.fail("Sentinel BlockHandler 方法");
    }

}
