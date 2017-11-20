package com.kooing.saas.persistent.model.order.response;

import com.kooing.saas.persistent.model.order.TbOdmOrder;
import com.kooing.saas.persistent.model.order.TbOdmOrderGoods;
import lombok.Data;

import java.util.List;

/**
 * @author : kooing
 * @date : 2017/11/20 - 19:32
 * @desription : 订单类包装的响应类
 * @update by :
 */
@Data
public class TbOdmOrderResp extends TbOdmOrder {
    /** 订单货物列表*/
    private List<TbOdmOrderGoods> goodsList;
}
