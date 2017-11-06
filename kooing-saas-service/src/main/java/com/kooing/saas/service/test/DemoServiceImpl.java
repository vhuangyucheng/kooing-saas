package com.kooing.saas.service.test;

import java.util.ArrayList;
import java.util.List;

import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.framework.param.common.response.SuccessResp;
import com.kooing.saas.persistent.dao.member.TbUrsMemberMapper;
import com.kooing.saas.persistent.model.member.TbUrsMember;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author : kooing
 * @Date : 2017/10/18 - 15:03
 * @Desription :
 * @update by :
 */
public class DemoServiceImpl implements DemoService {
    @Resource
    TbUrsMemberMapper tbUrsMemberMapper;

    @Override
    public CommResp<List<TbUrsMember>> sayHello(DataReq<TbUrsMember> data) throws Exception{
//        if(true){
//            throw new CommonException("-1","test");
//        }
        List<TbUrsMember> list = new ArrayList<>();
        TbUrsMember a = tbUrsMemberMapper.selectByPrimaryKey(new Long((long)3));
        TbUrsMember c = data.getBody();
        list.add(a);
        list.add(c);

        return new SuccessResp<List<TbUrsMember>>("0", "ok", list);
    }
}
