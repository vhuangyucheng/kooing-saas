package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmInformSubjectType;

public interface TbCsmInformSubjectTypeMapper {
    int deleteByPrimaryKey(Integer informTypeId);

    int insert(TbCsmInformSubjectType record);

    int insertSelective(TbCsmInformSubjectType record);

    TbCsmInformSubjectType selectByPrimaryKey(Integer informTypeId);

    int updateByPrimaryKeySelective(TbCsmInformSubjectType record);

    int updateByPrimaryKey(TbCsmInformSubjectType record);
}