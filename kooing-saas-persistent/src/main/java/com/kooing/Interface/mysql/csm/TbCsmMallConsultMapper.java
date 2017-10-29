package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmMallConsult;

public interface TbCsmMallConsultMapper {
    int deleteByPrimaryKey(Integer mcId);

    int insert(TbCsmMallConsult record);

    int insertSelective(TbCsmMallConsult record);

    TbCsmMallConsult selectByPrimaryKey(Integer mcId);

    int updateByPrimaryKeySelective(TbCsmMallConsult record);

    int updateByPrimaryKey(TbCsmMallConsult record);
}