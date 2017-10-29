package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmConsultType;

public interface TbCsmConsultTypeMapper {
    int deleteByPrimaryKey(Integer ctId);

    int insert(TbCsmConsultType record);

    int insertSelective(TbCsmConsultType record);

    TbCsmConsultType selectByPrimaryKey(Integer ctId);

    int updateByPrimaryKeySelective(TbCsmConsultType record);

    int updateByPrimaryKeyWithBLOBs(TbCsmConsultType record);

    int updateByPrimaryKey(TbCsmConsultType record);
}