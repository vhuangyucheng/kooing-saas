package com.kooing.Interface.mysql.order;

import com.kooing.model.mysql.order.TbOdmArrivalNotice;

public interface TbOdmArrivalNoticeMapper {
    int deleteByPrimaryKey(Integer anId);

    int insert(TbOdmArrivalNotice record);

    int insertSelective(TbOdmArrivalNotice record);

    TbOdmArrivalNotice selectByPrimaryKey(Integer anId);

    int updateByPrimaryKeySelective(TbOdmArrivalNotice record);

    int updateByPrimaryKey(TbOdmArrivalNotice record);
}