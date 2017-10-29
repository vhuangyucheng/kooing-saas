package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbUrsBrowse;

public interface TbUrsBrowseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUrsBrowse record);

    int insertSelective(TbUrsBrowse record);

    TbUrsBrowse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUrsBrowse record);

    int updateByPrimaryKey(TbUrsBrowse record);
}