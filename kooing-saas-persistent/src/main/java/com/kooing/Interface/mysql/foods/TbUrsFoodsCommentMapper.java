package com.kooing.Interface.mysql.foods;

import com.kooing.model.mysql.foods.TbUrsFoodsComment;

public interface TbUrsFoodsCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUrsFoodsComment record);

    int insertSelective(TbUrsFoodsComment record);

    TbUrsFoodsComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUrsFoodsComment record);

    int updateByPrimaryKeyWithBLOBs(TbUrsFoodsComment record);

    int updateByPrimaryKey(TbUrsFoodsComment record);
}