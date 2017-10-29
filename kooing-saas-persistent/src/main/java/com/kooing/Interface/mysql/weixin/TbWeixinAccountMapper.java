package com.kooing.Interface.mysql.weixin;

import com.kooing.model.mysql.weixin.TbWeixinAccount;

public interface TbWeixinAccountMapper {
    int deleteByPrimaryKey(Long accountId);

    int insert(TbWeixinAccount record);

    int insertSelective(TbWeixinAccount record);

    TbWeixinAccount selectByPrimaryKey(Long accountId);

    int updateByPrimaryKeySelective(TbWeixinAccount record);

    int updateByPrimaryKey(TbWeixinAccount record);
}