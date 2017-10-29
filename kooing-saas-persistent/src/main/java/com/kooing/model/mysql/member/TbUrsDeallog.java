package com.kooing.model.mysql.member;

import java.math.BigDecimal;
import java.util.Date;

public class TbUrsDeallog {
    private Integer acctTrsId;

    private String uuid;

    private Integer appId;

    private Integer trsId;

    private Integer memberId;

    private String accountType;

    private String dealType;

    private BigDecimal trsAmount;

    private BigDecimal endBal;

    private Date dealTime;

    private BigDecimal beforeAmount;

    private String memo;

    public Integer getAcctTrsId() {
        return acctTrsId;
    }

    public void setAcctTrsId(Integer acctTrsId) {
        this.acctTrsId = acctTrsId;
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

    public Integer getTrsId() {
        return trsId;
    }

    public void setTrsId(Integer trsId) {
        this.trsId = trsId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType == null ? null : dealType.trim();
    }

    public BigDecimal getTrsAmount() {
        return trsAmount;
    }

    public void setTrsAmount(BigDecimal trsAmount) {
        this.trsAmount = trsAmount;
    }

    public BigDecimal getEndBal() {
        return endBal;
    }

    public void setEndBal(BigDecimal endBal) {
        this.endBal = endBal;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public BigDecimal getBeforeAmount() {
        return beforeAmount;
    }

    public void setBeforeAmount(BigDecimal beforeAmount) {
        this.beforeAmount = beforeAmount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}