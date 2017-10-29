package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmComplain;

public interface TbCsmComplainMapper {
    int deleteByPrimaryKey(Integer complainId);

    int insert(TbCsmComplain record);

    int insertSelective(TbCsmComplain record);

    TbCsmComplain selectByPrimaryKey(Integer complainId);

    int updateByPrimaryKeySelective(TbCsmComplain record);

    int updateByPrimaryKey(TbCsmComplain record);
}