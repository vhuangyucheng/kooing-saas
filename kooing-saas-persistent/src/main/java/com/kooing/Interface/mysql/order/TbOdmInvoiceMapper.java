package com.kooing.Interface.mysql.order;

import com.kooing.model.mysql.order.TbOdmInvoice;

public interface TbOdmInvoiceMapper {
    int deleteByPrimaryKey(Integer invId);

    int insert(TbOdmInvoice record);

    int insertSelective(TbOdmInvoice record);

    TbOdmInvoice selectByPrimaryKey(Integer invId);

    int updateByPrimaryKeySelective(TbOdmInvoice record);

    int updateByPrimaryKey(TbOdmInvoice record);
}