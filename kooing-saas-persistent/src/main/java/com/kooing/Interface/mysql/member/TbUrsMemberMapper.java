package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbUrsMember;
import com.kooing.model.mysql.member.TbUrsMemberWithBLOBs;

public interface TbUrsMemberMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(TbUrsMemberWithBLOBs record);

    int insertSelective(TbUrsMemberWithBLOBs record);

    TbUrsMemberWithBLOBs selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(TbUrsMemberWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbUrsMemberWithBLOBs record);

    int updateByPrimaryKey(TbUrsMember record);
}