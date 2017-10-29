package com.kooing.model.mysql.activity;

import java.util.Date;

public class TbAdminActivityRule {
    private Integer ruleId;

    private Integer goodsNums;

    private Date effTime;

    private Date expTime;

    private Integer activityId;

    private Double discountBegin;

    private Double discountEnd;

    private Long expirePayTime;

    private Integer isSendNotices;

    private Integer limitGroupPeopleNum;

    private Integer notifiedObjectType;

    private Integer state;

    private Integer activityType;

    private Integer appId;

    private String uuid;

    private Date createTime;

    private String cancelReason;

    private String activityTags;

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getGoodsNums() {
        return goodsNums;
    }

    public void setGoodsNums(Integer goodsNums) {
        this.goodsNums = goodsNums;
    }

    public Date getEffTime() {
        return effTime;
    }

    public void setEffTime(Date effTime) {
        this.effTime = effTime;
    }

    public Date getExpTime() {
        return expTime;
    }

    public void setExpTime(Date expTime) {
        this.expTime = expTime;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Double getDiscountBegin() {
        return discountBegin;
    }

    public void setDiscountBegin(Double discountBegin) {
        this.discountBegin = discountBegin;
    }

    public Double getDiscountEnd() {
        return discountEnd;
    }

    public void setDiscountEnd(Double discountEnd) {
        this.discountEnd = discountEnd;
    }

    public Long getExpirePayTime() {
        return expirePayTime;
    }

    public void setExpirePayTime(Long expirePayTime) {
        this.expirePayTime = expirePayTime;
    }

    public Integer getIsSendNotices() {
        return isSendNotices;
    }

    public void setIsSendNotices(Integer isSendNotices) {
        this.isSendNotices = isSendNotices;
    }

    public Integer getLimitGroupPeopleNum() {
        return limitGroupPeopleNum;
    }

    public void setLimitGroupPeopleNum(Integer limitGroupPeopleNum) {
        this.limitGroupPeopleNum = limitGroupPeopleNum;
    }

    public Integer getNotifiedObjectType() {
        return notifiedObjectType;
    }

    public void setNotifiedObjectType(Integer notifiedObjectType) {
        this.notifiedObjectType = notifiedObjectType;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    public String getActivityTags() {
        return activityTags;
    }

    public void setActivityTags(String activityTags) {
        this.activityTags = activityTags == null ? null : activityTags.trim();
    }
}