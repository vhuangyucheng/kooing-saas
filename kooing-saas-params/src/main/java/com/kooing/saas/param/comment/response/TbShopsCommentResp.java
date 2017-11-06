package com.kooing.saas.param.comment.response;

import com.kooing.framework.param.common.response.BaseResp;
import lombok.Getter;
import lombok.Setter;

/**
* @Author	:kooing
* @Date	:Sat Nov 04 20:55:16 CST 2017
* @Desription	:tb_shops_comment 实体类
* @Modified	:
*/ 
@Setter
@Getter
public class TbShopsCommentResp extends BaseResp{
	/** 商品评论id*/
	private String goodsCommentId;
	/** 表唯一标识*/
	private String uuid;
	/** 商店id*/
	private String storeId;
	/** 商品id*/
	private String goodsId;
	/** 是否为虚假评论：1是，2不是*/
	private String commentVirtual;
	/** 会员id*/
	private String memberId;
	/** 会员头像*/
	private String memberAvatar;
	/** 评论图片*/
	private String commentPhoto;
	/** 商品评论*/
	private String commentContent;
}

