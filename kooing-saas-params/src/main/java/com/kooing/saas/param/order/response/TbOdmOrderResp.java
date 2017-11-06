package com.kooing.saas.param.order.response;

import com.kooing.framework.param.common.response.BaseResp;
import lombok.Getter;
import lombok.Setter;

/**
* @Author	:kooing
* @Date	:Sat Nov 04 20:47:22 CST 2017
* @Desription	:tb_odm_order 实体类
* @Modified	:
*/ 
@Setter
@Getter
public class TbOdmOrderResp extends BaseResp{
	/** 订单索引id*/
	private String orderId;
	/** 表唯一标识*/
	private String uuid;
	/** 订单编号*/
	private String orderSn;
	/** 支付单号*/
	private String paySn;
	/** 卖家店铺id*/
	private String storeId;
	/** 卖家店铺名称*/
	private String storeName;
	/** 卖家店铺logo*/
	private String storeLogo;
	/** 买家id*/
	private String buyerId;
	/** 买家姓名*/
	private String buyerName;
	/** 订单生成时间*/
	private String addTime;
	/** 支付方式名称代码*/
	private String paymentCode;
	/** 支付(付款)时间*/
	private String paymentTime;
	/** 要叠限折的的产品拿限折后的价钱，不叠加的拿原价，没有任何活动的拿销售价*/
	private String salesAmount;
	/** 运费*/
	private String freight;
	/** 评价状态 0未评价， 1已评价，2已过期未评价*/
	private String evaluation;
	/** 订单状态：0(已取消)10(默认):未付款;20:待发货;21:待收货;30:交易完成;31:交易关闭；*/
	private String orderState;
	/** 退款状态:0是无退款,1是部分退款,2是全部退款*/
	private String refundState;
	/** 退款金额*/
	private String refundAmount;
	/** 订单总价格*/
	private String orderAmount;
	/** 订单完成时间*/
	private String finishedTime;
	/** 订单留言*/
	private String orderMessage;
	/** 评价时间*/
	private String evalsellerTime;
	/** 订单评价*/
	private String evalsellerMessage;
	/** 确定收货时间*/
	private String shippingTime;
	/** 详细地址*/
	private String buyerAddress;
}

