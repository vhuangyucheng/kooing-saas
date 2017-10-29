package com.kooing.Interface.mysql.order;

import com.kooing.model.mysql.order.TbOdmRefundReason;

public interface TbOdmRefundReasonMapper {
    int deleteByPrimaryKey(Integer reasonId);

    int insert(TbOdmRefundReason record);

    int insertSelective(TbOdmRefundReason record);

    TbOdmRefundReason selectByPrimaryKey(Integer reasonId);

    int updateByPrimaryKeySelective(TbOdmRefundReason record);

    int updateByPrimaryKey(TbOdmRefundReason record);
}