package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmInformSubject;

public interface TbCsmInformSubjectMapper {
    int deleteByPrimaryKey(Integer informSubjectId);

    int insert(TbCsmInformSubject record);

    int insertSelective(TbCsmInformSubject record);

    TbCsmInformSubject selectByPrimaryKey(Integer informSubjectId);

    int updateByPrimaryKeySelective(TbCsmInformSubject record);

    int updateByPrimaryKey(TbCsmInformSubject record);
}