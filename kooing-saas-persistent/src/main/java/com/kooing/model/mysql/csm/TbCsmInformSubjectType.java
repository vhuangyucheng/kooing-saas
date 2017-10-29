package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmInformSubjectType {
    private Integer informTypeId;

    private String uuid;

    private Integer appId;

    private String informTypeName;

    private String informTypeDesc;

    private Byte informTypeState;

    private Date updateTime;

    public Integer getInformTypeId() {
        return informTypeId;
    }

    public void setInformTypeId(Integer informTypeId) {
        this.informTypeId = informTypeId;
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

    public String getInformTypeName() {
        return informTypeName;
    }

    public void setInformTypeName(String informTypeName) {
        this.informTypeName = informTypeName == null ? null : informTypeName.trim();
    }

    public String getInformTypeDesc() {
        return informTypeDesc;
    }

    public void setInformTypeDesc(String informTypeDesc) {
        this.informTypeDesc = informTypeDesc == null ? null : informTypeDesc.trim();
    }

    public Byte getInformTypeState() {
        return informTypeState;
    }

    public void setInformTypeState(Byte informTypeState) {
        this.informTypeState = informTypeState;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}