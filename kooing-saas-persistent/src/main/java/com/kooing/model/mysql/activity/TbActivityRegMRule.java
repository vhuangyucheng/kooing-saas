package com.kooing.model.mysql.activity;

import java.util.Date;

public class TbActivityRegMRule {
    private Integer ruleId;

    private String uuid;

    private Integer regId;

    private Integer activityId;

    private Integer shopId;

    private Integer activityType;

    private Double conditionValue;

    private Double saleDiscount;

    private Integer isfreeFreight;

    private Integer ishaveGift;

    private String extendFiled;

    private Integer appId;

    private Integer state;

    private Date createTime;

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Double getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(Double conditionValue) {
        this.conditionValue = conditionValue;
    }

    public Double getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(Double saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public Integer getIsfreeFreight() {
        return isfreeFreight;
    }

    public void setIsfreeFreight(Integer isfreeFreight) {
        this.isfreeFreight = isfreeFreight;
    }

    public Integer getIshaveGift() {
        return ishaveGift;
    }

    public void setIshaveGift(Integer ishaveGift) {
        this.ishaveGift = ishaveGift;
    }

    public String getExtendFiled() {
        return extendFiled;
    }

    public void setExtendFiled(String extendFiled) {
        this.extendFiled = extendFiled == null ? null : extendFiled.trim();
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}