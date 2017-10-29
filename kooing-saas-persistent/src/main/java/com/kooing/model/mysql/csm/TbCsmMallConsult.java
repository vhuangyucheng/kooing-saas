package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmMallConsult {
    private Integer mcId;

    private String uuid;

    private Integer appId;

    private Integer mctId;

    private Integer memberId;

    private String memberName;

    private String mcContent;

    private Date mcAddtime;

    private Byte isReply;

    private String mcReply;

    private Date mcReplyTime;

    private Integer adminId;

    private String adminName;

    private Date updateTime;

    public Integer getMcId() {
        return mcId;
    }

    public void setMcId(Integer mcId) {
        this.mcId = mcId;
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

    public Integer getMctId() {
        return mctId;
    }

    public void setMctId(Integer mctId) {
        this.mctId = mctId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMcContent() {
        return mcContent;
    }

    public void setMcContent(String mcContent) {
        this.mcContent = mcContent == null ? null : mcContent.trim();
    }

    public Date getMcAddtime() {
        return mcAddtime;
    }

    public void setMcAddtime(Date mcAddtime) {
        this.mcAddtime = mcAddtime;
    }

    public Byte getIsReply() {
        return isReply;
    }

    public void setIsReply(Byte isReply) {
        this.isReply = isReply;
    }

    public String getMcReply() {
        return mcReply;
    }

    public void setMcReply(String mcReply) {
        this.mcReply = mcReply == null ? null : mcReply.trim();
    }

    public Date getMcReplyTime() {
        return mcReplyTime;
    }

    public void setMcReplyTime(Date mcReplyTime) {
        this.mcReplyTime = mcReplyTime;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}