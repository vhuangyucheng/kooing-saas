package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbDistributionCommission;

public interface TbDistributionCommissionMapper {
    int deleteByPrimaryKey(Integer commissionId);

    int insert(TbDistributionCommission record);

    int insertSelective(TbDistributionCommission record);

    TbDistributionCommission selectByPrimaryKey(Integer commissionId);

    int updateByPrimaryKeySelective(TbDistributionCommission record);

    int updateByPrimaryKey(TbDistributionCommission record);
}