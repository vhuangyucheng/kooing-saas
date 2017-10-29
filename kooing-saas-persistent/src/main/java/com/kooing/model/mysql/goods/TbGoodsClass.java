package com.kooing.model.mysql.goods;

import java.util.Date;

public class TbGoodsClass {
    private Integer gcId;

    private String uuid;

    private Integer appId;

    private String gcName;

    private Integer typeId;

    private String typeName;

    private Integer gcParentId;

    private Integer gcSort;

    private Integer gcVirtual;

    private String gcTitle;

    private String gcKeywords;

    private String gcImagesUrl;

    private String gcImagesName;

    private Integer level;

    private String gcDescription;

    private Date updateTime;

    public Integer getGcId() {
        return gcId;
    }

    public void setGcId(Integer gcId) {
        this.gcId = gcId;
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

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName == null ? null : gcName.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getGcParentId() {
        return gcParentId;
    }

    public void setGcParentId(Integer gcParentId) {
        this.gcParentId = gcParentId;
    }

    public Integer getGcSort() {
        return gcSort;
    }

    public void setGcSort(Integer gcSort) {
        this.gcSort = gcSort;
    }

    public Integer getGcVirtual() {
        return gcVirtual;
    }

    public void setGcVirtual(Integer gcVirtual) {
        this.gcVirtual = gcVirtual;
    }

    public String getGcTitle() {
        return gcTitle;
    }

    public void setGcTitle(String gcTitle) {
        this.gcTitle = gcTitle == null ? null : gcTitle.trim();
    }

    public String getGcKeywords() {
        return gcKeywords;
    }

    public void setGcKeywords(String gcKeywords) {
        this.gcKeywords = gcKeywords == null ? null : gcKeywords.trim();
    }

    public String getGcImagesUrl() {
        return gcImagesUrl;
    }

    public void setGcImagesUrl(String gcImagesUrl) {
        this.gcImagesUrl = gcImagesUrl == null ? null : gcImagesUrl.trim();
    }

    public String getGcImagesName() {
        return gcImagesName;
    }

    public void setGcImagesName(String gcImagesName) {
        this.gcImagesName = gcImagesName == null ? null : gcImagesName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getGcDescription() {
        return gcDescription;
    }

    public void setGcDescription(String gcDescription) {
        this.gcDescription = gcDescription == null ? null : gcDescription.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}