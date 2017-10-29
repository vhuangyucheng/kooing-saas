package com.kooing.model.mysql.shop;

import java.util.Date;

public class TbShopCost {
    private Integer costId;

    private String uuid;

    private Integer appId;

    private Integer costStoreId;

    private Integer costSellerId;

    private Integer costPrice;

    private String costRemark;

    private Integer costState;

    private Date costTime;

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
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

    public Integer getCostStoreId() {
        return costStoreId;
    }

    public void setCostStoreId(Integer costStoreId) {
        this.costStoreId = costStoreId;
    }

    public Integer getCostSellerId() {
        return costSellerId;
    }

    public void setCostSellerId(Integer costSellerId) {
        this.costSellerId = costSellerId;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public String getCostRemark() {
        return costRemark;
    }

    public void setCostRemark(String costRemark) {
        this.costRemark = costRemark == null ? null : costRemark.trim();
    }

    public Integer getCostState() {
        return costState;
    }

    public void setCostState(Integer costState) {
        this.costState = costState;
    }

    public Date getCostTime() {
        return costTime;
    }

    public void setCostTime(Date costTime) {
        this.costTime = costTime;
    }
}