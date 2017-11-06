package com.kooing.saas.param.goods.response;

import com.kooing.framework.param.common.response.BaseResp;
import lombok.Getter;
import lombok.Setter;

/**
* @Author	:kooing
* @Date	:Sat Nov 04 17:03:26 CST 2017
* @Desription	:tb_goods_class 实体类
* @Modified	:
*/ 
@Setter
@Getter
public class TbGoodsClassResp extends BaseResp{
	/** 主键*/
	private String gcId;
	/** 表唯一标识*/
	private String uuid;
	/** 分类名称*/
	private String gcName;
	/** 父ID*/
	private String gcParentId;
}

