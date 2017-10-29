package com.kooing.Interface.mysql.logistics;

import com.kooing.model.mysql.logistics.TbLgmWaybill;

public interface TbLgmWaybillMapper {
    int deleteByPrimaryKey(Integer waybillId);

    int insert(TbLgmWaybill record);

    int insertSelective(TbLgmWaybill record);

    TbLgmWaybill selectByPrimaryKey(Integer waybillId);

    int updateByPrimaryKeySelective(TbLgmWaybill record);

    int updateByPrimaryKey(TbLgmWaybill record);
}