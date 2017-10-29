package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopAddress;

public interface TbShopAddressMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(TbShopAddress record);

    int insertSelective(TbShopAddress record);

    TbShopAddress selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(TbShopAddress record);

    int updateByPrimaryKey(TbShopAddress record);
}