package com.kooing.saas.api.login;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.saas.param.login.response.LoginResp;
import com.kooing.saas.persistent.model.member.TbUrsMember;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author : kooing
 * @date : 2017/12/4 - 14:49
 * @desription : 登陆接口
 * @update by :
 */
@Path("login")
@Consumes({ContentType.APPLICATION_JSON_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
public interface LoginApi {

    /**
     * @author      : kooing
     * @Date        : 2017/12/4 14:51
     * @Desription  : 登陆接口
     * @return      :
     */
    @POST
    @Path("login")
    public CommResp<LoginResp> memberLogin(DataReq<TbUrsMember> data) throws Exception;
}
