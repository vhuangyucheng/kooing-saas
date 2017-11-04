package com.kooing.saas.service.test;

import java.util.ArrayList;
import java.util.List;
import com.kooing.framework.param.common.response.SuccessResp;

/**
 * @author : kooing
 * @Date : 2017/10/18 - 15:03
 * @Desription :
 * @update by :
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> sayHello(String name) throws Exception{
//        if(true){
//            throw new CommonException("-1","test");
//        }
        List<String> a = new ArrayList<String>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        return a;
    }
}
