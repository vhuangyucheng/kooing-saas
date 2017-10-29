package com.kooing.Interface.mysql.foods;

import com.kooing.model.mysql.foods.TbFoodsRecommend;

public interface TbFoodsRecommendMapper {
    int deleteByPrimaryKey(Long recommendId);

    int insert(TbFoodsRecommend record);

    int insertSelective(TbFoodsRecommend record);

    TbFoodsRecommend selectByPrimaryKey(Long recommendId);

    int updateByPrimaryKeySelective(TbFoodsRecommend record);

    int updateByPrimaryKey(TbFoodsRecommend record);
}