package com.kooing.Interface.mysql.point;

import com.kooing.model.mysql.point.TbPointsCart;

public interface TbPointsCartMapper {
    int deleteByPrimaryKey(Integer pcartId);

    int insert(TbPointsCart record);

    int insertSelective(TbPointsCart record);

    TbPointsCart selectByPrimaryKey(Integer pcartId);

    int updateByPrimaryKeySelective(TbPointsCart record);

    int updateByPrimaryKey(TbPointsCart record);
}