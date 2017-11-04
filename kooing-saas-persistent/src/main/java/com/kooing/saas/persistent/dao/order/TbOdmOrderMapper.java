package com.kooing.saas.persistent.dao.order;

import com.kooing.saas.persistent.model.order.TbOdmOrder;

public interface TbOdmOrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(TbOdmOrder record);

    int insertSelective(TbOdmOrder record);

    TbOdmOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(TbOdmOrder record);

    int updateByPrimaryKey(TbOdmOrder record);
}