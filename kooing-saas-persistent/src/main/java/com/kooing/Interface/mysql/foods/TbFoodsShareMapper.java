package com.kooing.Interface.mysql.foods;

import com.kooing.model.mysql.foods.TbFoodsShare;

public interface TbFoodsShareMapper {
    int deleteByPrimaryKey(Long fsId);

    int insert(TbFoodsShare record);

    int insertSelective(TbFoodsShare record);

    TbFoodsShare selectByPrimaryKey(Long fsId);

    int updateByPrimaryKeySelective(TbFoodsShare record);

    int updateByPrimaryKey(TbFoodsShare record);
}