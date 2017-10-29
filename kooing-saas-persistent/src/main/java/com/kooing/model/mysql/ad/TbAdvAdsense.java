package com.kooing.model.mysql.ad;

import java.util.Date;

public class TbAdvAdsense {
    private Integer adsenseId;

    private Integer fromAd;

    private String uuid;

    private Integer appId;

    private String referer;

    private Integer clicks;

    private Date updateTime;

    public Integer getAdsenseId() {
        return adsenseId;
    }

    public void setAdsenseId(Integer adsenseId) {
        this.adsenseId = adsenseId;
    }

    public Integer getFromAd() {
        return fromAd;
    }

    public void setFromAd(Integer fromAd) {
        this.fromAd = fromAd;
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

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer == null ? null : referer.trim();
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}