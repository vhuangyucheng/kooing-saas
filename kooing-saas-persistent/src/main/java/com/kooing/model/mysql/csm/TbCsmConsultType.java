package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmConsultType {
    private Integer ctId;

    private String uuid;

    private Integer appId;

    private String ctName;

    private Byte ctSort;

    private Date updateTime;

    private String ctIntroduce;

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
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

    public String getCtName() {
        return ctName;
    }

    public void setCtName(String ctName) {
        this.ctName = ctName == null ? null : ctName.trim();
    }

    public Byte getCtSort() {
        return ctSort;
    }

    public void setCtSort(Byte ctSort) {
        this.ctSort = ctSort;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCtIntroduce() {
        return ctIntroduce;
    }

    public void setCtIntroduce(String ctIntroduce) {
        this.ctIntroduce = ctIntroduce == null ? null : ctIntroduce.trim();
    }
}