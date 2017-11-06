package com.kooing.saas.persistent.model.comment;

import java.util.Date;

public class TbShopSnsComment {
    private Long scommId;

    private String uuid;

    private Integer storeId;

    private String scommMembername;

    private Integer scommMemberid;

    private Date scommTime;

    private Date updateTime;

    private Integer scommVirtual;

    private String scommContent;

    public Long getScommId() {
        return scommId;
    }

    public void setScommId(Long scommId) {
        this.scommId = scommId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getScommMembername() {
        return scommMembername;
    }

    public void setScommMembername(String scommMembername) {
        this.scommMembername = scommMembername == null ? null : scommMembername.trim();
    }

    public Integer getScommMemberid() {
        return scommMemberid;
    }

    public void setScommMemberid(Integer scommMemberid) {
        this.scommMemberid = scommMemberid;
    }

    public Date getScommTime() {
        return scommTime;
    }

    public void setScommTime(Date scommTime) {
        this.scommTime = scommTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getScommVirtual() {
        return scommVirtual;
    }

    public void setScommVirtual(Integer scommVirtual) {
        this.scommVirtual = scommVirtual;
    }

    public String getScommContent() {
        return scommContent;
    }

    public void setScommContent(String scommContent) {
        this.scommContent = scommContent == null ? null : scommContent.trim();
    }
}