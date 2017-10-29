package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmComplainSubject;

public interface TbCsmComplainSubjectMapper {
    int deleteByPrimaryKey(Integer complainSubjectId);

    int insert(TbCsmComplainSubject record);

    int insertSelective(TbCsmComplainSubject record);

    TbCsmComplainSubject selectByPrimaryKey(Integer complainSubjectId);

    int updateByPrimaryKeySelective(TbCsmComplainSubject record);

    int updateByPrimaryKey(TbCsmComplainSubject record);
}