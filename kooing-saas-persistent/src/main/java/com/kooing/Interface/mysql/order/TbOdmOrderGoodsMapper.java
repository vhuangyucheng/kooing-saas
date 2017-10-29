package com.kooing.Interface.mysql.order;

import com.kooing.model.mysql.order.TbOdmOrderGoods;

public interface TbOdmOrderGoodsMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(TbOdmOrderGoods record);

    int insertSelective(TbOdmOrderGoods record);

    TbOdmOrderGoods selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(TbOdmOrderGoods record);

    int updateByPrimaryKey(TbOdmOrderGoods record);
}