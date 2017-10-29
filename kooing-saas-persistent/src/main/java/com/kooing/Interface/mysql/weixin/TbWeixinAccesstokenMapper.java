package com.kooing.Interface.mysql.weixin;

import com.kooing.model.mysql.weixin.TbWeixinAccesstoken;

public interface TbWeixinAccesstokenMapper {
    int deleteByPrimaryKey(Long akId);

    int insert(TbWeixinAccesstoken record);

    int insertSelective(TbWeixinAccesstoken record);

    TbWeixinAccesstoken selectByPrimaryKey(Long akId);

    int updateByPrimaryKeySelective(TbWeixinAccesstoken record);

    int updateByPrimaryKey(TbWeixinAccesstoken record);
}