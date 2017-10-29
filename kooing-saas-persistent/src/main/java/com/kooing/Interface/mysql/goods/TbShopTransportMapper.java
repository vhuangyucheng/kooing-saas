package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbShopTransport;

public interface TbShopTransportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbShopTransport record);

    int insertSelective(TbShopTransport record);

    TbShopTransport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbShopTransport record);

    int updateByPrimaryKey(TbShopTransport record);
}