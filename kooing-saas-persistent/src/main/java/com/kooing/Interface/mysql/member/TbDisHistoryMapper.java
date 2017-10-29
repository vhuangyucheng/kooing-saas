package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbDisHistory;

public interface TbDisHistoryMapper {
    int deleteByPrimaryKey(Integer historyId);

    int insert(TbDisHistory record);

    int insertSelective(TbDisHistory record);

    TbDisHistory selectByPrimaryKey(Integer historyId);

    int updateByPrimaryKeySelective(TbDisHistory record);

    int updateByPrimaryKey(TbDisHistory record);
}