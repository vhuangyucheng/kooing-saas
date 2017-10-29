package com.kooing.Interface.mysql.order;

import com.kooing.model.mysql.order.TbOdmOrderPay;

public interface TbOdmOrderPayMapper {
    int deleteByPrimaryKey(Integer payId);

    int insert(TbOdmOrderPay record);

    int insertSelective(TbOdmOrderPay record);

    TbOdmOrderPay selectByPrimaryKey(Integer payId);

    int updateByPrimaryKeySelective(TbOdmOrderPay record);

    int updateByPrimaryKey(TbOdmOrderPay record);
}