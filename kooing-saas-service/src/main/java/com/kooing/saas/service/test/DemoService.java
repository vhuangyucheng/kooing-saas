package com.kooing.saas.service.test;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author : kooing
 * @Date : 2017/10/18 - 15:01
 * @Desription :
 * @update by :
 */
@Path("users")
public interface DemoService {
    @GET
    @Path("register")
    @Produces({ ContentType.APPLICATION_JSON_UTF_8 })
    String sayHello(String name) throws Exception;
}
