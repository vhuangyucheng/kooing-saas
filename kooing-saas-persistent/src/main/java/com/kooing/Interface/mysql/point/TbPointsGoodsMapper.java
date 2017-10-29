package com.kooing.Interface.mysql.point;

import com.kooing.model.mysql.point.TbPointsGoods;

public interface TbPointsGoodsMapper {
    int insert(TbPointsGoods record);

    int insertSelective(TbPointsGoods record);
}