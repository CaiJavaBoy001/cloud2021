package com.javaboy.springcloud.mapper;

import com.javaboy.springcloud.entity.OrderTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author javaboy
 */
@Mapper
public interface OrderTableMapper {

    /**
     * 创建订单
     * @param orderTable
     */
    public void insertOrder(OrderTable orderTable);

    /**
     * 更新订单状态
     * @param userId
     * @param status
     */
    public void updateStatus(@Param("userId") int userId, @Param("status") int status);


}
