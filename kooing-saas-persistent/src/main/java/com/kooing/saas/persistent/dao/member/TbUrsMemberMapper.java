package com.kooing.saas.persistent.dao.member;

import com.kooing.saas.persistent.model.member.TbUrsMember;
import com.kooing.saas.persistent.model.member.TbUrsMemberWithBLOBs;

public interface TbUrsMemberMapper {
    int deleteByPrimaryKey(Long memberId);

    int insert(TbUrsMemberWithBLOBs record);

    int insertSelective(TbUrsMemberWithBLOBs record);

    TbUrsMemberWithBLOBs selectByPrimaryKey(Long memberId);

    int updateByPrimaryKeySelective(TbUrsMemberWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbUrsMemberWithBLOBs record);

    int updateByPrimaryKey(TbUrsMember record);
}