package com.kooing.Interface.mysql.logistics;

import com.kooing.model.mysql.logistics.TbLgmExpress;

public interface TbLgmExpressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbLgmExpress record);

    int insertSelective(TbLgmExpress record);

    TbLgmExpress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbLgmExpress record);

    int updateByPrimaryKey(TbLgmExpress record);
}