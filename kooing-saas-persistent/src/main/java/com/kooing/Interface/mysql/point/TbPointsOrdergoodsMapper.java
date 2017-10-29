package com.kooing.Interface.mysql.point;

import com.kooing.model.mysql.point.TbPointsOrdergoods;

public interface TbPointsOrdergoodsMapper {
    int deleteByPrimaryKey(Integer pointRecid);

    int insert(TbPointsOrdergoods record);

    int insertSelective(TbPointsOrdergoods record);

    TbPointsOrdergoods selectByPrimaryKey(Integer pointRecid);

    int updateByPrimaryKeySelective(TbPointsOrdergoods record);

    int updateByPrimaryKey(TbPointsOrdergoods record);
}