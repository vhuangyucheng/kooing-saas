package com.kooing.saas.service.member;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.request.HeaderReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.framework.param.common.response.PageUtil;
import com.kooing.framework.param.common.response.Pagination;
import com.kooing.framework.param.common.response.SuccessResp;
import com.kooing.saas.api.member.TbUrsMemberApi;
import com.kooing.saas.persistent.dao.login.TbRoleMemberMapper;
import com.kooing.saas.persistent.dao.member.TbUrsMemberMapper;
import com.kooing.saas.persistent.model.member.TbUrsMember;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author : kooing
 * @date : 2017/11/9 - 11:17
 * @desription : 实现会员接口
 * @update by :
 */
@Slf4j
@Service(value = "tbUerMemberImpl")
public class TbUrsMemberImpl implements TbUrsMemberApi {
    @Autowired
    TbUrsMemberMapper tbUrsMemberMapper;

    @Override
    public CommResp<List<TbUrsMember>> getMemberList(DataReq<TbUrsMember> data) throws Exception {
        PageUtil.startPage(data);
        List<TbUrsMember> list = tbUrsMemberMapper.getMemberList(data.getBody());
        Pagination pagination = new Pagination(list);
        return new SuccessResp<List<TbUrsMember>>("0", "ok", pagination, list);
    }

    @Override
    public CommResp<Object> addMember(DataReq<TbUrsMember> data) throws Exception {
        TbUrsMember tbUrsMember = data.getBody();
        tbUrsMember.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
        tbUrsMember.setMemberRegisterTime(new Date(System.currentTimeMillis()));
        tbUrsMemberMapper.insertSelective(tbUrsMember);
        return new SuccessResp<Object>(null);
    }

    @Override
    public CommResp<Object> deleteMember(DataReq<TbUrsMember> data) throws Exception {
        tbUrsMemberMapper.deleteByPrimaryKey(data.getBody().getMemberId());
        return new SuccessResp<Object>(null);
    }

    @Override
    public CommResp<Object> updataMember(DataReq<TbUrsMember> data) throws Exception {
        tbUrsMemberMapper.updateByPrimaryKeySelective(data.getBody());
        return new SuccessResp<Object>(null);
    }
}
