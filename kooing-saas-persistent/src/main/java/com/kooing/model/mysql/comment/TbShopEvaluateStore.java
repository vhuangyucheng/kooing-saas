package com.kooing.model.mysql.comment;

import java.util.Date;

public class TbShopEvaluateStore {
    private Integer sevalId;

    private String uuid;

    private Integer appId;

    private Integer sevalOrderid;

    private String sevalOrderno;

    private Date sevalAddtime;

    private Integer sevalStoreid;

    private String sevalStorename;

    private Integer sevalMemberid;

    private String sevalMembername;

    private Boolean sevalDesccredit;

    private Boolean sevalServicecredit;

    private Boolean sevalDeliverycredit;

    private Date updateTime;

    public Integer getSevalId() {
        return sevalId;
    }

    public void setSevalId(Integer sevalId) {
        this.sevalId = sevalId;
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

    public Integer getSevalOrderid() {
        return sevalOrderid;
    }

    public void setSevalOrderid(Integer sevalOrderid) {
        this.sevalOrderid = sevalOrderid;
    }

    public String getSevalOrderno() {
        return sevalOrderno;
    }

    public void setSevalOrderno(String sevalOrderno) {
        this.sevalOrderno = sevalOrderno == null ? null : sevalOrderno.trim();
    }

    public Date getSevalAddtime() {
        return sevalAddtime;
    }

    public void setSevalAddtime(Date sevalAddtime) {
        this.sevalAddtime = sevalAddtime;
    }

    public Integer getSevalStoreid() {
        return sevalStoreid;
    }

    public void setSevalStoreid(Integer sevalStoreid) {
        this.sevalStoreid = sevalStoreid;
    }

    public String getSevalStorename() {
        return sevalStorename;
    }

    public void setSevalStorename(String sevalStorename) {
        this.sevalStorename = sevalStorename == null ? null : sevalStorename.trim();
    }

    public Integer getSevalMemberid() {
        return sevalMemberid;
    }

    public void setSevalMemberid(Integer sevalMemberid) {
        this.sevalMemberid = sevalMemberid;
    }

    public String getSevalMembername() {
        return sevalMembername;
    }

    public void setSevalMembername(String sevalMembername) {
        this.sevalMembername = sevalMembername == null ? null : sevalMembername.trim();
    }

    public Boolean getSevalDesccredit() {
        return sevalDesccredit;
    }

    public void setSevalDesccredit(Boolean sevalDesccredit) {
        this.sevalDesccredit = sevalDesccredit;
    }

    public Boolean getSevalServicecredit() {
        return sevalServicecredit;
    }

    public void setSevalServicecredit(Boolean sevalServicecredit) {
        this.sevalServicecredit = sevalServicecredit;
    }

    public Boolean getSevalDeliverycredit() {
        return sevalDeliverycredit;
    }

    public void setSevalDeliverycredit(Boolean sevalDeliverycredit) {
        this.sevalDeliverycredit = sevalDeliverycredit;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}