package com.kooing.saas.persistent.dao.order;

import com.kooing.saas.persistent.model.order.TbOdmOrder;
import com.kooing.saas.persistent.model.order.request.TbOdmOrderReq;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TbOdmOrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(TbOdmOrder record);

    int insertSelective(TbOdmOrder record);

    TbOdmOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(TbOdmOrder record);

    int updateByPrimaryKey(TbOdmOrder record);

    List<TbOdmOrder> getOrderList(TbOdmOrderReq tbOdmOrderReq);
}