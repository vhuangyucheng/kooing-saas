package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsImages;

public interface TbGoodsImagesMapper {
    int deleteByPrimaryKey(Integer goodsImageId);

    int insert(TbGoodsImages record);

    int insertSelective(TbGoodsImages record);

    TbGoodsImages selectByPrimaryKey(Integer goodsImageId);

    int updateByPrimaryKeySelective(TbGoodsImages record);

    int updateByPrimaryKey(TbGoodsImages record);
}