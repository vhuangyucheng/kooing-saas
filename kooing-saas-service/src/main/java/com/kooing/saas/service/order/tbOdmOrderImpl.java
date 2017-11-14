package com.kooing.saas.service.order;

import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.saas.api.order.TbOdmOrderApi;
import com.kooing.saas.persistent.dao.order.TbOdmOrderMapper;
import com.kooing.saas.persistent.model.order.TbOdmOrder;
import com.kooing.saas.persistent.model.order.request.TbOdmOrderReq;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : kooing
 * @date : 2017/11/14 - 22:26
 * @desription :
 * @update by :
 */
public class TbOdmOrderImpl implements TbOdmOrderApi {
    @Autowired
    TbOdmOrderMapper tbOdmOrderMapper;

    @Override
    public CommResp<List<TbOdmOrder>> getOrderList(DataReq<TbOdmOrderReq> data) throws Exception {
        return null;
    }
}
