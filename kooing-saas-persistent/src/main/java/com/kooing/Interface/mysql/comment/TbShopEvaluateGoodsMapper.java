package com.kooing.Interface.mysql.comment;

import com.kooing.model.mysql.comment.TbShopEvaluateGoods;

public interface TbShopEvaluateGoodsMapper {
    int deleteByPrimaryKey(Integer gevalId);

    int insert(TbShopEvaluateGoods record);

    int insertSelective(TbShopEvaluateGoods record);

    TbShopEvaluateGoods selectByPrimaryKey(Integer gevalId);

    int updateByPrimaryKeySelective(TbShopEvaluateGoods record);

    int updateByPrimaryKey(TbShopEvaluateGoods record);
}