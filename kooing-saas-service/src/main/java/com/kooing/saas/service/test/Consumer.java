package com.kooing.saas.service.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : kooing
 * @Date : 2017/10/18 - 15:26
 * @Desription :
 * @update by :
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext(new String[] {"classpath:spring/kooing-itgra-service-root.xml"});
        context1.start();

        try{
            Thread.sleep(10000000);
        }catch (Exception e){
            e.getStackTrace();
        }
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext(new String[] {"classpath:spring/kooing-itgra-consumer.xml"});
        context2.start();
        // 获取远程服务代理
        DemoService demoService = (DemoService)context2.getBean("demoService");
        // 执行远程方法
//        String hello = demoService.sayHello("world");
        // 显示调用结果
//        System.out.println( hello );

    }
}