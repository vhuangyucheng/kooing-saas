package com.kooing.saas.persistent.model.goods.request;

import com.kooing.saas.persistent.model.goods.TbGoods;
import lombok.Data;

/**
 * @author : kooing
 * @date : 2017/12/17 - 12:10
 * @desription :TbGoods包装类
 * @update by :
 */
@Data
public class TbGoodsReq extends TbGoods {
    private String orderBy;
    private String desc;
}
