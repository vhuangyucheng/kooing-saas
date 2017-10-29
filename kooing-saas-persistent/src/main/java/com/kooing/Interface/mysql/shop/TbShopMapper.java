package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShop;
import com.kooing.model.mysql.shop.TbShopWithBLOBs;

public interface TbShopMapper {
    int deleteByPrimaryKey(Integer storeId);

    int insert(TbShopWithBLOBs record);

    int insertSelective(TbShopWithBLOBs record);

    TbShopWithBLOBs selectByPrimaryKey(Integer storeId);

    int updateByPrimaryKeySelective(TbShopWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbShopWithBLOBs record);

    int updateByPrimaryKey(TbShop record);
}