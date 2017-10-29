package com.kooing.Interface.mysql.activity;

import com.kooing.model.mysql.activity.TbAdminActivityRuleGoodtype;

public interface TbAdminActivityRuleGoodtypeMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(TbAdminActivityRuleGoodtype record);

    int insertSelective(TbAdminActivityRuleGoodtype record);

    TbAdminActivityRuleGoodtype selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(TbAdminActivityRuleGoodtype record);

    int updateByPrimaryKey(TbAdminActivityRuleGoodtype record);
}