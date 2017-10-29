package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopDecoration;

public interface TbShopDecorationMapper {
    int deleteByPrimaryKey(Integer decorationId);

    int insert(TbShopDecoration record);

    int insertSelective(TbShopDecoration record);

    TbShopDecoration selectByPrimaryKey(Integer decorationId);

    int updateByPrimaryKeySelective(TbShopDecoration record);

    int updateByPrimaryKey(TbShopDecoration record);
}