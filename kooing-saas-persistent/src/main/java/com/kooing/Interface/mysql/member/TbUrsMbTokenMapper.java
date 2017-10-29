package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbUrsMbToken;

public interface TbUrsMbTokenMapper {
    int deleteByPrimaryKey(Integer tokenId);

    int insert(TbUrsMbToken record);

    int insertSelective(TbUrsMbToken record);

    TbUrsMbToken selectByPrimaryKey(Integer tokenId);

    int updateByPrimaryKeySelective(TbUrsMbToken record);

    int updateByPrimaryKey(TbUrsMbToken record);
}