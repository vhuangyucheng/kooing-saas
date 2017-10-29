package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsCommon;
import com.kooing.model.mysql.goods.TbGoodsCommonWithBLOBs;

public interface TbGoodsCommonMapper {
    int deleteByPrimaryKey(Integer goodsCommonid);

    int insert(TbGoodsCommonWithBLOBs record);

    int insertSelective(TbGoodsCommonWithBLOBs record);

    TbGoodsCommonWithBLOBs selectByPrimaryKey(Integer goodsCommonid);

    int updateByPrimaryKeySelective(TbGoodsCommonWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbGoodsCommonWithBLOBs record);

    int updateByPrimaryKey(TbGoodsCommon record);
}