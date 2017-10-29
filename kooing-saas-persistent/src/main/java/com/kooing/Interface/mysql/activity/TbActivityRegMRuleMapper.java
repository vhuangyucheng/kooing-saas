package com.kooing.Interface.mysql.activity;

import com.kooing.model.mysql.activity.TbActivityRegMRule;

public interface TbActivityRegMRuleMapper {
    int deleteByPrimaryKey(Integer ruleId);

    int insert(TbActivityRegMRule record);

    int insertSelective(TbActivityRegMRule record);

    TbActivityRegMRule selectByPrimaryKey(Integer ruleId);

    int updateByPrimaryKeySelective(TbActivityRegMRule record);

    int updateByPrimaryKey(TbActivityRegMRule record);
}