package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbShopWaybill;

public interface TbShopWaybillMapper {
    int deleteByPrimaryKey(Integer storeWaybillId);

    int insert(TbShopWaybill record);

    int insertSelective(TbShopWaybill record);

    TbShopWaybill selectByPrimaryKey(Integer storeWaybillId);

    int updateByPrimaryKeySelective(TbShopWaybill record);

    int updateByPrimaryKey(TbShopWaybill record);
}