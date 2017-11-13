package com.kooing.saas.persistent.model.goods.response;

import com.kooing.saas.persistent.model.goods.TbGoodsClass;
import lombok.Data;

import java.util.List;

/**
 * @author : kooing
 * @date : 2017/11/13 - 12:20
 * @desription : TbGoodsClass 包装的响应类
 * @update by :
 */
@Data
public class TbGoodsClassResp extends TbGoodsClass {
    /** 子类标签list*/
    private List<TbGoodsClassResp> childList;
}
