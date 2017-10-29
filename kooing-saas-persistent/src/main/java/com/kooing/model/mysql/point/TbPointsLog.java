package com.kooing.model.mysql.point;

import java.util.Date;

public class TbPointsLog {
    private Integer plId;

    private String uuid;

    private Integer appId;

    private Integer plMemberid;

    private String plMembername;

    private Integer plAdminid;

    private String plAdminname;

    private Integer plPoints;

    private Date plAddtime;

    private String plDesc;

    private String plStage;

    private Date updateTime;

    public Integer getPlId() {
        return plId;
    }

    public void setPlId(Integer plId) {
        this.plId = plId;
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

    public Integer getPlMemberid() {
        return plMemberid;
    }

    public void setPlMemberid(Integer plMemberid) {
        this.plMemberid = plMemberid;
    }

    public String getPlMembername() {
        return plMembername;
    }

    public void setPlMembername(String plMembername) {
        this.plMembername = plMembername == null ? null : plMembername.trim();
    }

    public Integer getPlAdminid() {
        return plAdminid;
    }

    public void setPlAdminid(Integer plAdminid) {
        this.plAdminid = plAdminid;
    }

    public String getPlAdminname() {
        return plAdminname;
    }

    public void setPlAdminname(String plAdminname) {
        this.plAdminname = plAdminname == null ? null : plAdminname.trim();
    }

    public Integer getPlPoints() {
        return plPoints;
    }

    public void setPlPoints(Integer plPoints) {
        this.plPoints = plPoints;
    }

    public Date getPlAddtime() {
        return plAddtime;
    }

    public void setPlAddtime(Date plAddtime) {
        this.plAddtime = plAddtime;
    }

    public String getPlDesc() {
        return plDesc;
    }

    public void setPlDesc(String plDesc) {
        this.plDesc = plDesc == null ? null : plDesc.trim();
    }

    public String getPlStage() {
        return plStage;
    }

    public void setPlStage(String plStage) {
        this.plStage = plStage == null ? null : plStage.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}