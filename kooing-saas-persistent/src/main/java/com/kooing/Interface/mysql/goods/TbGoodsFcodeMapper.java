package com.kooing.Interface.mysql.goods;

import com.kooing.model.mysql.goods.TbGoodsFcode;

public interface TbGoodsFcodeMapper {
    int deleteByPrimaryKey(Integer fcId);

    int insert(TbGoodsFcode record);

    int insertSelective(TbGoodsFcode record);

    TbGoodsFcode selectByPrimaryKey(Integer fcId);

    int updateByPrimaryKeySelective(TbGoodsFcode record);

    int updateByPrimaryKey(TbGoodsFcode record);
}