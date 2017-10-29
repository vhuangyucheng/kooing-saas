package com.kooing.model.mysql.shop;

import java.util.Date;

public class TbShopDecoration {
    private Integer decorationId;

    private String uuid;

    private Integer appId;

    private String pageType;

    private String decorationName;

    private String decorationUrl;

    private String decorationQr;

    private Integer storeId;

    private String decorationSetting;

    private String decorationNav;

    private Integer isHomePage;

    private String decorationBanner;

    private String state;

    private String ownerType;

    private Date updateTime;

    public Integer getDecorationId() {
        return decorationId;
    }

    public void setDecorationId(Integer decorationId) {
        this.decorationId = decorationId;
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

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType == null ? null : pageType.trim();
    }

    public String getDecorationName() {
        return decorationName;
    }

    public void setDecorationName(String decorationName) {
        this.decorationName = decorationName == null ? null : decorationName.trim();
    }

    public String getDecorationUrl() {
        return decorationUrl;
    }

    public void setDecorationUrl(String decorationUrl) {
        this.decorationUrl = decorationUrl == null ? null : decorationUrl.trim();
    }

    public String getDecorationQr() {
        return decorationQr;
    }

    public void setDecorationQr(String decorationQr) {
        this.decorationQr = decorationQr == null ? null : decorationQr.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getDecorationSetting() {
        return decorationSetting;
    }

    public void setDecorationSetting(String decorationSetting) {
        this.decorationSetting = decorationSetting == null ? null : decorationSetting.trim();
    }

    public String getDecorationNav() {
        return decorationNav;
    }

    public void setDecorationNav(String decorationNav) {
        this.decorationNav = decorationNav == null ? null : decorationNav.trim();
    }

    public Integer getIsHomePage() {
        return isHomePage;
    }

    public void setIsHomePage(Integer isHomePage) {
        this.isHomePage = isHomePage;
    }

    public String getDecorationBanner() {
        return decorationBanner;
    }

    public void setDecorationBanner(String decorationBanner) {
        this.decorationBanner = decorationBanner == null ? null : decorationBanner.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType == null ? null : ownerType.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}