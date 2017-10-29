package com.kooing.Interface.mysql.activity;

import com.kooing.model.mysql.activity.TbAdminActivityRuleShop;

public interface TbAdminActivityRuleShopMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(TbAdminActivityRuleShop record);

    int insertSelective(TbAdminActivityRuleShop record);

    TbAdminActivityRuleShop selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(TbAdminActivityRuleShop record);

    int updateByPrimaryKey(TbAdminActivityRuleShop record);
}