package com.kooing.saas.persistent.model.order.request;

import com.kooing.saas.persistent.model.order.TbOdmOrder;
import com.kooing.saas.persistent.model.order.TbOdmOrderGoods;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author : kooing
 * @date : 2017/11/14 - 21:51
 * @desription :tbOdmOrder包装类
 * @update by :
 */
@Data
public class TbOdmOrderReq extends TbOdmOrder {
    /** 订单查询的时间区间*/
    private Date beginTime;
    private Date endTime;
    /** 订单货物列表*/
    private List<TbOdmOrderGoods> goodsList;
}
