package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsSpec;

public interface TbGoodsSpecMapper {
    int deleteByPrimaryKey(Integer spId);

    int insert(TbGoodsSpec record);

    int insertSelective(TbGoodsSpec record);

    TbGoodsSpec selectByPrimaryKey(Integer spId);

    int updateByPrimaryKeySelective(TbGoodsSpec record);

    int updateByPrimaryKey(TbGoodsSpec record);
}