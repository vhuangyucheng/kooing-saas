package com.kooing.saas.param.shop.response;

import com.kooing.framework.param.common.response.BaseResp;
import lombok.Getter;
import lombok.Setter;

/**
* @Author	:kooing
* @Date	:Sat Nov 04 20:49:32 CST 2017
* @Desription	:tb_shop 实体类
* @Modified	:
*/ 
@Setter
@Getter
public class TbShopResp extends BaseResp{
	/** 主键*/
	private String storeId;
	/** 表唯一标识*/
	private String uuid;
	/** 店铺名称*/
	private String storeName;
	/** 店铺等级*/
	private String gradeId;
	/** 会员id*/
	private String memberId;
	/** 会员名称*/
	private String memberName;
	/** 店铺分类*/
	private String scId;
	/** 店铺公司名称*/
	private String storeCompanyName;
	/** 详细地区*/
	private String storeAddress;
	/** 店铺排序*/
	private String storeSort;
	/** 店铺关闭原因*/
	private String storeCloseInfo;
	/** 店铺横幅*/
	private String storeBanner;
	/** 店铺头像*/
	private String storeAvatar;
	/** QQ*/
	private String storeQq;
	/** 店铺微信*/
	private String storeWechat;
	/** 商家电话*/
	private String storePhone;
	/** 店铺拥有标签*/
	private String storeKeywords;
	/** 店铺装修标签--手机端*/
	private String storeDescription;
	/** 邮政编码*/
	private String storeZip;
	/** 注册时间*/
	private String storeRegisterTime;
	/** 店铺关闭时间*/
	private String storeEndTime;
	/** 店铺logo*/
	private String storeLabel;
	/** 店铺简介*/
	private String storeIntroduction;
	/** 主营商品*/
	private String storeZy;
	/** 店铺二级域名*/
	private String storeDomain;
	/** 二级域名修改次数*/
	private String storeDomainTimes;
	/** 店铺当前主题*/
	private String storeTheme;
	/** 店铺信用*/
	private String storeCredit;
	/** 店铺商品总数量*/
	private String goodsNumber;
	/** 店铺销量*/
	private String storeSales;
}

