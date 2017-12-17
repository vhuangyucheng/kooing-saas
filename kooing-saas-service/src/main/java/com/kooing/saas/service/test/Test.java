package com.kooing.saas.service.test;

import com.kooing.framework.utils.Utility.JwtUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;


import java.lang.reflect.Method;
import java.security.Key;
import java.util.*;

/**
 * @author : kooing
 * @Date : 2017/10/18 - 15:35
 * @Desription :
 * @update by :
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
    }

}
