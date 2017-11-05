package com.kooing.saas.service.test;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.saas.persistent.model.member.TbUrsMember;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author : kooing
 * @Date : 2017/10/18 - 15:01
 * @Desription :
 * @update by :
 */
@Path("users")
public interface DemoService {
    @POST
    @Path("register")
    @Consumes({ContentType.APPLICATION_JSON_UTF_8})
    @Produces({ContentType.APPLICATION_JSON_UTF_8})
    public CommResp<List<TbUrsMember>> sayHello(DataReq<TbUrsMember> data) throws Exception;
}
