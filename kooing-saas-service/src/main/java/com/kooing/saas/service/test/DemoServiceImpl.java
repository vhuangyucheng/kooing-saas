package com.kooing.saas.service.test;

import java.util.ArrayList;
import java.util.List;

import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.framework.param.common.response.SuccessResp;
import com.kooing.saas.persistent.model.member.TbUrsMember;

/**
 * @author : kooing
 * @Date : 2017/10/18 - 15:03
 * @Desription :
 * @update by :
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public CommResp<List<TbUrsMember>> sayHello(DataReq<TbUrsMember> data) throws Exception{
//        if(true){
//            throw new CommonException("-1","test");
//        }
        TbUrsMember a = new TbUrsMember();
        a.setIdcard("32232");
        TbUrsMember b = new TbUrsMember();
        a.setIdcard("aaaaa");
        List<TbUrsMember> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        TbUrsMember c = data.getBody();
        list.add(c);

        return new SuccessResp<List<TbUrsMember>>("0", "ok", list);
    }
}
