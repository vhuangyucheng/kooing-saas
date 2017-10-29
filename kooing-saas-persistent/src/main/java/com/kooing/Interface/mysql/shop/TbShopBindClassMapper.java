package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopBindClass;

public interface TbShopBindClassMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(TbShopBindClass record);

    int insertSelective(TbShopBindClass record);

    TbShopBindClass selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(TbShopBindClass record);

    int updateByPrimaryKey(TbShopBindClass record);
}