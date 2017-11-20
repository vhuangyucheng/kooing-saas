package com.kooing.saas.api.order;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.saas.persistent.model.member.TbUrsMember;
import com.kooing.saas.persistent.model.order.TbOdmOrder;
import com.kooing.saas.persistent.model.order.request.TbOdmOrderReq;
import com.kooing.saas.persistent.model.order.response.TbOdmOrderResp;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * @author : kooing
 * @date : 2017/11/14 - 22:11
 * @desription :TbOdmOrderApi接口
 * @update by :
 */
@Path("order")
@Consumes({ContentType.APPLICATION_JSON_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
public interface TbOdmOrderApi {

    /**
     * @author      : kooing
     * @Date        : 2017/11/14 22:18
     * @Desription  : 返回订单列表
     * @return      :
     */
    @POST
    @Path("/orderList")
    public CommResp<List<TbOdmOrderResp>> getOrderList(DataReq<TbOdmOrderReq> data) throws Exception;

    /**
     * @author      : kooing
     * @Date        : 2017/11/20 23:12
     * @Desription  : 添加订单接口 todo
     * @return      :
     */
    @POST
    @Path("addOrder")
    public CommResp<Object> addOrder(DataReq<TbOdmOrderReq> data) throws Exception;
}
