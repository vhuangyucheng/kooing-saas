package com.kooing.model.mysql.logistics;

import java.util.Date;

public class TbLgmWaybill {
    private Integer waybillId;

    private String uuid;

    private Integer appId;

    private String waybillName;

    private String waybillImage;

    private Integer waybillWidth;

    private Integer waybillHeight;

    private String waybillData;

    private Integer waybillUsable;

    private Integer waybillTop;

    private Integer waybillLeft;

    private Integer expressId;

    private String expressName;

    private Integer storeId;

    private Date updateTime;

    public Integer getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Integer waybillId) {
        this.waybillId = waybillId;
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

    public String getWaybillName() {
        return waybillName;
    }

    public void setWaybillName(String waybillName) {
        this.waybillName = waybillName == null ? null : waybillName.trim();
    }

    public String getWaybillImage() {
        return waybillImage;
    }

    public void setWaybillImage(String waybillImage) {
        this.waybillImage = waybillImage == null ? null : waybillImage.trim();
    }

    public Integer getWaybillWidth() {
        return waybillWidth;
    }

    public void setWaybillWidth(Integer waybillWidth) {
        this.waybillWidth = waybillWidth;
    }

    public Integer getWaybillHeight() {
        return waybillHeight;
    }

    public void setWaybillHeight(Integer waybillHeight) {
        this.waybillHeight = waybillHeight;
    }

    public String getWaybillData() {
        return waybillData;
    }

    public void setWaybillData(String waybillData) {
        this.waybillData = waybillData == null ? null : waybillData.trim();
    }

    public Integer getWaybillUsable() {
        return waybillUsable;
    }

    public void setWaybillUsable(Integer waybillUsable) {
        this.waybillUsable = waybillUsable;
    }

    public Integer getWaybillTop() {
        return waybillTop;
    }

    public void setWaybillTop(Integer waybillTop) {
        this.waybillTop = waybillTop;
    }

    public Integer getWaybillLeft() {
        return waybillLeft;
    }

    public void setWaybillLeft(Integer waybillLeft) {
        this.waybillLeft = waybillLeft;
    }

    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName == null ? null : expressName.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}