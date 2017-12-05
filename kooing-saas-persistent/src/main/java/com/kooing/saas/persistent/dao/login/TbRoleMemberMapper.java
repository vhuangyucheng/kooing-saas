package com.kooing.saas.persistent.dao.login;

import com.kooing.saas.persistent.model.login.TbRoleMember;
import com.kooing.saas.persistent.model.member.TbUrsMember;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbRoleMemberMapper {
    int deleteByPrimaryKey(Long recId);

    int insert(TbRoleMember record);

    int insertSelective(TbRoleMember record);

    TbRoleMember selectByPrimaryKey(Long recId);

    int updateByPrimaryKeySelective(TbRoleMember record);

    int updateByPrimaryKey(TbRoleMember record);

    List<TbRoleMember> getRoleList(int member);
}