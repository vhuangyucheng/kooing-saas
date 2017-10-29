package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsAttributeValue;

public interface TbGoodsAttributeValueMapper {
    int deleteByPrimaryKey(Integer attrValueId);

    int insert(TbGoodsAttributeValue record);

    int insertSelective(TbGoodsAttributeValue record);

    TbGoodsAttributeValue selectByPrimaryKey(Integer attrValueId);

    int updateByPrimaryKeySelective(TbGoodsAttributeValue record);

    int updateByPrimaryKey(TbGoodsAttributeValue record);
}