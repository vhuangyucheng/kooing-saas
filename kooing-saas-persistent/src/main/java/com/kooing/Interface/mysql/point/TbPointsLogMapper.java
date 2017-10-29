package com.kooing.Interface.mysql.point;

import com.kooing.model.mysql.point.TbPointsLog;

public interface TbPointsLogMapper {
    int deleteByPrimaryKey(Integer plId);

    int insert(TbPointsLog record);

    int insertSelective(TbPointsLog record);

    TbPointsLog selectByPrimaryKey(Integer plId);

    int updateByPrimaryKeySelective(TbPointsLog record);

    int updateByPrimaryKey(TbPointsLog record);
}