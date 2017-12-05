package com.kooing.saas.param.login.response;

import com.kooing.framework.param.common.response.BaseResp;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : kooing
 * @date : 2017/12/4 - 15:15
 * @desription :登陆返回的响应类
 * @update by :
 */
@Setter
@Getter
public class LoginResp extends BaseResp {
    private Long memberId;
    private String token;
}
