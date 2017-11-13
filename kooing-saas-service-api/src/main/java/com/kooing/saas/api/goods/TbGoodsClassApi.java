package com.kooing.saas.api.goods;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.kooing.framework.exception.CommonException;
import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.saas.persistent.model.goods.TbGoodsClass;
import com.kooing.saas.persistent.model.goods.response.TbGoodsClassResp;
import org.apache.ibatis.annotations.Param;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * @author : kooing
 * @date : 2017/11/13 - 12:37
 * @desription : TbGoodsClass接口
 * @update by :
 */
@Path("goodsClass")
@Consumes({ContentType.APPLICATION_JSON_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
public interface TbGoodsClassApi {

    /**
     * @author      : kooing
     * @Date        : 2017/11/13 12:38
     * @Desription  : 返回分类列表
     * @return      : code,message,List
     */
    @POST
    @Path("goodsClassList")
    public CommResp<List<TbGoodsClassResp>> getGoodsClassList(DataReq<TbGoodsClass> data) throws Exception;

    /**
     * @author      : kooing
     * @Date        : 2017/11/13 16:28
     * @Desription  : 增加一个分类
     * @return      : code,message,null
     */
    @POST
    @Path("addGoodsClass")
    public CommResp<Object> addGoodsClass(DataReq<TbGoodsClass> data) throws Exception;

    /**
     * @author      : kooing
     * @Date        : 2017/11/13 19:35
     * @Desription  : 分类内容修改
     * @return      : code,message,null
     */
    @POST
    @Path("updateGoodsClass")
    public CommResp<Object> updateGoodsClass(DataReq<TbGoodsClass> data) throws Exception;

    /**
     * @author      : kooing
     * @Date        : 2017/11/13 19:42
     * @Desription  : 根据gcId删除
     * @return      : code,message,null
     */
    @POST
    @Path("deleteGoodsClass")
    public CommResp<Object> deleteGoodsClass(DataReq<TbGoodsClass> data) throws Exception;
}
