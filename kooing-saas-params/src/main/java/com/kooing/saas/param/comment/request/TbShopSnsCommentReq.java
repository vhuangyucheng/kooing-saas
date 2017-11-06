package com.kooing.saas.param.comment.request;

import com.kooing.framework.param.common.request.BaseReq;
import lombok.Getter;
import lombok.Setter;

/**
* @Author	:kooing
* @Date	:Sat Nov 04 20:54:18 CST 2017
* @Desription	:tb_shop_sns_comment 实体类
* @Modified	:
*/ 
@Setter
@Getter
public class TbShopSnsCommentReq extends BaseReq{
	/** 店铺动态评论id*/
	private String scommId;
	/** 表唯一标识*/
	private String uuid;
	/** 店铺id*/
	private String storeId;
	/** 评论内容*/
	private String scommContent;
	/** 会员名称*/
	private String scommMembername;
	/** 会员id*/
	private String scommMemberid;
	/** 评论时间*/
	private String scommTime;
	/** 更新时间*/
	private String updateTime;
	/** 是否为虚假评论:1是，2不是*/
	private String scommVirtual;
}

