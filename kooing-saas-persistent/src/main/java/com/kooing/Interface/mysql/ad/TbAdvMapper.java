package com.kooing.Interface.mysql.ad;

import com.kooing.model.mysql.ad.TbAdv;

public interface TbAdvMapper {
    int deleteByPrimaryKey(Integer advId);

    int insert(TbAdv record);

    int insertSelective(TbAdv record);

    TbAdv selectByPrimaryKey(Integer advId);

    int updateByPrimaryKeySelective(TbAdv record);

    int updateByPrimaryKey(TbAdv record);
}