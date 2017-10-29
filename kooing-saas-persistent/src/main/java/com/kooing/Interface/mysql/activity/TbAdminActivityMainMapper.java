package com.kooing.Interface.mysql.activity;

import com.kooing.model.mysql.activity.TbAdminActivityMain;

public interface TbAdminActivityMainMapper {
    int deleteByPrimaryKey(Integer activityId);

    int insert(TbAdminActivityMain record);

    int insertSelective(TbAdminActivityMain record);

    TbAdminActivityMain selectByPrimaryKey(Integer activityId);

    int updateByPrimaryKeySelective(TbAdminActivityMain record);

    int updateByPrimaryKeyWithBLOBs(TbAdminActivityMain record);

    int updateByPrimaryKey(TbAdminActivityMain record);
}