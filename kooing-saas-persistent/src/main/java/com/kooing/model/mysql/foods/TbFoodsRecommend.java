package com.kooing.model.mysql.foods;

import java.util.Date;

public class TbFoodsRecommend {
    private Long recommendId;

    private Date addTime;

    private Integer everyMeelType;

    private Date recommendDate;

    private String recommendIds;

    private Integer recommendType;

    private Integer appId;

    public Long getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(Long recommendId) {
        this.recommendId = recommendId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getEveryMeelType() {
        return everyMeelType;
    }

    public void setEveryMeelType(Integer everyMeelType) {
        this.everyMeelType = everyMeelType;
    }

    public Date getRecommendDate() {
        return recommendDate;
    }

    public void setRecommendDate(Date recommendDate) {
        this.recommendDate = recommendDate;
    }

    public String getRecommendIds() {
        return recommendIds;
    }

    public void setRecommendIds(String recommendIds) {
        this.recommendIds = recommendIds == null ? null : recommendIds.trim();
    }

    public Integer getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(Integer recommendType) {
        this.recommendType = recommendType;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}