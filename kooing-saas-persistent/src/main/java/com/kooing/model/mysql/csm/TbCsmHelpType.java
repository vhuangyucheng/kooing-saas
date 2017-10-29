package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmHelpType {
    private Integer typeId;

    private String uuid;

    private Integer appId;

    private String typeName;

    private Boolean typeSort;

    private String helpCode;

    private Boolean helpShow;

    private Boolean pageShow;

    private Date updateTime;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Boolean getTypeSort() {
        return typeSort;
    }

    public void setTypeSort(Boolean typeSort) {
        this.typeSort = typeSort;
    }

    public String getHelpCode() {
        return helpCode;
    }

    public void setHelpCode(String helpCode) {
        this.helpCode = helpCode == null ? null : helpCode.trim();
    }

    public Boolean getHelpShow() {
        return helpShow;
    }

    public void setHelpShow(Boolean helpShow) {
        this.helpShow = helpShow;
    }

    public Boolean getPageShow() {
        return pageShow;
    }

    public void setPageShow(Boolean pageShow) {
        this.pageShow = pageShow;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}