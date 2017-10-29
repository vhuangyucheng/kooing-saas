package com.kooing.model.mysql.activity;

import java.util.Date;

public class TbSysActivityModuleRole {
    private Integer pid;

    private Integer activityId;

    private Integer appId;

    private Date effDate;

    private Date expDate;

    private Integer state;

    private Date updateTime;

    private String activityTypename;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getActivityTypename() {
        return activityTypename;
    }

    public void setActivityTypename(String activityTypename) {
        this.activityTypename = activityTypename == null ? null : activityTypename.trim();
    }
}