package com.kooing.Interface.mysql.weixin;

import com.kooing.model.mysql.weixin.TbWeixinUsers;

public interface TbWeixinUsersMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(TbWeixinUsers record);

    int insertSelective(TbWeixinUsers record);

    TbWeixinUsers selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(TbWeixinUsers record);

    int updateByPrimaryKey(TbWeixinUsers record);
}