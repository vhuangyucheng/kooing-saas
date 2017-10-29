package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbShopTransportExtend;

public interface TbShopTransportExtendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbShopTransportExtend record);

    int insertSelective(TbShopTransportExtend record);

    TbShopTransportExtend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbShopTransportExtend record);

    int updateByPrimaryKey(TbShopTransportExtend record);
}