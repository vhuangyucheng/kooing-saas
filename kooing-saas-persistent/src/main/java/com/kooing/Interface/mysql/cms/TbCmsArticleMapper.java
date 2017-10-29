package com.kooing.Interface.mysql.cms;

import com.kooing.model.mysql.cms.TbCmsArticle;

public interface TbCmsArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(TbCmsArticle record);

    int insertSelective(TbCmsArticle record);

    TbCmsArticle selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(TbCmsArticle record);

    int updateByPrimaryKeyWithBLOBs(TbCmsArticle record);

    int updateByPrimaryKey(TbCmsArticle record);
}