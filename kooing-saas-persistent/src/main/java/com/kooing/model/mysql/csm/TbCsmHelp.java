package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmHelp {
    private Integer helpId;

    private String uuid;

    private Integer appId;

    private Boolean helpSort;

    private String helpTitle;

    private String helpUrl;

    private Integer typeId;

    private Integer pageShow;

    private Date updateTime;

    private String helpInfo;

    public Integer getHelpId() {
        return helpId;
    }

    public void setHelpId(Integer helpId) {
        this.helpId = helpId;
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

    public Boolean getHelpSort() {
        return helpSort;
    }

    public void setHelpSort(Boolean helpSort) {
        this.helpSort = helpSort;
    }

    public String getHelpTitle() {
        return helpTitle;
    }

    public void setHelpTitle(String helpTitle) {
        this.helpTitle = helpTitle == null ? null : helpTitle.trim();
    }

    public String getHelpUrl() {
        return helpUrl;
    }

    public void setHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl == null ? null : helpUrl.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getPageShow() {
        return pageShow;
    }

    public void setPageShow(Integer pageShow) {
        this.pageShow = pageShow;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getHelpInfo() {
        return helpInfo;
    }

    public void setHelpInfo(String helpInfo) {
        this.helpInfo = helpInfo == null ? null : helpInfo.trim();
    }
}