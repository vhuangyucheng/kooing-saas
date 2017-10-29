package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmConsult;

public interface TbCsmConsultMapper {
    int deleteByPrimaryKey(Integer consultId);

    int insert(TbCsmConsult record);

    int insertSelective(TbCsmConsult record);

    TbCsmConsult selectByPrimaryKey(Integer consultId);

    int updateByPrimaryKeySelective(TbCsmConsult record);

    int updateByPrimaryKey(TbCsmConsult record);
}