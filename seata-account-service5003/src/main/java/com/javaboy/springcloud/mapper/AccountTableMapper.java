package com.javaboy.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author javaboy
 */
@Mapper
public interface AccountTableMapper {

    public void accountDecrease(@Param("userId") int userId, @Param("money") BigDecimal money);

}
