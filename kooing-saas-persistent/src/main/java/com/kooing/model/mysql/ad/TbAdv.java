package com.kooing.model.mysql.ad;

import java.util.Date;

public class TbAdv {
    private Integer advId;

    private String uuid;

    private Integer appId;

    private Integer positionId;

    private String advTitle;

    private String advContent;

    private Date advStartDate;

    private Date advEndDate;

    private Integer slideSort;

    private Integer storeId;

    private String storeName;

    private Integer clickNum;

    private Integer isAllow;

    private String buyStyle;

    private Integer goldpay;

    private Date updateTime;

    public Integer getAdvId() {
        return advId;
    }

    public void setAdvId(Integer advId) {
        this.advId = advId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getAdvTitle() {
        return advTitle;
    }

    public void setAdvTitle(String advTitle) {
        this.advTitle = advTitle == null ? null : advTitle.trim();
    }

    public String getAdvContent() {
        return advContent;
    }

    public void setAdvContent(String advContent) {
        this.advContent = advContent == null ? null : advContent.trim();
    }

    public Date getAdvStartDate() {
        return advStartDate;
    }

    public void setAdvStartDate(Date advStartDate) {
        this.advStartDate = advStartDate;
    }

    public Date getAdvEndDate() {
        return advEndDate;
    }

    public void setAdvEndDate(Date advEndDate) {
        this.advEndDate = advEndDate;
    }

    public Integer getSlideSort() {
        return slideSort;
    }

    public void setSlideSort(Integer slideSort) {
        this.slideSort = slideSort;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }

    public Integer getIsAllow() {
        return isAllow;
    }

    public void setIsAllow(Integer isAllow) {
        this.isAllow = isAllow;
    }

    public String getBuyStyle() {
        return buyStyle;
    }

    public void setBuyStyle(String buyStyle) {
        this.buyStyle = buyStyle == null ? null : buyStyle.trim();
    }

    public Integer getGoldpay() {
        return goldpay;
    }

    public void setGoldpay(Integer goldpay) {
        this.goldpay = goldpay;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}