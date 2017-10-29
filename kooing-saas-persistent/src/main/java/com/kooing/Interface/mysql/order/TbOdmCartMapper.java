package com.kooing.Interface.mysql.order;

import com.kooing.model.mysql.order.TbOdmCart;

public interface TbOdmCartMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(TbOdmCart record);

    int insertSelective(TbOdmCart record);

    TbOdmCart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(TbOdmCart record);

    int updateByPrimaryKey(TbOdmCart record);
}