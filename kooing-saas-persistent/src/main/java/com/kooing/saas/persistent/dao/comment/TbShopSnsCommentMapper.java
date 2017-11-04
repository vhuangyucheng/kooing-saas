package com.kooing.saas.persistent.dao.comment;

import com.kooing.saas.persistent.model.comment.TbShopSnsComment;

public interface TbShopSnsCommentMapper {
    int deleteByPrimaryKey(Long scommId);

    int insert(TbShopSnsComment record);

    int insertSelective(TbShopSnsComment record);

    TbShopSnsComment selectByPrimaryKey(Long scommId);

    int updateByPrimaryKeySelective(TbShopSnsComment record);

    int updateByPrimaryKeyWithBLOBs(TbShopSnsComment record);

    int updateByPrimaryKey(TbShopSnsComment record);
}