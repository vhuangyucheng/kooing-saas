package com.kooing.Interface.mysql.foods;

import com.kooing.model.mysql.foods.TbFoods;

public interface TbFoodsMapper {
    int deleteByPrimaryKey(Long foodsId);

    int insert(TbFoods record);

    int insertSelective(TbFoods record);

    TbFoods selectByPrimaryKey(Long foodsId);

    int updateByPrimaryKeySelective(TbFoods record);

    int updateByPrimaryKeyWithBLOBs(TbFoods record);

    int updateByPrimaryKey(TbFoods record);
}