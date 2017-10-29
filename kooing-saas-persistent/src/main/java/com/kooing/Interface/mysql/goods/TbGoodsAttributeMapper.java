package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsAttribute;

public interface TbGoodsAttributeMapper {
    int deleteByPrimaryKey(Integer attrId);

    int insert(TbGoodsAttribute record);

    int insertSelective(TbGoodsAttribute record);

    TbGoodsAttribute selectByPrimaryKey(Integer attrId);

    int updateByPrimaryKeySelective(TbGoodsAttribute record);

    int updateByPrimaryKeyWithBLOBs(TbGoodsAttribute record);

    int updateByPrimaryKey(TbGoodsAttribute record);
}