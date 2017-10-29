package com.kooing.Interface.mysql.cms;

import com.kooing.model.mysql.cms.TbCmsArticleClass;

public interface TbCmsArticleClassMapper {
    int deleteByPrimaryKey(Integer acId);

    int insert(TbCmsArticleClass record);

    int insertSelective(TbCmsArticleClass record);

    TbCmsArticleClass selectByPrimaryKey(Integer acId);

    int updateByPrimaryKeySelective(TbCmsArticleClass record);

    int updateByPrimaryKey(TbCmsArticleClass record);
}