package com.kooing.saas.persistent.dao.goods;

import com.kooing.saas.persistent.model.goods.TbGoods;

public interface TbGoodsMapper {
    int deleteByPrimaryKey(Long goodsId);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

    TbGoods selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(TbGoods record);

    int updateByPrimaryKey(TbGoods record);
}