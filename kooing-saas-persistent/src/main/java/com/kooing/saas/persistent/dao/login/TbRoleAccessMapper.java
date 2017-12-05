package com.kooing.saas.persistent.dao.login;

import com.kooing.saas.persistent.model.login.TbRoleAccess;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbRoleAccessMapper {
    int deleteByPrimaryKey(Long recId);

    int insert(TbRoleAccess record);

    int insertSelective(TbRoleAccess record);

    TbRoleAccess selectByPrimaryKey(Long recId);

    int updateByPrimaryKeySelective(TbRoleAccess record);

    int updateByPrimaryKey(TbRoleAccess record);

    List<TbRoleAccess> getUrlList(Integer roleId);
}