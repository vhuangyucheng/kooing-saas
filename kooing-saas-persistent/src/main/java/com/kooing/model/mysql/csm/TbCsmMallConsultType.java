package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmMallConsultType {
    private Integer mctId;

    private String uuid;

    private Integer appId;

    private String mctName;

    private Byte mctSort;

    private Date updateTime;

    private String mctIntroduce;

    public Integer getMctId() {
        return mctId;
    }

    public void setMctId(Integer mctId) {
        this.mctId = mctId;
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

    public String getMctName() {
        return mctName;
    }

    public void setMctName(String mctName) {
        this.mctName = mctName == null ? null : mctName.trim();
    }

    public Byte getMctSort() {
        return mctSort;
    }

    public void setMctSort(Byte mctSort) {
        this.mctSort = mctSort;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMctIntroduce() {
        return mctIntroduce;
    }

    public void setMctIntroduce(String mctIntroduce) {
        this.mctIntroduce = mctIntroduce == null ? null : mctIntroduce.trim();
    }
}