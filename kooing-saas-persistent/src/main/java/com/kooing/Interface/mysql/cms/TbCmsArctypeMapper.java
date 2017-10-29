package com.kooing.Interface.mysql.cms;

import com.kooing.model.mysql.cms.TbCmsArctype;

public interface TbCmsArctypeMapper {
    int deleteByPrimaryKey(Integer arctypeId);

    int insert(TbCmsArctype record);

    int insertSelective(TbCmsArctype record);

    TbCmsArctype selectByPrimaryKey(Integer arctypeId);

    int updateByPrimaryKeySelective(TbCmsArctype record);

    int updateByPrimaryKey(TbCmsArctype record);
}