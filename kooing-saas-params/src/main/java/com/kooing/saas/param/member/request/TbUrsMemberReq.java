package com.kooing.saas.param.member.request;

import com.kooing.framework.param.common.request.BaseReq;
import lombok.Getter;
import lombok.Setter;

/**
* @Author	:kooing
* @Date	:Sat Nov 04 20:58:26 CST 2017
* @Desription	:tb_urs_member 实体类
* @Modified	:
*/ 
@Setter
@Getter
public class TbUrsMemberReq extends BaseReq{
	/** 会员id*/
	private String memberId;
	/** 表唯一标识*/
	private String uuid;
	/** 会员名称*/
	private String memberName;
	/** 真实姓名*/
	private String memberTruename;
	/** 会员头像*/
	private String memberAvatar;
	/** 会员性别*/
	private String memberSex;
	/** 身份证*/
	private String idcard;
	/** 生日*/
	private String memberBirthday;
	/** 账号密码*/
	private String memberPassword;
	/** 支付密码*/
	private String memberPayPassword;
	/** 会员邮箱*/
	private String memberEmail;
	/** 0未绑定1已绑定-邮箱*/
	private String memberEmailBind;
	/** 手机号*/
	private String memberMobile;
	/** 0未绑定1已绑定-手机*/
	private String memberMobileBind;
	/** QQ*/
	private String memberQq;
	/** 登录次数*/
	private String memberLoginNum;
	/** 注册时间*/
	private String memberRegisterTime;
	/** 当前登录时间*/
	private String memberLoginTime;
	/** 上次登录时间*/
	private String memberOldLoginTime;
	/** 当前登录ip*/
	private String memberLoginIp;
	/** 此次登出时间*/
	private String memberExitTime;
	/** 微信互联id*/
	private String memberWechatOpenid;
	/** 微信账号相关信息*/
	private String memberWechatInfo;
	/** qq互联id*/
	private String memberQqOpenid;
	/** qq账号相关信息*/
	private String memberQqInfo;
	/** 新浪相关id*/
	private String memberSinaOpenid;
	/** 新浪相关信息*/
	private String memberSinaInfo;
	/** 会员积分*/
	private String memberPoints;
	/** 地区ID*/
	private String memberAreaid;
	/** 城市ID*/
	private String memberCityid;
	/** 省份ID*/
	private String memberProvinceid;
	/** 会员经验值*/
	private String memberExppoints;
	/** 会员等级 1：普通会员 2：金牌会员 3：钻石会员*/
	private String memberGrade;
	/** 店铺id*/
	private String storeId;
	/** 设备号*/
	private String clientid;
	/** 身份证正面照*/
	private String idcardFront;
	/** 身份证背面照片*/
	private String idcardBack;
	/** 手执身份证照片*/
	private String idcardHandLicense;
	/** 详细地址*/
	private String memberAddress;
	/** 是否为虚假用户：0是，1不是*/
	private String memberVirtual;
}

