package com.kooing.Interface.mysql.foods;

import com.kooing.model.mysql.foods.TbFoodsProperty;

public interface TbFoodsPropertyMapper {
    int deleteByPrimaryKey(Long fpId);

    int insert(TbFoodsProperty record);

    int insertSelective(TbFoodsProperty record);

    TbFoodsProperty selectByPrimaryKey(Long fpId);

    int updateByPrimaryKeySelective(TbFoodsProperty record);

    int updateByPrimaryKey(TbFoodsProperty record);
}