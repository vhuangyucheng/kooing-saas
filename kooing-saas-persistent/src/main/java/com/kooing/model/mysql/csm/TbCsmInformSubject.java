package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmInformSubject {
    private Integer informSubjectId;

    private String uuid;

    private Integer appId;

    private String informSubjectContent;

    private Integer informSubjectTypeId;

    private String informSubjectTypeName;

    private Byte informSubjectState;

    private Date updateTime;

    public Integer getInformSubjectId() {
        return informSubjectId;
    }

    public void setInformSubjectId(Integer informSubjectId) {
        this.informSubjectId = informSubjectId;
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

    public String getInformSubjectContent() {
        return informSubjectContent;
    }

    public void setInformSubjectContent(String informSubjectContent) {
        this.informSubjectContent = informSubjectContent == null ? null : informSubjectContent.trim();
    }

    public Integer getInformSubjectTypeId() {
        return informSubjectTypeId;
    }

    public void setInformSubjectTypeId(Integer informSubjectTypeId) {
        this.informSubjectTypeId = informSubjectTypeId;
    }

    public String getInformSubjectTypeName() {
        return informSubjectTypeName;
    }

    public void setInformSubjectTypeName(String informSubjectTypeName) {
        this.informSubjectTypeName = informSubjectTypeName == null ? null : informSubjectTypeName.trim();
    }

    public Byte getInformSubjectState() {
        return informSubjectState;
    }

    public void setInformSubjectState(Byte informSubjectState) {
        this.informSubjectState = informSubjectState;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}