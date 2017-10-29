package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmCron {
    private Integer id;

    private String uuid;

    private Integer appId;

    private Byte type;

    private Integer exeid;

    private Integer exetime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getExeid() {
        return exeid;
    }

    public void setExeid(Integer exeid) {
        this.exeid = exeid;
    }

    public Integer getExetime() {
        return exetime;
    }

    public void setExetime(Integer exetime) {
        this.exetime = exetime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}