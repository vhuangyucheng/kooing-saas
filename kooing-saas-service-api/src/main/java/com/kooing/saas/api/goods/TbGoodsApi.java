package com.kooing.saas.api.goods;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.saas.persistent.model.goods.TbGoods;
import com.kooing.saas.persistent.model.member.TbUrsMember;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * @author : kooing
 * @date : 2017/11/9 - 20:57
 * @desription : tb_goods表接口
 * @update by :
 */
@Path("goods")
@Consumes({ContentType.APPLICATION_JSON_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
public interface TbGoodsApi {

    /**
     * @author      : kooing
     * @Date        : 2017/11/9 20:58
     * @Desription  : 添加商品
     * @return      : code,message,null
     */
    @POST
    @Path("addGoods")
    public CommResp<List<TbGoods>> addGoods(DataReq<TbGoods> data) throws Exception;

    /**
     * @author      : kooing
     * @Date        : 2017/11/9 21:00
     * @Desription  : 返回商品列表
     * @return      : code,message,pagination,list
     */
    @POST
    @Path("GoodsList")
    public CommResp<List<TbGoods>> goodsList(DataReq<TbGoods> data) throws Exception;
}
