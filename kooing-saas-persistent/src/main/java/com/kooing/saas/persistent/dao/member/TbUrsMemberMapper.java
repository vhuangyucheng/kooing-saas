package com.kooing.saas.persistent.dao.member;

import com.kooing.saas.persistent.model.member.TbUrsMember;
import org.springframework.stereotype.Repository;

@Repository
public interface TbUrsMemberMapper {
    int deleteByPrimaryKey(Long memberId);

    int insert(TbUrsMember record);

    int insertSelective(TbUrsMember record);

    TbUrsMember selectByPrimaryKey(Long memberId);

    int updateByPrimaryKeySelective(TbUrsMember record);

    int updateByPrimaryKeyWithBLOBs(TbUrsMember record);

    int updateByPrimaryKey(TbUrsMember record);
}