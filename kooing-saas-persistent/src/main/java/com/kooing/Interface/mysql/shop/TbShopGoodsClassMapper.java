package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopGoodsClass;

public interface TbShopGoodsClassMapper {
    int deleteByPrimaryKey(Integer stcId);

    int insert(TbShopGoodsClass record);

    int insertSelective(TbShopGoodsClass record);

    TbShopGoodsClass selectByPrimaryKey(Integer stcId);

    int updateByPrimaryKeySelective(TbShopGoodsClass record);

    int updateByPrimaryKey(TbShopGoodsClass record);
}