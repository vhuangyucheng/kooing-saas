package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopDecorationBlock;

public interface TbShopDecorationBlockMapper {
    int deleteByPrimaryKey(Integer blockId);

    int insert(TbShopDecorationBlock record);

    int insertSelective(TbShopDecorationBlock record);

    TbShopDecorationBlock selectByPrimaryKey(Integer blockId);

    int updateByPrimaryKeySelective(TbShopDecorationBlock record);

    int updateByPrimaryKeyWithBLOBs(TbShopDecorationBlock record);

    int updateByPrimaryKey(TbShopDecorationBlock record);
}