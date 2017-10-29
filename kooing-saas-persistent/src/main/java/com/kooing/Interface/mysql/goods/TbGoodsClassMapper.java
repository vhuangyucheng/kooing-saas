package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsClass;

public interface TbGoodsClassMapper {
    int deleteByPrimaryKey(Integer gcId);

    int insert(TbGoodsClass record);

    int insertSelective(TbGoodsClass record);

    TbGoodsClass selectByPrimaryKey(Integer gcId);

    int updateByPrimaryKeySelective(TbGoodsClass record);

    int updateByPrimaryKey(TbGoodsClass record);
}