package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopSeller;
import com.kooing.model.mysql.shop.TbShopSellerWithBLOBs;

public interface TbShopSellerMapper {
    int deleteByPrimaryKey(Integer sellerId);

    int insert(TbShopSellerWithBLOBs record);

    int insertSelective(TbShopSellerWithBLOBs record);

    TbShopSellerWithBLOBs selectByPrimaryKey(Integer sellerId);

    int updateByPrimaryKeySelective(TbShopSellerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbShopSellerWithBLOBs record);

    int updateByPrimaryKey(TbShopSeller record);
}