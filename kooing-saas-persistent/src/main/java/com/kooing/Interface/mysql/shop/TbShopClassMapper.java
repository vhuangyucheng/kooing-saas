package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopClass;

public interface TbShopClassMapper {
    int deleteByPrimaryKey(Integer scId);

    int insert(TbShopClass record);

    int insertSelective(TbShopClass record);

    TbShopClass selectByPrimaryKey(Integer scId);

    int updateByPrimaryKeySelective(TbShopClass record);

    int updateByPrimaryKey(TbShopClass record);
}