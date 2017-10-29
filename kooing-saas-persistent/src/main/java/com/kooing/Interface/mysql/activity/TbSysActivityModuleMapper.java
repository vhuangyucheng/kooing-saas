package com.kooing.Interface.mysql.activity;

import com.kooing.model.mysql.activity.TbSysActivityModule;

public interface TbSysActivityModuleMapper {
    int deleteByPrimaryKey(Integer moduleId);

    int insert(TbSysActivityModule record);

    int insertSelective(TbSysActivityModule record);

    TbSysActivityModule selectByPrimaryKey(Integer moduleId);

    int updateByPrimaryKeySelective(TbSysActivityModule record);

    int updateByPrimaryKeyWithBLOBs(TbSysActivityModule record);

    int updateByPrimaryKey(TbSysActivityModule record);
}