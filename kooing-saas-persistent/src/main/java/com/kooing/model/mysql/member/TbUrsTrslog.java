package com.kooing.model.mysql.member;

import java.math.BigDecimal;
import java.util.Date;

public class TbUrsTrslog {
    private Integer trsId;

    private String uuid;

    private Integer appId;

    private Integer trsCode;

    private String extTrsCode;

    private String extSysCode;

    private BigDecimal trsAmount;

    private BigDecimal fee;

    private Date reqDate;

    private Date trsTime;

    private String respCode;

    private String respInfo;

    private String stat;

    private Date updateTime;

    private String memo;

    private Integer relevanceId;

    private String payerAcctNo;

    private String payeeAcctNo;

    private String reqSeq;

    public Integer getTrsId() {
        return trsId;
    }

    public void setTrsId(Integer trsId) {
        this.trsId = trsId;
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

    public Integer getTrsCode() {
        return trsCode;
    }

    public void setTrsCode(Integer trsCode) {
        this.trsCode = trsCode;
    }

    public String getExtTrsCode() {
        return extTrsCode;
    }

    public void setExtTrsCode(String extTrsCode) {
        this.extTrsCode = extTrsCode == null ? null : extTrsCode.trim();
    }

    public String getExtSysCode() {
        return extSysCode;
    }

    public void setExtSysCode(String extSysCode) {
        this.extSysCode = extSysCode == null ? null : extSysCode.trim();
    }

    public BigDecimal getTrsAmount() {
        return trsAmount;
    }

    public void setTrsAmount(BigDecimal trsAmount) {
        this.trsAmount = trsAmount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getTrsTime() {
        return trsTime;
    }

    public void setTrsTime(Date trsTime) {
        this.trsTime = trsTime;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode == null ? null : respCode.trim();
    }

    public String getRespInfo() {
        return respInfo;
    }

    public void setRespInfo(String respInfo) {
        this.respInfo = respInfo == null ? null : respInfo.trim();
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat == null ? null : stat.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getRelevanceId() {
        return relevanceId;
    }

    public void setRelevanceId(Integer relevanceId) {
        this.relevanceId = relevanceId;
    }

    public String getPayerAcctNo() {
        return payerAcctNo;
    }

    public void setPayerAcctNo(String payerAcctNo) {
        this.payerAcctNo = payerAcctNo == null ? null : payerAcctNo.trim();
    }

    public String getPayeeAcctNo() {
        return payeeAcctNo;
    }

    public void setPayeeAcctNo(String payeeAcctNo) {
        this.payeeAcctNo = payeeAcctNo == null ? null : payeeAcctNo.trim();
    }

    public String getReqSeq() {
        return reqSeq;
    }

    public void setReqSeq(String reqSeq) {
        this.reqSeq = reqSeq == null ? null : reqSeq.trim();
    }
}