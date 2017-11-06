package com.kooing.saas.param.order.response;

import com.kooing.framework.param.common.response.BaseResp;
import lombok.Getter;
import lombok.Setter;

/**
* @Author	:kooing
* @Date	:Sat Nov 04 20:47:08 CST 2017
* @Desription	:tb_odm_order_goods 实体类
* @Modified	:
*/ 
@Setter
@Getter
public class TbOdmOrderGoodsResp extends BaseResp{
	/** 订单商品表索引id*/
	private String recId;
	/** 表唯一标识*/
	private String uuid;
	/** 订单id*/
	private String orderId;
	/** 商品id*/
	private String goodsId;
	/** 商品名称*/
	private String goodsName;
	/** 商品价格*/
	private String goodsPrice;
	/** 商品促销价格*/
	private String goodsPromotionPrice;
	/** 商品数量*/
	private String goodsNum;
	/** 店铺ID*/
	private String storeId;
	/** 买家ID*/
	private String buyerId;
	/** 是否打折 0打折，1不打折*/
	private String isPromotion;
}

