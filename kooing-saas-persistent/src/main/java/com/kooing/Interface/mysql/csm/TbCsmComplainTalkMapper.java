package com.kooing.Interface.mysql.csm;

import com.kooing.model.mysql.csm.TbCsmComplainTalk;

public interface TbCsmComplainTalkMapper {
    int deleteByPrimaryKey(Integer talkId);

    int insert(TbCsmComplainTalk record);

    int insertSelective(TbCsmComplainTalk record);

    TbCsmComplainTalk selectByPrimaryKey(Integer talkId);

    int updateByPrimaryKeySelective(TbCsmComplainTalk record);

    int updateByPrimaryKey(TbCsmComplainTalk record);
}