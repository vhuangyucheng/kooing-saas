package com.kooing.model.mysql.foods;

import java.util.Date;

public class TbUrsFoods {
    private Integer frId;

    private Integer foodsId;

    private Date createtime;

    private Integer customerId;

    private String picStr;

    private Date upTime;

    private String cfContent;

    private Integer likeContent;

    private Integer appId;

    public Integer getFrId() {
        return frId;
    }

    public void setFrId(Integer frId) {
        this.frId = frId;
    }

    public Integer getFoodsId() {
        return foodsId;
    }

    public void setFoodsId(Integer foodsId) {
        this.foodsId = foodsId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getPicStr() {
        return picStr;
    }

    public void setPicStr(String picStr) {
        this.picStr = picStr == null ? null : picStr.trim();
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public String getCfContent() {
        return cfContent;
    }

    public void setCfContent(String cfContent) {
        this.cfContent = cfContent == null ? null : cfContent.trim();
    }

    public Integer getLikeContent() {
        return likeContent;
    }

    public void setLikeContent(Integer likeContent) {
        this.likeContent = likeContent;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}