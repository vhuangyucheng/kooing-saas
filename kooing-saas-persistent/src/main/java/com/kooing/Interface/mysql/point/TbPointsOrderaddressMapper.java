package com.kooing.Interface.mysql.point;

import com.kooing.model.mysql.point.TbPointsOrderaddress;

public interface TbPointsOrderaddressMapper {
    int deleteByPrimaryKey(Integer pointOaid);

    int insert(TbPointsOrderaddress record);

    int insertSelective(TbPointsOrderaddress record);

    TbPointsOrderaddress selectByPrimaryKey(Integer pointOaid);

    int updateByPrimaryKeySelective(TbPointsOrderaddress record);

    int updateByPrimaryKey(TbPointsOrderaddress record);
}