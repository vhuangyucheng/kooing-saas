package com.kooing.model.mysql.shop;

import java.math.BigDecimal;

public class TbShopClass {
    private Integer scId;

    private String uuid;

    private Integer appId;

    private String scName;

    private BigDecimal scBail;

    private Integer scSort;

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
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

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    public BigDecimal getScBail() {
        return scBail;
    }

    public void setScBail(BigDecimal scBail) {
        this.scBail = scBail;
    }

    public Integer getScSort() {
        return scSort;
    }

    public void setScSort(Integer scSort) {
        this.scSort = scSort;
    }
}