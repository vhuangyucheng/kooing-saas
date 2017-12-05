package com.kooing.saas.service.filter;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.rpc.RpcContext;
import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.utils.Utility.JwtUtil;
import com.kooing.saas.persistent.dao.login.TbRoleAccessMapper;
import com.kooing.saas.persistent.dao.login.TbRoleMemberMapper;
import com.kooing.saas.persistent.model.login.TbAccess;
import com.kooing.saas.persistent.model.login.TbRole;
import com.kooing.saas.persistent.model.login.TbRoleAccess;
import com.kooing.saas.persistent.model.login.TbRoleMember;
import com.kooing.saas.persistent.model.member.TbUrsMember;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * @author : kooing
 * @Date : 2017/10/23 - 22:22
 * @Desription : Jwt过滤器
 * @update by :
 */
@Slf4j
public class JwtFilter implements ContainerRequestFilter {
    @Autowired
    TbRoleMemberMapper tbRoleMemberMapper;
    @Autowired
    TbRoleAccessMapper tbRoleAccessMapper;
    @Autowired
    TbAccess tbAccess;

    /**
     * @return :
     * @author : kooing
     * @Date : 2017/12/5 20:11
     * @Desription : 过滤器
     */
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        log.info(">>>>>>>>>>>>>");
        log.info(requestContext.getUriInfo().getPath());
        //如果是登陆页面，就不需要令牌，放行
        if ("/login/login".equals(requestContext.getUriInfo().getPath())) {
            return;
        }
        String json = this.inputStreamToString(requestContext.getEntityStream());
        JSONObject jsonObj = JSONObject.fromObject(json);
        String header_json = jsonObj.getString("header");
        JSONObject jsonObj2 = JSONObject.fromObject(header_json);
        String token = jsonObj2.getString("token");
        String memberId = JwtUtil.checkToken(token);
        boolean accessFlag = isAccess(memberId);
        requestContext.setEntityStream(new ByteArrayInputStream(json.getBytes()));
    }

    /**
     * @author : kooing
     * @Date : 2017/12/5 20:11
     * @Desription : inputStream转String
     * @return :
     */
    private String inputStreamToString(InputStream in) throws IOException {
        StringBuffer out = new StringBuffer();
        byte[] b = new byte[4096];
        for (int n; (n = in.read(b)) != -1; ) {
            out.append(new String(b, 0, n));
        }
        return out.toString();
    }


    /**
     * @author      : kooing
     * @Date        : 2017/12/5 21:39
     * @Desription  : 获得权限urlList，在判断是否有权限
     * @return      :boolean
     */
    boolean isAccess(String memberId){
        /** 权限urlList*/
        List<TbRoleAccess> tempList = new ArrayList<>();
        List<Integer> urlTempList = new ArrayList<>();
        List<String> accessList = new ArrayList<>();
        boolean flag;
        List<TbRoleMember> tbRoleMemberList = tbRoleMemberMapper.getRoleList(Integer.parseInt(memberId));
        for(TbRoleMember tbRoleMember : tbRoleMemberList){
            tempList.addAll(tbRoleAccessMapper.getUrlList(tbRoleMember.getRoleId()));
        }
        for(TbRoleAccess tbRoleAccess : tempList){
            urlTempList.add(tbRoleAccess.getAccessId());
        }
    }
}
