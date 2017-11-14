package com.kooing.saas.api.member;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.saas.persistent.model.member.TbUrsMember;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * @author : kooing
 * @date : 2017/11/9 - 11:08
 * @desription : 会员接口
 * @update by :
 */
@Path("member")
@Consumes({ContentType.APPLICATION_JSON_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
public interface TbUrsMemberApi {

    /**
     * @author      : kooing
     * @Date        : 2017/11/9 11:13
     * @Desription  : 获得会员列表
     * @return      : 会员列表
     */
    @POST
    @Path("memberList")
    public CommResp<List<TbUrsMember>> getMemberList(DataReq<TbUrsMember> data) throws Exception;

    /**
     * @author      : kooing
     * @Date        : 2017/11/9 15:04
     * @Desription  : 增加会员
     * @return      : null列表
     */
    @POST
    @Path("addMember")
    public CommResp<Object> addMember(DataReq<TbUrsMember> data) throws Exception;

    /**
     * @author      : kooing
     * @Date        : 2017/11/9 15:29
     * @Desription  : 根据主键删除
     * @return      : code,message,null
     */
    @POST
    @Path("deleteMember")
    public CommResp<Object> deleteMember(DataReq<TbUrsMember> data) throws Exception;

    /**
     * @author      : kooing
     * @Date        : 2017/11/9 15:40
     * @Desription  : 修改会员信息
     * @return      : code,message,null
     */
    @POST
    @Path("updataMember")
    public CommResp<Object> updataMember(DataReq<TbUrsMember> data) throws Exception;
}
