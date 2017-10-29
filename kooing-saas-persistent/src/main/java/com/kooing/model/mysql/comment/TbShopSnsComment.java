package com.kooing.model.mysql.comment;

import java.util.Date;

public class TbShopSnsComment {
    private Integer scommId;

    private String uuid;

    private Integer appId;

    private Integer straceId;

    private Integer scommMemberid;

    private String scommMembername;

    private String scommMemberavatar;

    private Date scommTime;

    private Boolean scommState;

    private Date updateTime;

    private String scommContent;

    public Integer getScommId() {
        return scommId;
    }

    public void setScommId(Integer scommId) {
        this.scommId = scommId;
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

    public Integer getStraceId() {
        return straceId;
    }

    public void setStraceId(Integer straceId) {
        this.straceId = straceId;
    }

    public Integer getScommMemberid() {
        return scommMemberid;
    }

    public void setScommMemberid(Integer scommMemberid) {
        this.scommMemberid = scommMemberid;
    }

    public String getScommMembername() {
        return scommMembername;
    }

    public void setScommMembername(String scommMembername) {
        this.scommMembername = scommMembername == null ? null : scommMembername.trim();
    }

    public String getScommMemberavatar() {
        return scommMemberavatar;
    }

    public void setScommMemberavatar(String scommMemberavatar) {
        this.scommMemberavatar = scommMemberavatar == null ? null : scommMemberavatar.trim();
    }

    public Date getScommTime() {
        return scommTime;
    }

    public void setScommTime(Date scommTime) {
        this.scommTime = scommTime;
    }

    public Boolean getScommState() {
        return scommState;
    }

    public void setScommState(Boolean scommState) {
        this.scommState = scommState;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getScommContent() {
        return scommContent;
    }

    public void setScommContent(String scommContent) {
        this.scommContent = scommContent == null ? null : scommContent.trim();
    }
}