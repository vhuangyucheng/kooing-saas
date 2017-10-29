package com.kooing.Interface.mysql.activity;

import com.kooing.model.mysql.activity.TbActivityRegMRuleGift;

public interface TbActivityRegMRuleGiftMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(TbActivityRegMRuleGift record);

    int insertSelective(TbActivityRegMRuleGift record);

    TbActivityRegMRuleGift selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(TbActivityRegMRuleGift record);

    int updateByPrimaryKeyWithBLOBs(TbActivityRegMRuleGift record);

    int updateByPrimaryKey(TbActivityRegMRuleGift record);
}