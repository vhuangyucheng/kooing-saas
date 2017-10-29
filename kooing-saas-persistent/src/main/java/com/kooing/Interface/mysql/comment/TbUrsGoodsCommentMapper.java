package com.kooing.Interface.mysql.comment;

import com.kooing.model.mysql.comment.TbUrsGoodsComment;

public interface TbUrsGoodsCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUrsGoodsComment record);

    int insertSelective(TbUrsGoodsComment record);

    TbUrsGoodsComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUrsGoodsComment record);

    int updateByPrimaryKeyWithBLOBs(TbUrsGoodsComment record);

    int updateByPrimaryKey(TbUrsGoodsComment record);
}