package com.kooing.saas.service.filter;

import com.kooing.framework.utils.Utility.JwtUtil;
import net.sf.json.JSONObject;
import redis.clients.jedis.Jedis;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author : kooing
 * @date : 2017/12/7 - 12:25
 * @desription :
 * @update by :
 */
public class RedisFIlter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        //如果是登陆页面，就不需要令牌，放行
        if ("/login/login".equals(requestContext.getUriInfo().getPath())) {
            return;
        }
        //把json数据流截取
        String json = this.inputStreamToString(requestContext.getEntityStream());
        JSONObject jsonObj = JSONObject.fromObject(json);
        String header_json = jsonObj.getString("header");
        JSONObject jsonObj2 = JSONObject.fromObject(header_json);
        String token = jsonObj2.getString("token");
        //检验令牌
        String memberId = JwtUtil.checkToken(token);
        //检验权限
        boolean accessFlag = isAccess(memberId, requestContext.getUriInfo().getPath());
        //归还json数据流
        requestContext.setEntityStream(new ByteArrayInputStream(json.getBytes()));

    }

    /**
     * @author : kooing
     * @Date : 2017/12/5 20:11
     * @Desription : inputStream转String
     * @return :
     */
    private String inputStreamToString(InputStream in) throws IOException {
        StringBuffer out = new StringBuffer();
        byte[] b = new byte[4096];
        for (int n; (n = in.read(b)) != -1; ) {
            out.append(new String(b, 0, n));
        }
        return out.toString();
    }


    /**
     * @author      : kooing
     * @Date        : 2017/12/16 20:20
     * @Desription  : 验证令牌
     * @return      : boolean
     */
    private boolean isAccess(String memberId, String url){
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        List<String> urlList = jedis.lrange(memberId, 0, -1);
        return urlList.contains(url);
    }
}
