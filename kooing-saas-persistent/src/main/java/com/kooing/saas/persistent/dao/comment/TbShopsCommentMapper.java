package com.kooing.saas.persistent.dao.comment;

import com.kooing.saas.persistent.model.comment.TbShopsComment;

public interface TbShopsCommentMapper {
    int deleteByPrimaryKey(Long goodsCommentId);

    int insert(TbShopsComment record);

    int insertSelective(TbShopsComment record);

    TbShopsComment selectByPrimaryKey(Long goodsCommentId);

    int updateByPrimaryKeySelective(TbShopsComment record);

    int updateByPrimaryKeyWithBLOBs(TbShopsComment record);

    int updateByPrimaryKey(TbShopsComment record);
}