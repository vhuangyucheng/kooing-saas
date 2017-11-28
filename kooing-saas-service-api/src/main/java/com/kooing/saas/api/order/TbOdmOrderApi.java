package com.kooing.saas.api.order;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.saas.persistent.model.member.TbUrsMember;
import com.kooing.saas.persistent.model.order.TbOdmOrder;
import com.kooing.saas.persistent.model.order.request.TbOdmOrderReq;
import com.kooing.saas.persistent.model.order.response.TbOdmOrderResp;
import lombok.Data;

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
     * @return      : code,message,pagination,list
     */
    @POST
    @Path("orderList")
    public CommResp<List<TbOdmOrderResp>> getOrderList(DataReq<TbOdmOrderReq> data) throws Exception;

    /**
     * @author      : kooing
     * @Date        : 2017/11/20 23:12
     * @Desription  : 添加订单接口
     * @return      : code,message
     */
    @POST
    @Path("addOrder")
    public CommResp<Object> addOrder(DataReq<TbOdmOrderReq> data) throws Exception;

    /**
     * @author      : kooing
     * @Date        : 2017/11/21 16:42
     * @Desription  : 修改订单接口,暂时用来修改订单状态，若后面业务有修改商品，再作维护
     * @return      : code,message
     */
    @POST
    @Path("updateOrder")
    public CommResp<Object> updateOrder(DataReq<TbOdmOrderReq> data) throws Exception;

    /**
     * @author      : kooing
     * @Date        : 2017/11/21 16:47
     * @Desription  : 删除订单
     * @return      : code,message
     */
    @POST
    @Path("deleteOrder")
    public CommResp<Object> deleteOrder(DataReq<TbOdmOrderReq> data) throws Exception;
}
