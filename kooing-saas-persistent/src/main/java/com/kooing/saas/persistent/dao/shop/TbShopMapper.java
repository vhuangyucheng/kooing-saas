package com.kooing.saas.persistent.dao.shop;

import com.kooing.saas.persistent.model.shop.TbShop;

public interface TbShopMapper {
    int deleteByPrimaryKey(Long storeId);

    int insert(TbShop record);

    int insertSelective(TbShop record);

    TbShop selectByPrimaryKey(Long storeId);

    int updateByPrimaryKeySelective(TbShop record);

    int updateByPrimaryKeyWithBLOBs(TbShop record);

    int updateByPrimaryKey(TbShop record);
}