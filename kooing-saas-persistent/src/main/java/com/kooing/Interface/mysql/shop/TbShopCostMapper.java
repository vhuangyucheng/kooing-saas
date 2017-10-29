package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopCost;

public interface TbShopCostMapper {
    int deleteByPrimaryKey(Integer costId);

    int insert(TbShopCost record);

    int insertSelective(TbShopCost record);

    TbShopCost selectByPrimaryKey(Integer costId);

    int updateByPrimaryKeySelective(TbShopCost record);

    int updateByPrimaryKey(TbShopCost record);
}