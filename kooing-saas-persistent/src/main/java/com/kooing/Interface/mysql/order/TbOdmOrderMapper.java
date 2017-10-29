package com.kooing.Interface.mysql.order;

import com.kooing.model.mysql.order.TbOdmOrder;

public interface TbOdmOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(TbOdmOrder record);

    int insertSelective(TbOdmOrder record);

    TbOdmOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(TbOdmOrder record);

    int updateByPrimaryKey(TbOdmOrder record);
}