package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmMallConsultType;

public interface TbCsmMallConsultTypeMapper {
    int deleteByPrimaryKey(Integer mctId);

    int insert(TbCsmMallConsultType record);

    int insertSelective(TbCsmMallConsultType record);

    TbCsmMallConsultType selectByPrimaryKey(Integer mctId);

    int updateByPrimaryKeySelective(TbCsmMallConsultType record);

    int updateByPrimaryKeyWithBLOBs(TbCsmMallConsultType record);

    int updateByPrimaryKey(TbCsmMallConsultType record);
}