package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmInform;

public interface TbCsmInformMapper {
    int deleteByPrimaryKey(Integer informId);

    int insert(TbCsmInform record);

    int insertSelective(TbCsmInform record);

    TbCsmInform selectByPrimaryKey(Integer informId);

    int updateByPrimaryKeySelective(TbCsmInform record);

    int updateByPrimaryKey(TbCsmInform record);
}