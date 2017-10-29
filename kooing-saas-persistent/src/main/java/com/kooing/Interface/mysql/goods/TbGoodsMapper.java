package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoods;

public interface TbGoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

    TbGoods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(TbGoods record);

    int updateByPrimaryKey(TbGoods record);
}