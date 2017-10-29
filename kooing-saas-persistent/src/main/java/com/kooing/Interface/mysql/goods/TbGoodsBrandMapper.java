package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsBrand;

public interface TbGoodsBrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(TbGoodsBrand record);

    int insertSelective(TbGoodsBrand record);

    TbGoodsBrand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(TbGoodsBrand record);

    int updateByPrimaryKey(TbGoodsBrand record);
}