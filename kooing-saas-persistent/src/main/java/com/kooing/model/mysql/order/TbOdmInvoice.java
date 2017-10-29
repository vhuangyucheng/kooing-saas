package com.kooing.model.mysql.order;

import java.util.Date;

public class TbOdmInvoice {
    private Integer invId;

    private Integer appId;

    private Integer memberId;

    private Integer invState;

    private String invTitle;

    private String invContent;

    private String invCompany;

    private String invCode;

    private String invRegAddr;

    private String invRegPhone;

    private String invRegBname;

    private String invRegBaccount;

    private String invRecName;

    private String invRecMobphone;

    private String invRecProvince;

    private String invGotoAddr;

    private Date updateTime;

    private String uuid;

    public Integer getInvId() {
        return invId;
    }

    public void setInvId(Integer invId) {
        this.invId = invId;
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

    public Integer getInvState() {
        return invState;
    }

    public void setInvState(Integer invState) {
        this.invState = invState;
    }

    public String getInvTitle() {
        return invTitle;
    }

    public void setInvTitle(String invTitle) {
        this.invTitle = invTitle == null ? null : invTitle.trim();
    }

    public String getInvContent() {
        return invContent;
    }

    public void setInvContent(String invContent) {
        this.invContent = invContent == null ? null : invContent.trim();
    }

    public String getInvCompany() {
        return invCompany;
    }

    public void setInvCompany(String invCompany) {
        this.invCompany = invCompany == null ? null : invCompany.trim();
    }

    public String getInvCode() {
        return invCode;
    }

    public void setInvCode(String invCode) {
        this.invCode = invCode == null ? null : invCode.trim();
    }

    public String getInvRegAddr() {
        return invRegAddr;
    }

    public void setInvRegAddr(String invRegAddr) {
        this.invRegAddr = invRegAddr == null ? null : invRegAddr.trim();
    }

    public String getInvRegPhone() {
        return invRegPhone;
    }

    public void setInvRegPhone(String invRegPhone) {
        this.invRegPhone = invRegPhone == null ? null : invRegPhone.trim();
    }

    public String getInvRegBname() {
        return invRegBname;
    }

    public void setInvRegBname(String invRegBname) {
        this.invRegBname = invRegBname == null ? null : invRegBname.trim();
    }

    public String getInvRegBaccount() {
        return invRegBaccount;
    }

    public void setInvRegBaccount(String invRegBaccount) {
        this.invRegBaccount = invRegBaccount == null ? null : invRegBaccount.trim();
    }

    public String getInvRecName() {
        return invRecName;
    }

    public void setInvRecName(String invRecName) {
        this.invRecName = invRecName == null ? null : invRecName.trim();
    }

    public String getInvRecMobphone() {
        return invRecMobphone;
    }

    public void setInvRecMobphone(String invRecMobphone) {
        this.invRecMobphone = invRecMobphone == null ? null : invRecMobphone.trim();
    }

    public String getInvRecProvince() {
        return invRecProvince;
    }

    public void setInvRecProvince(String invRecProvince) {
        this.invRecProvince = invRecProvince == null ? null : invRecProvince.trim();
    }

    public String getInvGotoAddr() {
        return invGotoAddr;
    }

    public void setInvGotoAddr(String invGotoAddr) {
        this.invGotoAddr = invGotoAddr == null ? null : invGotoAddr.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }
}