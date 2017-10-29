package com.kooing.Interface.mysql.logistics;

import com.kooing.model.mysql.logistics.TbLgmDeliveryPoint;

public interface TbLgmDeliveryPointMapper {
    int deleteByPrimaryKey(Integer dlypId);

    int insert(TbLgmDeliveryPoint record);

    int insertSelective(TbLgmDeliveryPoint record);

    TbLgmDeliveryPoint selectByPrimaryKey(Integer dlypId);

    int updateByPrimaryKeySelective(TbLgmDeliveryPoint record);

    int updateByPrimaryKey(TbLgmDeliveryPoint record);
}