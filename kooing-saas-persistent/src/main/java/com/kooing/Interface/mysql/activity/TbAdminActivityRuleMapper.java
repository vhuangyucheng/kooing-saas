package com.kooing.Interface.mysql.activity;

import com.kooing.model.mysql.activity.TbAdminActivityRule;
import com.kooing.model.mysql.activity.TbAdminActivityRuleWithBLOBs;

public interface TbAdminActivityRuleMapper {
    int deleteByPrimaryKey(Integer ruleId);

    int insert(TbAdminActivityRuleWithBLOBs record);

    int insertSelective(TbAdminActivityRuleWithBLOBs record);

    TbAdminActivityRuleWithBLOBs selectByPrimaryKey(Integer ruleId);

    int updateByPrimaryKeySelective(TbAdminActivityRuleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbAdminActivityRuleWithBLOBs record);

    int updateByPrimaryKey(TbAdminActivityRule record);
}