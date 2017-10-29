package com.kooing.model.mysql.goods;

import java.util.Date;

public class TbShopWaybill {
    private Integer storeWaybillId;

    private String uuid;

    private Integer appId;

    private Integer storeId;

    private Integer expressId;

    private Integer waybillId;

    private String waybillName;

    private String storeWaybillData;

    private Integer isDefault;

    private Integer storeWaybillLeft;

    private Integer storeWaybillTop;

    private Date updateTime;

    public Integer getStoreWaybillId() {
        return storeWaybillId;
    }

    public void setStoreWaybillId(Integer storeWaybillId) {
        this.storeWaybillId = storeWaybillId;
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

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public Integer getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Integer waybillId) {
        this.waybillId = waybillId;
    }

    public String getWaybillName() {
        return waybillName;
    }

    public void setWaybillName(String waybillName) {
        this.waybillName = waybillName == null ? null : waybillName.trim();
    }

    public String getStoreWaybillData() {
        return storeWaybillData;
    }

    public void setStoreWaybillData(String storeWaybillData) {
        this.storeWaybillData = storeWaybillData == null ? null : storeWaybillData.trim();
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getStoreWaybillLeft() {
        return storeWaybillLeft;
    }

    public void setStoreWaybillLeft(Integer storeWaybillLeft) {
        this.storeWaybillLeft = storeWaybillLeft;
    }

    public Integer getStoreWaybillTop() {
        return storeWaybillTop;
    }

    public void setStoreWaybillTop(Integer storeWaybillTop) {
        this.storeWaybillTop = storeWaybillTop;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}