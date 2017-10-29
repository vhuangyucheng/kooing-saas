package com.kooing.model.mysql.goods;

import java.util.Date;

public class TbGoodsSpecValue {
    private Integer spValueId;

    private String uuid;

    private Integer appId;

    private String spValueName;

    private Integer spId;

    private Integer gcId;

    private Integer storeId;

    private Integer goodsId;

    private String spValueColor;

    private Integer spValueSort;

    private Date updateTime;

    public Integer getSpValueId() {
        return spValueId;
    }

    public void setSpValueId(Integer spValueId) {
        this.spValueId = spValueId;
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

    public String getSpValueName() {
        return spValueName;
    }

    public void setSpValueName(String spValueName) {
        this.spValueName = spValueName == null ? null : spValueName.trim();
    }

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Integer getGcId() {
        return gcId;
    }

    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getSpValueColor() {
        return spValueColor;
    }

    public void setSpValueColor(String spValueColor) {
        this.spValueColor = spValueColor == null ? null : spValueColor.trim();
    }

    public Integer getSpValueSort() {
        return spValueSort;
    }

    public void setSpValueSort(Integer spValueSort) {
        this.spValueSort = spValueSort;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}