package com.kooing.Interface.mysql.ad;

import com.kooing.model.mysql.ad.TbAdvAdsense;

public interface TbAdvAdsenseMapper {
    int deleteByPrimaryKey(Integer adsenseId);

    int insert(TbAdvAdsense record);

    int insertSelective(TbAdvAdsense record);

    TbAdvAdsense selectByPrimaryKey(Integer adsenseId);

    int updateByPrimaryKeySelective(TbAdvAdsense record);

    int updateByPrimaryKey(TbAdvAdsense record);
}