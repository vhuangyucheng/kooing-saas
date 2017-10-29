package com.kooing.Interface.mysql.logistics;

import com.kooing.model.mysql.logistics.TbLgmDeliveryOrder;

public interface TbLgmDeliveryOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(TbLgmDeliveryOrder record);

    int insertSelective(TbLgmDeliveryOrder record);

    TbLgmDeliveryOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(TbLgmDeliveryOrder record);

    int updateByPrimaryKey(TbLgmDeliveryOrder record);
}