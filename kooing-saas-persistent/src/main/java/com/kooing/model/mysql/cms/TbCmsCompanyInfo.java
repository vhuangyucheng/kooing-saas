package com.kooing.model.mysql.cms;

import java.util.Date;

public class TbCmsCompanyInfo {
    private Integer companyInfoId;

    private Integer appId;

    private String uuid;

    private String postCode;

    private String companyTel;

    private String email;

    private Integer arctinyId;

    private String companyAddress;

    private Date updateTime;

    private String logo;

    private Integer arctypeId;

    private String companyIntro;

    public Integer getCompanyInfoId() {
        return companyInfoId;
    }

    public void setCompanyInfoId(Integer companyInfoId) {
        this.companyInfoId = companyInfoId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel == null ? null : companyTel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getArctinyId() {
        return arctinyId;
    }

    public void setArctinyId(Integer arctinyId) {
        this.arctinyId = arctinyId;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Integer getArctypeId() {
        return arctypeId;
    }

    public void setArctypeId(Integer arctypeId) {
        this.arctypeId = arctypeId;
    }

    public String getCompanyIntro() {
        return companyIntro;
    }

    public void setCompanyIntro(String companyIntro) {
        this.companyIntro = companyIntro == null ? null : companyIntro.trim();
    }
}