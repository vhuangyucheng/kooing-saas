package com.kooing.Interface.mysql.activity;

import com.kooing.model.mysql.activity.TbSysActivityModuleRole;

public interface TbSysActivityModuleRoleMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(TbSysActivityModuleRole record);

    int insertSelective(TbSysActivityModuleRole record);

    TbSysActivityModuleRole selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(TbSysActivityModuleRole record);

    int updateByPrimaryKey(TbSysActivityModuleRole record);
}