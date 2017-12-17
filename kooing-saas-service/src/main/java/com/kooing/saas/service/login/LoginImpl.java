package com.kooing.saas.service.login;

import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.framework.param.common.response.SuccessResp;
import com.kooing.framework.utils.Utility.JwtUtil;
import com.kooing.saas.api.login.LoginApi;
import com.kooing.saas.param.login.response.LoginResp;
import com.kooing.saas.persistent.dao.login.TbAccessMapper;
import com.kooing.saas.persistent.dao.login.TbRoleAccessMapper;
import com.kooing.saas.persistent.dao.login.TbRoleMemberMapper;
import com.kooing.saas.persistent.dao.member.TbUrsMemberMapper;
import com.kooing.saas.persistent.model.login.TbRoleAccess;
import com.kooing.saas.persistent.model.login.TbRoleMember;
import com.kooing.saas.persistent.model.member.TbUrsMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : kooing
 * @date : 2017/12/4 - 14:54
 * @desription :
 * @update by :
 */
@Service(value = "loginImpl")
public class LoginImpl implements LoginApi {
    @Autowired
    TbUrsMemberMapper tbUrsMemberMapper;
    @Autowired
    TbAccessMapper tbAccessMapper;

    @Override
    public CommResp<LoginResp> memberLogin(DataReq<TbUrsMember> data) throws Exception {
        TbUrsMember tbUrsMember = tbUrsMemberMapper.findMember(data.getBody());
        if(tbUrsMember == null){
            return new SuccessResp<LoginResp>("1", "账号密码错误", null);
        }
        String token = JwtUtil.getToken(tbUrsMember.getMemberId().intValue());
        //暂定是放token和memberId
        LoginResp loginResp = new LoginResp();
        loginResp.setToken(token);
        loginResp.setMemberId(tbUrsMember.getMemberId());
        List<String> urlList = tbAccessMapper.getAccessUrl(tbUrsMember.getMemberId().intValue());
        setRedis(tbUrsMember.getMemberId(), urlList);
        return new SuccessResp<LoginResp>(loginResp);
    }



    /**
     * @author      : kooing
     * @Date        : 2017/12/8 11:27
     * @Desription  : 权限urlList，根据memberid放进redis
     * @return      :
     */
    public void setRedis(Long memberId, List<String> urlList){
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //存储数据到列表中
        for( String url : urlList){
            jedis.lpush(String.valueOf(memberId), url);
        }
    }
}
