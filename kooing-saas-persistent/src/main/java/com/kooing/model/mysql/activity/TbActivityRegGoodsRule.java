package com.kooing.model.mysql.activity;

import java.util.Date;

public class TbActivityRegGoodsRule {
    private Integer ruleId;

    private String uuid;

    private Integer appId;

    private Integer regId;

    private Integer activityId;

    private Integer shopId;

    private Integer activityType;

    private Long goodId;

    private Long auctionId;

    private Integer auctionState;

    private Integer state;

    private Date createTime;

    private String custGoodName;

    private Integer sortNum;

    private Integer limitBuyNum;

    private Integer groupPeopleNum;

    private Double saleDiscount;

    private String failMsg;

    private String goodPhoto;

    private Integer allShopFlag;

    private Integer goodsDetailId;

    private Integer transportId;

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

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
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

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Long getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public Integer getAuctionState() {
        return auctionState;
    }

    public void setAuctionState(Integer auctionState) {
        this.auctionState = auctionState;
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

    public String getCustGoodName() {
        return custGoodName;
    }

    public void setCustGoodName(String custGoodName) {
        this.custGoodName = custGoodName == null ? null : custGoodName.trim();
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Integer getLimitBuyNum() {
        return limitBuyNum;
    }

    public void setLimitBuyNum(Integer limitBuyNum) {
        this.limitBuyNum = limitBuyNum;
    }

    public Integer getGroupPeopleNum() {
        return groupPeopleNum;
    }

    public void setGroupPeopleNum(Integer groupPeopleNum) {
        this.groupPeopleNum = groupPeopleNum;
    }

    public Double getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(Double saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public String getFailMsg() {
        return failMsg;
    }

    public void setFailMsg(String failMsg) {
        this.failMsg = failMsg == null ? null : failMsg.trim();
    }

    public String getGoodPhoto() {
        return goodPhoto;
    }

    public void setGoodPhoto(String goodPhoto) {
        this.goodPhoto = goodPhoto == null ? null : goodPhoto.trim();
    }

    public Integer getAllShopFlag() {
        return allShopFlag;
    }

    public void setAllShopFlag(Integer allShopFlag) {
        this.allShopFlag = allShopFlag;
    }

    public Integer getGoodsDetailId() {
        return goodsDetailId;
    }

    public void setGoodsDetailId(Integer goodsDetailId) {
        this.goodsDetailId = goodsDetailId;
    }

    public Integer getTransportId() {
        return transportId;
    }

    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }
}