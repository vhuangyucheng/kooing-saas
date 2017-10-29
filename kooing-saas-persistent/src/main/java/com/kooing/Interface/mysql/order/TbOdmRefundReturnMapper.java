package com.kooing.Interface.mysql.order;

import com.kooing.model.mysql.order.TbOdmRefundReturn;

public interface TbOdmRefundReturnMapper {
    int deleteByPrimaryKey(Integer refundId);

    int insert(TbOdmRefundReturn record);

    int insertSelective(TbOdmRefundReturn record);

    TbOdmRefundReturn selectByPrimaryKey(Integer refundId);

    int updateByPrimaryKeySelective(TbOdmRefundReturn record);

    int updateByPrimaryKey(TbOdmRefundReturn record);
}