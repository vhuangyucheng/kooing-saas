package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopJoinin;

public interface TbShopJoininMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbShopJoinin record);

    int insertSelective(TbShopJoinin record);

    TbShopJoinin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbShopJoinin record);

    int updateByPrimaryKey(TbShopJoinin record);
}