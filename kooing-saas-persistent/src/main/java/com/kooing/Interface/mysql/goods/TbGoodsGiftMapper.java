package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsGift;

public interface TbGoodsGiftMapper {
    int deleteByPrimaryKey(Integer giftId);

    int insert(TbGoodsGift record);

    int insertSelective(TbGoodsGift record);

    TbGoodsGift selectByPrimaryKey(Integer giftId);

    int updateByPrimaryKeySelective(TbGoodsGift record);

    int updateByPrimaryKey(TbGoodsGift record);
}