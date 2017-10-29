package com.kooing.Interface.mysql.ad;

import com.kooing.model.mysql.ad.TbAdvPosition;

public interface TbAdvPositionMapper {
    int deleteByPrimaryKey(Integer positionId);

    int insert(TbAdvPosition record);

    int insertSelective(TbAdvPosition record);

    TbAdvPosition selectByPrimaryKey(Integer positionId);

    int updateByPrimaryKeySelective(TbAdvPosition record);

    int updateByPrimaryKey(TbAdvPosition record);
}