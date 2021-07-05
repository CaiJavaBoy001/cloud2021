package com.javaboy.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.DeleteMapping;

/**
 * @author javaboy
 */
@Mapper
public interface StockTableMapper {

    public void stockDecrease(@Param("productId") int productId, @Param("count") int count);

}
