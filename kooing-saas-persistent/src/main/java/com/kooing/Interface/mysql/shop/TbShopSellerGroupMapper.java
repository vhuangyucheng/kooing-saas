package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopSellerGroup;

public interface TbShopSellerGroupMapper {
    int deleteByPrimaryKey(Integer groupId);

    int insert(TbShopSellerGroup record);

    int insertSelective(TbShopSellerGroup record);

    TbShopSellerGroup selectByPrimaryKey(Integer groupId);

    int updateByPrimaryKeySelective(TbShopSellerGroup record);

    int updateByPrimaryKey(TbShopSellerGroup record);
}