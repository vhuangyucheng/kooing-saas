package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbUrsAddress;

public interface TbUrsAddressMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(TbUrsAddress record);

    int insertSelective(TbUrsAddress record);

    TbUrsAddress selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(TbUrsAddress record);

    int updateByPrimaryKey(TbUrsAddress record);
}