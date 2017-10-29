package com.kooing.model.mysql.member;

import java.util.Date;

public class TbDistributionUserRelation {
    private Integer distributionUserId;

    private String uuid;

    private Integer appId;

    private Integer memberId;

    private Integer subordinateMemberId;

    private Date createTime;

    private Date updateTime;

    public Integer getDistributionUserId() {
        return distributionUserId;
    }

    public void setDistributionUserId(Integer distributionUserId) {
        this.distributionUserId = distributionUserId;
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

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getSubordinateMemberId() {
        return subordinateMemberId;
    }

    public void setSubordinateMemberId(Integer subordinateMemberId) {
        this.subordinateMemberId = subordinateMemberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}