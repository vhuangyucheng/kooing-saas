package com.kooing.model.mysql.shop;

public class TbShopBindClass {
    private Integer bid;

    private String uuid;

    private Integer appId;

    private Integer storeId;

    private Integer commisRate;

    private Integer class1;

    private Integer class2;

    private Integer class3;

    private Integer state;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
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

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getCommisRate() {
        return commisRate;
    }

    public void setCommisRate(Integer commisRate) {
        this.commisRate = commisRate;
    }

    public Integer getClass1() {
        return class1;
    }

    public void setClass1(Integer class1) {
        this.class1 = class1;
    }

    public Integer getClass2() {
        return class2;
    }

    public void setClass2(Integer class2) {
        this.class2 = class2;
    }

    public Integer getClass3() {
        return class3;
    }

    public void setClass3(Integer class3) {
        this.class3 = class3;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}