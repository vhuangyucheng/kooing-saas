package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsSpecValue;

public interface TbGoodsSpecValueMapper {
    int deleteByPrimaryKey(Integer spValueId);

    int insert(TbGoodsSpecValue record);

    int insertSelective(TbGoodsSpecValue record);

    TbGoodsSpecValue selectByPrimaryKey(Integer spValueId);

    int updateByPrimaryKeySelective(TbGoodsSpecValue record);

    int updateByPrimaryKey(TbGoodsSpecValue record);
}