package com.kooing.saas.persistent.dao.order;

import com.kooing.saas.persistent.model.order.TbOdmOrderGoods;

public interface TbOdmOrderGoodsMapper {
    int deleteByPrimaryKey(Long recId);

    int insert(TbOdmOrderGoods record);

    int insertSelective(TbOdmOrderGoods record);

    TbOdmOrderGoods selectByPrimaryKey(Long recId);

    int updateByPrimaryKeySelective(TbOdmOrderGoods record);

    int updateByPrimaryKey(TbOdmOrderGoods record);
}