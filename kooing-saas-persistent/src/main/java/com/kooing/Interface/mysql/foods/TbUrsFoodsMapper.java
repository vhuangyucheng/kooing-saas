package com.kooing.Interface.mysql.foods;

import com.kooing.model.mysql.foods.TbUrsFoods;

public interface TbUrsFoodsMapper {
    int deleteByPrimaryKey(Integer frId);

    int insert(TbUrsFoods record);

    int insertSelective(TbUrsFoods record);

    TbUrsFoods selectByPrimaryKey(Integer frId);

    int updateByPrimaryKeySelective(TbUrsFoods record);

    int updateByPrimaryKey(TbUrsFoods record);
}