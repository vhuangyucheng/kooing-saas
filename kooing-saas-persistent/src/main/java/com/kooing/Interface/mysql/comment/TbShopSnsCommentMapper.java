package com.kooing.Interface.mysql.comment;

import com.kooing.model.mysql.comment.TbShopSnsComment;

public interface TbShopSnsCommentMapper {
    int deleteByPrimaryKey(Integer scommId);

    int insert(TbShopSnsComment record);

    int insertSelective(TbShopSnsComment record);

    TbShopSnsComment selectByPrimaryKey(Integer scommId);

    int updateByPrimaryKeySelective(TbShopSnsComment record);

    int updateByPrimaryKeyWithBLOBs(TbShopSnsComment record);

    int updateByPrimaryKey(TbShopSnsComment record);
}