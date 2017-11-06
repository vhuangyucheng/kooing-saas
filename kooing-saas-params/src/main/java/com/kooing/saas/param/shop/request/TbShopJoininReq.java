package com.kooing.saas.param.shop.request;

import com.kooing.framework.param.common.request.BaseReq;
import lombok.Getter;
import lombok.Setter;

/**
* @Author	:kooing
* @Date	:Sat Nov 04 20:50:47 CST 2017
* @Desription	:tb_shop_joinin 实体类
* @Modified	:
*/ 
@Setter
@Getter
public class TbShopJoininReq extends BaseReq{
	/** 主键*/
	private String shopJoininId;
	/** 会员标识*/
	private String memberId;
	/** 表唯一标识*/
	private String uuid;
	/** 店主用户名*/
	private String memberName;
	/** 店主联系电话*/
	private String memberPhone;
	/** 管理员账户*/
	private String memberAccount;
	/** 用户密码*/
	private String memberPassword;
	/** 店铺类型   0-个人， 1-企业*/
	private String storeType;
	/** 联系地址*/
	private String memberAddress;
	/** 联系人邮箱*/
	private String memberEmail;
	/** 身份证号码*/
	private String idcard;
	/** 身份证正面照*/
	private String idcardFront;
	/** 身份证反面照*/
	private String idcardBack;
	/** 身份证手执照*/
	private String idcardHandLicense;
	/** 店铺名称*/
	private String storeName;
	/** 认证状态 : 0：未认证 ；1：未通过认证 ；2认证成功；3:待审核*/
	private String authState;
	/** 认证时间*/
	private String authTime;
	/** 公司名称*/
	private String companyName;
	/** 所在地省ID*/
	private String companyProvinceId;
	/** 所在地市ID*/
	private String companyCityId;
	/** 公司地址*/
	private String companyAddress;
	/** 公司电话*/
	private String companyPhone;
}

