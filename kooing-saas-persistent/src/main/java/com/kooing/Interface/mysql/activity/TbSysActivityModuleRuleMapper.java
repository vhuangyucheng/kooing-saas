package com.kooing.Interface.mysql.activity;

import com.kooing.model.mysql.activity.TbSysActivityModuleRule;

public interface TbSysActivityModuleRuleMapper {
    int insert(TbSysActivityModuleRule record);

    int insertSelective(TbSysActivityModuleRule record);
}