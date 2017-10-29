package com.kooing.model.mysql.cms;

import java.util.Date;

public class TbCmsArticleClass {
    private Integer acId;

    private String uuid;

    private Integer appId;

    private String acName;

    private Integer acParentId;

    private Integer acLevel;

    private Integer arctinyId;

    private Integer acSort;

    private String belongClassName;

    private Date updateTime;

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
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

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName == null ? null : acName.trim();
    }

    public Integer getAcParentId() {
        return acParentId;
    }

    public void setAcParentId(Integer acParentId) {
        this.acParentId = acParentId;
    }

    public Integer getAcLevel() {
        return acLevel;
    }

    public void setAcLevel(Integer acLevel) {
        this.acLevel = acLevel;
    }

    public Integer getArctinyId() {
        return arctinyId;
    }

    public void setArctinyId(Integer arctinyId) {
        this.arctinyId = arctinyId;
    }

    public Integer getAcSort() {
        return acSort;
    }

    public void setAcSort(Integer acSort) {
        this.acSort = acSort;
    }

    public String getBelongClassName() {
        return belongClassName;
    }

    public void setBelongClassName(String belongClassName) {
        this.belongClassName = belongClassName == null ? null : belongClassName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}