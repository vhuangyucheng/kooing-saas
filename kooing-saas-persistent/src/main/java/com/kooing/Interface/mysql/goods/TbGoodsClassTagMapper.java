package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsClassTag;

public interface TbGoodsClassTagMapper {
    int deleteByPrimaryKey(Integer gcTagId);

    int insert(TbGoodsClassTag record);

    int insertSelective(TbGoodsClassTag record);

    TbGoodsClassTag selectByPrimaryKey(Integer gcTagId);

    int updateByPrimaryKeySelective(TbGoodsClassTag record);

    int updateByPrimaryKeyWithBLOBs(TbGoodsClassTag record);

    int updateByPrimaryKey(TbGoodsClassTag record);
}