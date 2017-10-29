package com.kooing.Interface.mysql.foods;

import com.kooing.model.mysql.foods.TbFoodsType;

public interface TbFoodsTypeMapper {
    int deleteByPrimaryKey(Integer ftId);

    int insert(TbFoodsType record);

    int insertSelective(TbFoodsType record);

    TbFoodsType selectByPrimaryKey(Integer ftId);

    int updateByPrimaryKeySelective(TbFoodsType record);

    int updateByPrimaryKey(TbFoodsType record);
}