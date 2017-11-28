package com.kooing.saas.persistent.dao.order;

import com.kooing.saas.persistent.model.order.TbOdmOrderGoods;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TbOdmOrderGoodsMapper {
    int deleteByPrimaryKey(Long recId);

    int insert(TbOdmOrderGoods record);

    int insertSelective(TbOdmOrderGoods record);

    TbOdmOrderGoods selectByPrimaryKey(Long recId);

    int updateByPrimaryKeySelective(TbOdmOrderGoods record);

    int updateByPrimaryKey(TbOdmOrderGoods record);

    List<TbOdmOrderGoods> getGoodsList(Integer orderId);

    int deleteByOrderSn(String orderSn);
}