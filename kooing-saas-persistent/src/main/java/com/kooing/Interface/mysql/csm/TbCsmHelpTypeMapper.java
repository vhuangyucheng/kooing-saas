package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmHelpType;

public interface TbCsmHelpTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(TbCsmHelpType record);

    int insertSelective(TbCsmHelpType record);

    TbCsmHelpType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(TbCsmHelpType record);

    int updateByPrimaryKey(TbCsmHelpType record);
}