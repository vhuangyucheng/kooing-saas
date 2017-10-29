package com.kooing.Interface.mysql.cms;

import com.kooing.model.mysql.cms.TbCmsArctiny;

public interface TbCmsArctinyMapper {
    int deleteByPrimaryKey(Integer arctinyId);

    int insert(TbCmsArctiny record);

    int insertSelective(TbCmsArctiny record);

    TbCmsArctiny selectByPrimaryKey(Integer arctinyId);

    int updateByPrimaryKeySelective(TbCmsArctiny record);

    int updateByPrimaryKeyWithBLOBs(TbCmsArctiny record);

    int updateByPrimaryKey(TbCmsArctiny record);
}