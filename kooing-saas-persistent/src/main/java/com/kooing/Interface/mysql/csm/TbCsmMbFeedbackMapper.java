package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmMbFeedback;

public interface TbCsmMbFeedbackMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbCsmMbFeedback record);

    int insertSelective(TbCsmMbFeedback record);

    TbCsmMbFeedback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbCsmMbFeedback record);

    int updateByPrimaryKey(TbCsmMbFeedback record);
}