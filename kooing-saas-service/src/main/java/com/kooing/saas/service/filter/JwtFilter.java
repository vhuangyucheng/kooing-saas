package com.kooing.saas.service.filter;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.rpc.RpcContext;
import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.utils.Utility.JwtUtil;
import com.kooing.saas.persistent.dao.login.TbAccessMapper;
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
import org.springframework.stereotype.Service;

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
@Service(value = "jwtFilter")
public class JwtFilter implements ContainerRequestFilter {
    @Autowired
    TbRoleMemberMapper tbRoleMemberMapper;
    @Autowired
    TbRoleAccessMapper tbRoleAccessMapper;
    @Autowired
    TbAccessMapper tbAccessMapper;

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
        //把json数据流截取
        String json = this.inputStreamToString(requestContext.getEntityStream());
        JSONObject jsonObj = JSONObject.fromObject(json);
        String header_json = jsonObj.getString("header");
        JSONObject jsonObj2 = JSONObject.fromObject(header_json);
        String token = jsonObj2.getString("token");
        //检验令牌
        String memberId = JwtUtil.checkToken(token);
        //检验权限
        boolean accessFlag = isAccess(memberId, requestContext.getUriInfo().getPath());
        //归还json数据流
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
    boolean isAccess(String memberId, String path){
        /** 权限urlList*/
        List<TbRoleAccess> roleAccessesList = new ArrayList<>();
        List<Integer> urlTempList = new ArrayList<>();
        List<String> accessList ;
        boolean flag = false;
        //通过会员-角色表，获得角色list
        List<TbRoleMember> tbRoleMemberList = tbRoleMemberMapper.getRoleList(Integer.parseInt(memberId));
        //通过角色-权限表，获得权限list
        for(TbRoleMember tbRoleMember : tbRoleMemberList){
            roleAccessesList.addAll(tbRoleAccessMapper.getUrlList(tbRoleMember.getRoleId()));
        }
        //把权限list的id放在一个list，就不用多次查询数据库
        for(TbRoleAccess tbRoleAccess : roleAccessesList){
            urlTempList.add(tbRoleAccess.getAccessId());
        }
        accessList = tbAccessMapper.getUrlList(urlTempList);
        for(String access : accessList){
            if(access.equals(path)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
