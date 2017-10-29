package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbUrsTrslog;

public interface TbUrsTrslogMapper {
    int deleteByPrimaryKey(Integer trsId);

    int insert(TbUrsTrslog record);

    int insertSelective(TbUrsTrslog record);

    TbUrsTrslog selectByPrimaryKey(Integer trsId);

    int updateByPrimaryKeySelective(TbUrsTrslog record);

    int updateByPrimaryKey(TbUrsTrslog record);
}