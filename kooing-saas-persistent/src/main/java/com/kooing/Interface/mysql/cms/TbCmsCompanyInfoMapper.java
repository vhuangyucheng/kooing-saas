package com.kooing.Interface.mysql.cms;

import com.kooing.model.mysql.cms.TbCmsCompanyInfo;

public interface TbCmsCompanyInfoMapper {
    int deleteByPrimaryKey(Integer companyInfoId);

    int insert(TbCmsCompanyInfo record);

    int insertSelective(TbCmsCompanyInfo record);

    TbCmsCompanyInfo selectByPrimaryKey(Integer companyInfoId);

    int updateByPrimaryKeySelective(TbCmsCompanyInfo record);

    int updateByPrimaryKeyWithBLOBs(TbCmsCompanyInfo record);

    int updateByPrimaryKey(TbCmsCompanyInfo record);
}