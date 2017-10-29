package com.kooing.model.mysql.shop;

import java.util.Date;

public class TbShopGoodsClass {
    private Integer stcId;

    private String uuid;

    private Integer appId;

    private String stcName;

    private Integer stcParentId;

    private Integer stcState;

    private Integer storeId;

    private Integer stcSort;

    private String stcImagesUrl;

    private Date addTime;

    private Integer level;

    public Integer getStcId() {
        return stcId;
    }

    public void setStcId(Integer stcId) {
        this.stcId = stcId;
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

    public String getStcName() {
        return stcName;
    }

    public void setStcName(String stcName) {
        this.stcName = stcName == null ? null : stcName.trim();
    }

    public Integer getStcParentId() {
        return stcParentId;
    }

    public void setStcParentId(Integer stcParentId) {
        this.stcParentId = stcParentId;
    }

    public Integer getStcState() {
        return stcState;
    }

    public void setStcState(Integer stcState) {
        this.stcState = stcState;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStcSort() {
        return stcSort;
    }

    public void setStcSort(Integer stcSort) {
        this.stcSort = stcSort;
    }

    public String getStcImagesUrl() {
        return stcImagesUrl;
    }

    public void setStcImagesUrl(String stcImagesUrl) {
        this.stcImagesUrl = stcImagesUrl == null ? null : stcImagesUrl.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}