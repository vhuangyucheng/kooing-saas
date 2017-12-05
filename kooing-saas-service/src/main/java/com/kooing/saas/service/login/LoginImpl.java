package com.kooing.saas.service.login;

import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.framework.param.common.response.SuccessResp;
import com.kooing.framework.utils.Utility.JwtUtil;
import com.kooing.saas.api.login.LoginApi;
import com.kooing.saas.param.login.response.LoginResp;
import com.kooing.saas.persistent.dao.member.TbUrsMemberMapper;
import com.kooing.saas.persistent.model.member.TbUrsMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Object a = new LoginResp();
        return new SuccessResp<LoginResp>(loginResp);
    }
}
