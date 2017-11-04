package com.kooing.saas.persistent.dao.shop;

import com.kooing.saas.persistent.model.shop.TbShopJoinin;

public interface TbShopJoininMapper {
    int deleteByPrimaryKey(Integer shopJoininId);

    int insert(TbShopJoinin record);

    int insertSelective(TbShopJoinin record);

    TbShopJoinin selectByPrimaryKey(Integer shopJoininId);

    int updateByPrimaryKeySelective(TbShopJoinin record);

    int updateByPrimaryKey(TbShopJoinin record);
}