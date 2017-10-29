package com.kooing.model.mysql.point;

import java.util.Date;

public class TbPointsOrderaddress {
    private Integer pointOaid;

    private String uuid;

    private Integer appId;

    private Integer pointOrderid;

    private String pointTruename;

    private Integer pointAreaid;

    private String pointAreainfo;

    private String pointAddress;

    private String pointZipcode;

    private String pointTelphone;

    private String pointMobphone;

    private Date updateTime;

    public Integer getPointOaid() {
        return pointOaid;
    }

    public void setPointOaid(Integer pointOaid) {
        this.pointOaid = pointOaid;
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

    public Integer getPointOrderid() {
        return pointOrderid;
    }

    public void setPointOrderid(Integer pointOrderid) {
        this.pointOrderid = pointOrderid;
    }

    public String getPointTruename() {
        return pointTruename;
    }

    public void setPointTruename(String pointTruename) {
        this.pointTruename = pointTruename == null ? null : pointTruename.trim();
    }

    public Integer getPointAreaid() {
        return pointAreaid;
    }

    public void setPointAreaid(Integer pointAreaid) {
        this.pointAreaid = pointAreaid;
    }

    public String getPointAreainfo() {
        return pointAreainfo;
    }

    public void setPointAreainfo(String pointAreainfo) {
        this.pointAreainfo = pointAreainfo == null ? null : pointAreainfo.trim();
    }

    public String getPointAddress() {
        return pointAddress;
    }

    public void setPointAddress(String pointAddress) {
        this.pointAddress = pointAddress == null ? null : pointAddress.trim();
    }

    public String getPointZipcode() {
        return pointZipcode;
    }

    public void setPointZipcode(String pointZipcode) {
        this.pointZipcode = pointZipcode == null ? null : pointZipcode.trim();
    }

    public String getPointTelphone() {
        return pointTelphone;
    }

    public void setPointTelphone(String pointTelphone) {
        this.pointTelphone = pointTelphone == null ? null : pointTelphone.trim();
    }

    public String getPointMobphone() {
        return pointMobphone;
    }

    public void setPointMobphone(String pointMobphone) {
        this.pointMobphone = pointMobphone == null ? null : pointMobphone.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}