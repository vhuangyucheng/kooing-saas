package com.kooing.model.mysql.goods;

import java.util.Date;

public class TbGoodsFcode {
    private Integer fcId;

    private String uuid;

    private Integer appId;

    private Integer goodsCommonid;

    private String fcCode;

    private Integer fcState;

    private Date updateTime;

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
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

    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }

    public String getFcCode() {
        return fcCode;
    }

    public void setFcCode(String fcCode) {
        this.fcCode = fcCode == null ? null : fcCode.trim();
    }

    public Integer getFcState() {
        return fcState;
    }

    public void setFcState(Integer fcState) {
        this.fcState = fcState;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}