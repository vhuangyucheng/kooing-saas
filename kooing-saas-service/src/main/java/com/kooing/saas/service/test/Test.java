package com.kooing.saas.service.test;

import lombok.extern.slf4j.Slf4j;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * @author : kooing
 * @Date : 2017/10/18 - 15:35
 * @Desription :
 * @update by :
 */
@Slf4j
public class Test {
    public static void main(String[] args) throws Exception {
        String a = "123456";
        log.info(a.substring(2));
        log.info(a.substring(2,4));
        log.info(a);
    }
}
