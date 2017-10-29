package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbUrsDeallog;

public interface TbUrsDeallogMapper {
    int deleteByPrimaryKey(Integer acctTrsId);

    int insert(TbUrsDeallog record);

    int insertSelective(TbUrsDeallog record);

    TbUrsDeallog selectByPrimaryKey(Integer acctTrsId);

    int updateByPrimaryKeySelective(TbUrsDeallog record);

    int updateByPrimaryKey(TbUrsDeallog record);
}