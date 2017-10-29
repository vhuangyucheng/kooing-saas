package com.kooing.saas.service.test;

/**
 * @author : kooing
 * @Date : 2017/10/18 - 15:03
 * @Desription :
 * @update by :
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) throws Exception{
//        if(true){
//            throw new CommonException("-1","test");
//        }
        return "hello " ;
    }
}
