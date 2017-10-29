package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbUrsVerify;

public interface TbUrsVerifyMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(TbUrsVerify record);

    int insertSelective(TbUrsVerify record);

    TbUrsVerify selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(TbUrsVerify record);

    int updateByPrimaryKey(TbUrsVerify record);
}