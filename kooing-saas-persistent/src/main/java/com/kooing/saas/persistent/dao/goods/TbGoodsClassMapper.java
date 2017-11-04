package com.kooing.saas.persistent.dao.goods;

import com.kooing.saas.persistent.model.goods.TbGoodsClass;

public interface TbGoodsClassMapper {
    int deleteByPrimaryKey(Integer gcId);

    int insert(TbGoodsClass record);

    int insertSelective(TbGoodsClass record);

    TbGoodsClass selectByPrimaryKey(Integer gcId);

    int updateByPrimaryKeySelective(TbGoodsClass record);

    int updateByPrimaryKey(TbGoodsClass record);
}