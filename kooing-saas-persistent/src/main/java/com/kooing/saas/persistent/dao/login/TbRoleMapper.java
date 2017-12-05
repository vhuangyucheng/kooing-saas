package com.kooing.saas.persistent.dao.login;

import com.kooing.saas.persistent.model.login.TbRole;
import org.springframework.stereotype.Repository;

@Repository
public interface TbRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);
}