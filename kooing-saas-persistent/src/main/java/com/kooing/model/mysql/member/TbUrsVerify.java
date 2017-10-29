package com.kooing.model.mysql.member;

import java.util.Date;

public class TbUrsVerify {
    private Integer memberId;

    private String uuid;

    private Integer appId;

    private String authCode;

    private Date sendAcodeTime;

    private Date updateTime;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    public Date getSendAcodeTime() {
        return sendAcodeTime;
    }

    public void setSendAcodeTime(Date sendAcodeTime) {
        this.sendAcodeTime = sendAcodeTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}