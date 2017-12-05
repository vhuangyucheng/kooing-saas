package com.kooing.saas.service.filter;

import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import com.alibaba.dubbo.remoting.exchange.Request;
import com.alibaba.dubbo.remoting.exchange.Response;
import lombok.extern.slf4j.Slf4j;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;
/**
 * @author : kooing
 * @date : 2017/12/5 - 16:10
 * @desription :
 * @update by :
 */
@Slf4j
public class Jwt2Filter implements Filter{


    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        log.info("<<<<<<<<<<<<");
        Request request = (Request) RpcContext.getContext().getRequest();
        Response response = (Response) RpcContext.getContext().getResponse();
        Method[] arr = invoker.getInterface().getDeclaredMethods();
        Method hereMethod = null;
        for (Method temp : arr) {
            if (temp.getName().equals(invocation.getMethodName())) {
                hereMethod = temp;
            }
        }
        Object[] obj = invocation.getArguments();
        log.info("filter invoker class: {}, method: {}", invoker.getUrl(), invocation.getMethodName());
        return invoker.invoke(invocation);
    }

}