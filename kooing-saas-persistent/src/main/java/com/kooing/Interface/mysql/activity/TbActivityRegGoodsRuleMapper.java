package com.kooing.Interface.mysql.activity;

import com.kooing.model.mysql.activity.TbActivityRegGoodsRule;

public interface TbActivityRegGoodsRuleMapper {
    int deleteByPrimaryKey(Integer ruleId);

    int insert(TbActivityRegGoodsRule record);

    int insertSelective(TbActivityRegGoodsRule record);

    TbActivityRegGoodsRule selectByPrimaryKey(Integer ruleId);

    int updateByPrimaryKeySelective(TbActivityRegGoodsRule record);

    int updateByPrimaryKey(TbActivityRegGoodsRule record);
}