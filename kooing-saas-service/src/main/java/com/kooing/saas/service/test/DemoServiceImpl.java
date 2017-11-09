package com.kooing.saas.service.test;

import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.framework.param.common.response.SuccessResp;
import com.kooing.saas.persistent.dao.member.TbUrsMemberMapper;
import com.kooing.saas.persistent.model.member.TbUrsMember;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;


/**
 * @author : kooing
 * @Date : 2017/10/18 - 15:03
 * @Desription :
 * @update by
 */
@Slf4j
public class DemoServiceImpl implements DemoService {
    @Resource
    TbUrsMemberMapper tbUrsMemberMapper;

    @Override
    public CommResp<List<TbUrsMember>> sayHello(DataReq<TbUrsMember> data) throws Exception{
//        if(true){
//            throw new CommonException("-1","test");
//        }
        PageHelper.startPage(1, 4);
        List<TbUrsMember> list = tbUrsMemberMapper.getMemberList(data.getBody());
        PageInfo page = new PageInfo(list);
        long a = page.getTotal();
        int b = page.getPages();
        log.info(">>>>>>>>>" + a);
        log.info(">>>>>>>>>" + b);
        return new SuccessResp<List<TbUrsMember>>("0", "ok", list);
    }
}
