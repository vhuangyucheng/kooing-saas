package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmHelp;

public interface TbCsmHelpMapper {
    int deleteByPrimaryKey(Integer helpId);

    int insert(TbCsmHelp record);

    int insertSelective(TbCsmHelp record);

    TbCsmHelp selectByPrimaryKey(Integer helpId);

    int updateByPrimaryKeySelective(TbCsmHelp record);

    int updateByPrimaryKeyWithBLOBs(TbCsmHelp record);

    int updateByPrimaryKey(TbCsmHelp record);
}