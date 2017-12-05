package com.kooing.saas.service.test;

import com.kooing.framework.utils.Utility.JwtUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import lombok.extern.slf4j.Slf4j;


import java.lang.reflect.Method;
import java.security.Key;
import java.util.Date;

/**
 * @author : kooing
 * @Date : 2017/10/18 - 15:35
 * @Desription :
 * @update by :
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
//        String token = JwtUtil.getToken(2);
//        log.info(token);
//        String id = JwtUtil.checkToken("dddd");
//        log.info(id);
        try{
            Class tbRoleMember =Class.forName("com.kooing.saas.persistent.model.login.TbRoleMember");
            Object tbRoleMemberObject = tbRoleMember.newInstance();
            Class tbRoleMemberMapper =Class.forName("com.kooing.saas.persistent.dao.login.TbRoleMemberMapper");
            Object tbRoleMemberMapperObject = tbRoleMember.newInstance();
            Method tbRoleMemberSet = tbRoleMember.getDeclaredMethod("setMemberId", new Class[]{Integer.class});
            tbRoleMemberSet.invoke(tbRoleMemberObject, 1);
            log.info(tbRoleMemberObject.toString());
            Method selectByPrimaryKey = tbRoleMemberMapper.getDeclaredMethod("findRole", new Class[]{int.class});
            tbRoleMemberObject = selectByPrimaryKey.invoke(tbRoleMemberMapperObject,1);
            log.info(tbRoleMemberObject.toString());
        }catch (Exception e){
            log.error(e.toString());
        }
    }

}
