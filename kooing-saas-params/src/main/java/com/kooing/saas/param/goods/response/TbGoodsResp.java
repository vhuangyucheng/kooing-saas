package com.kooing.saas.param.goods.response;

import com.kooing.framework.param.common.response.BaseResp;
import lombok.Getter;
import lombok.Setter;

/**
* @Author	:kooing
* @Date	:Sat Nov 04 16:52:36 CST 2017
* @Desription	:tb_goods 实体类
* @Modified	:
*/ 
@Setter
@Getter
public class TbGoodsResp extends BaseResp {
	/** 主键*/
	private String goodsId;
	/** 表唯一标识*/
	private String uuid;
	/** 商品公共表id*/
	private String goodsCommonid;
	/** 商品名称（+规格名称）*/
	private String goodsName;
	/** 商品广告词*/
	private String goodsJingle;
	/** 店铺id*/
	private String storeId;
	/** 店铺名称*/
	private String storeName;
	/** 商品分类id*/
	private String gcId;
	/** 一级分类id*/
	private String gcId1;
	/** 二级分类id*/
	private String gcId2;
	/** 三级分类id*/
	private String gcId3;
	/** 商品价格*/
	private String goodsPrice;
	/** 商品促销价格*/
	private String goodsPromotionPrice;
	/** 库存报警值*/
	private String goodsStorageAlarm;
	/** 商品库存*/
	private String goodsStorage;
	/** 商品主图*/
	private String goodsImage;
	/** 商品状态 0下架，1正常，2删除，10违规（禁售）*/
	private String goodsState;
	/** 商品审核 1通过，0未通过，10审核中*/
	private String goodsVerify;
	/** 评价数*/
	private String evaluationCount;
	/** 好评星级*/
	private String evaluationGoodStar;
	/** 是否为虚拟商品 1是，0否*/
	private String isVirtual;
	/** 收藏数量*/
	private String goodsCollect;
	/** 点赞数量*/
	private String goodsLikenum;
	/** 分享数量*/
	private String goodsShare;
	/** 是否为打折商品 0打折，1不打折*/
	private String isPromotion;
}

