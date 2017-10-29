package com.kooing.Interface.mysql.order;

import com.kooing.model.mysql.order.TbOdmOrderCommon;

public interface TbOdmOrderCommonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbOdmOrderCommon record);

    int insertSelective(TbOdmOrderCommon record);

    TbOdmOrderCommon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbOdmOrderCommon record);

    int updateByPrimaryKey(TbOdmOrderCommon record);
}