package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmComplainSubject {
    private Integer complainSubjectId;

    private String uuid;

    private Integer appId;

    private String complainSubjectContent;

    private String complainSubjectDesc;

    private Byte complainSubjectState;

    private Date updateTime;

    public Integer getComplainSubjectId() {
        return complainSubjectId;
    }

    public void setComplainSubjectId(Integer complainSubjectId) {
        this.complainSubjectId = complainSubjectId;
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

    public String getComplainSubjectContent() {
        return complainSubjectContent;
    }

    public void setComplainSubjectContent(String complainSubjectContent) {
        this.complainSubjectContent = complainSubjectContent == null ? null : complainSubjectContent.trim();
    }

    public String getComplainSubjectDesc() {
        return complainSubjectDesc;
    }

    public void setComplainSubjectDesc(String complainSubjectDesc) {
        this.complainSubjectDesc = complainSubjectDesc == null ? null : complainSubjectDesc.trim();
    }

    public Byte getComplainSubjectState() {
        return complainSubjectState;
    }

    public void setComplainSubjectState(Byte complainSubjectState) {
        this.complainSubjectState = complainSubjectState;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}