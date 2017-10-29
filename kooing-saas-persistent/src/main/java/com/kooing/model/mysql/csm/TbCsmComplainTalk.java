package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmComplainTalk {
    private Integer talkId;

    private String uuid;

    private Integer appId;

    private Integer complainId;

    private Integer talkMemberId;

    private String talkMemberName;

    private String talkMemberType;

    private String talkContent;

    private Byte talkState;

    private Integer talkAdmin;

    private Integer talkDatetime;

    private Date updateTime;

    public Integer getTalkId() {
        return talkId;
    }

    public void setTalkId(Integer talkId) {
        this.talkId = talkId;
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

    public Integer getComplainId() {
        return complainId;
    }

    public void setComplainId(Integer complainId) {
        this.complainId = complainId;
    }

    public Integer getTalkMemberId() {
        return talkMemberId;
    }

    public void setTalkMemberId(Integer talkMemberId) {
        this.talkMemberId = talkMemberId;
    }

    public String getTalkMemberName() {
        return talkMemberName;
    }

    public void setTalkMemberName(String talkMemberName) {
        this.talkMemberName = talkMemberName == null ? null : talkMemberName.trim();
    }

    public String getTalkMemberType() {
        return talkMemberType;
    }

    public void setTalkMemberType(String talkMemberType) {
        this.talkMemberType = talkMemberType == null ? null : talkMemberType.trim();
    }

    public String getTalkContent() {
        return talkContent;
    }

    public void setTalkContent(String talkContent) {
        this.talkContent = talkContent == null ? null : talkContent.trim();
    }

    public Byte getTalkState() {
        return talkState;
    }

    public void setTalkState(Byte talkState) {
        this.talkState = talkState;
    }

    public Integer getTalkAdmin() {
        return talkAdmin;
    }

    public void setTalkAdmin(Integer talkAdmin) {
        this.talkAdmin = talkAdmin;
    }

    public Integer getTalkDatetime() {
        return talkDatetime;
    }

    public void setTalkDatetime(Integer talkDatetime) {
        this.talkDatetime = talkDatetime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}