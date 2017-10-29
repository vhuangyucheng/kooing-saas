package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbUrsSearch;

public interface TbUrsSearchMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUrsSearch record);

    int insertSelective(TbUrsSearch record);

    TbUrsSearch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUrsSearch record);

    int updateByPrimaryKey(TbUrsSearch record);
}