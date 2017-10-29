package com.kooing.model.mysql.member;

import java.math.BigDecimal;
import java.util.Date;

public class TbDisHistory {
    private Integer historyId;

    private String uuid;

    private Integer appId;

    private String sn;

    private Integer distributorId;

    private Integer memberId;

    private Integer disLevel;

    private String disRate;

    private Integer orderId;

    private Integer goodsId;

    private Integer orderGoodsId;

    private Integer memberIdOrg;

    private String state;

    private String remark;

    private Date createTime;

    private BigDecimal realGoodsPayPrice;

    private BigDecimal money;

    private String sumFormula;

    private String goodName;

    private Integer times;

    private Date deleteTime;

    private Date updateTime;

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
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

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getDisLevel() {
        return disLevel;
    }

    public void setDisLevel(Integer disLevel) {
        this.disLevel = disLevel;
    }

    public String getDisRate() {
        return disRate;
    }

    public void setDisRate(String disRate) {
        this.disRate = disRate == null ? null : disRate.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Integer getMemberIdOrg() {
        return memberIdOrg;
    }

    public void setMemberIdOrg(Integer memberIdOrg) {
        this.memberIdOrg = memberIdOrg;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getRealGoodsPayPrice() {
        return realGoodsPayPrice;
    }

    public void setRealGoodsPayPrice(BigDecimal realGoodsPayPrice) {
        this.realGoodsPayPrice = realGoodsPayPrice;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getSumFormula() {
        return sumFormula;
    }

    public void setSumFormula(String sumFormula) {
        this.sumFormula = sumFormula == null ? null : sumFormula.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}