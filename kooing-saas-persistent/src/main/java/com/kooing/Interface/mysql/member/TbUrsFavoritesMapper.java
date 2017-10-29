package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbUrsFavorites;

public interface TbUrsFavoritesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUrsFavorites record);

    int insertSelective(TbUrsFavorites record);

    TbUrsFavorites selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUrsFavorites record);

    int updateByPrimaryKey(TbUrsFavorites record);
}