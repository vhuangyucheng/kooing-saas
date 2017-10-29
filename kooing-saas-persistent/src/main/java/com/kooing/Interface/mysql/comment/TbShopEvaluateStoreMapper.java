package com.kooing.Interface.mysql.comment;

import com.kooing.model.mysql.comment.TbShopEvaluateStore;

public interface TbShopEvaluateStoreMapper {
    int deleteByPrimaryKey(Integer sevalId);

    int insert(TbShopEvaluateStore record);

    int insertSelective(TbShopEvaluateStore record);

    TbShopEvaluateStore selectByPrimaryKey(Integer sevalId);

    int updateByPrimaryKeySelective(TbShopEvaluateStore record);

    int updateByPrimaryKey(TbShopEvaluateStore record);
}