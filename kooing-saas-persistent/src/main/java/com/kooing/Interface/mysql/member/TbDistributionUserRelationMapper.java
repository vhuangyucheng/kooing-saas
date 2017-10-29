package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbDistributionUserRelation;

public interface TbDistributionUserRelationMapper {
    int deleteByPrimaryKey(Integer distributionUserId);

    int insert(TbDistributionUserRelation record);

    int insertSelective(TbDistributionUserRelation record);

    TbDistributionUserRelation selectByPrimaryKey(Integer distributionUserId);

    int updateByPrimaryKeySelective(TbDistributionUserRelation record);

    int updateByPrimaryKey(TbDistributionUserRelation record);
}