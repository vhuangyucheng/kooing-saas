package com.kooing.Interface.mysql.foods;

import com.kooing.model.mysql.foods.TbUrsFoodsReply;

public interface TbUrsFoodsReplyMapper {
    int deleteByPrimaryKey(Long replyId);

    int insert(TbUrsFoodsReply record);

    int insertSelective(TbUrsFoodsReply record);

    TbUrsFoodsReply selectByPrimaryKey(Long replyId);

    int updateByPrimaryKeySelective(TbUrsFoodsReply record);

    int updateByPrimaryKey(TbUrsFoodsReply record);
}