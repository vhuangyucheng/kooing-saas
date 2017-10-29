package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmCron;

public interface TbCsmCronMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbCsmCron record);

    int insertSelective(TbCsmCron record);

    TbCsmCron selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbCsmCron record);

    int updateByPrimaryKey(TbCsmCron record);
}