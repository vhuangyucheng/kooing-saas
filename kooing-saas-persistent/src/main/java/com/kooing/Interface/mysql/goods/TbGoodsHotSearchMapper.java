package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsHotSearch;

public interface TbGoodsHotSearchMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbGoodsHotSearch record);

    int insertSelective(TbGoodsHotSearch record);

    TbGoodsHotSearch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbGoodsHotSearch record);

    int updateByPrimaryKey(TbGoodsHotSearch record);
}