package com.kooing.Interface.mysql.activity;

import com.kooing.model.mysql.activity.TbActivityReg;
import com.kooing.model.mysql.activity.TbActivityRegWithBLOBs;

public interface TbActivityRegMapper {
    int deleteByPrimaryKey(Integer regId);

    int insert(TbActivityRegWithBLOBs record);

    int insertSelective(TbActivityRegWithBLOBs record);

    TbActivityRegWithBLOBs selectByPrimaryKey(Integer regId);

    int updateByPrimaryKeySelective(TbActivityRegWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbActivityRegWithBLOBs record);

    int updateByPrimaryKey(TbActivityReg record);
}