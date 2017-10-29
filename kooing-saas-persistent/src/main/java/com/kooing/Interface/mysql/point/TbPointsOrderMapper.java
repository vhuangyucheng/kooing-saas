package com.kooing.Interface.mysql.point;

import com.kooing.model.mysql.point.TbPointsOrder;

public interface TbPointsOrderMapper {
    int deleteByPrimaryKey(Integer pointOrderid);

    int insert(TbPointsOrder record);

    int insertSelective(TbPointsOrder record);

    TbPointsOrder selectByPrimaryKey(Integer pointOrderid);

    int updateByPrimaryKeySelective(TbPointsOrder record);

    int updateByPrimaryKey(TbPointsOrder record);
}