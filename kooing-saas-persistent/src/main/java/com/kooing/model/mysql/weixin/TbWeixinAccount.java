package com.kooing.model.mysql.weixin;

import java.util.Date;

public class TbWeixinAccount {
    private Long accountId;

    private String accountName;

    private String accountToken;

    private String accountUrl;

    private String accountNumber;

    private String accountOriginalId;

    private String accountType;

    private String accountEmail;

    private String accountDesc;

    private String accountAppid;

    private String accountAppsecret;

    private String lastsychendopenid;

    private Date addTokenTime;

    private Long shopId;

    private String isActivied;

    private Date activeTime;

    private String isDisabled;

    private String isDisabledRemark;

    private String isOff;

    private String isOffRemark;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountToken() {
        return accountToken;
    }

    public void setAccountToken(String accountToken) {
        this.accountToken = accountToken == null ? null : accountToken.trim();
    }

    public String getAccountUrl() {
        return accountUrl;
    }

    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl == null ? null : accountUrl.trim();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }

    public String getAccountOriginalId() {
        return accountOriginalId;
    }

    public void setAccountOriginalId(String accountOriginalId) {
        this.accountOriginalId = accountOriginalId == null ? null : accountOriginalId.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail == null ? null : accountEmail.trim();
    }

    public String getAccountDesc() {
        return accountDesc;
    }

    public void setAccountDesc(String accountDesc) {
        this.accountDesc = accountDesc == null ? null : accountDesc.trim();
    }

    public String getAccountAppid() {
        return accountAppid;
    }

    public void setAccountAppid(String accountAppid) {
        this.accountAppid = accountAppid == null ? null : accountAppid.trim();
    }

    public String getAccountAppsecret() {
        return accountAppsecret;
    }

    public void setAccountAppsecret(String accountAppsecret) {
        this.accountAppsecret = accountAppsecret == null ? null : accountAppsecret.trim();
    }

    public String getLastsychendopenid() {
        return lastsychendopenid;
    }

    public void setLastsychendopenid(String lastsychendopenid) {
        this.lastsychendopenid = lastsychendopenid == null ? null : lastsychendopenid.trim();
    }

    public Date getAddTokenTime() {
        return addTokenTime;
    }

    public void setAddTokenTime(Date addTokenTime) {
        this.addTokenTime = addTokenTime;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getIsActivied() {
        return isActivied;
    }

    public void setIsActivied(String isActivied) {
        this.isActivied = isActivied == null ? null : isActivied.trim();
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public String getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(String isDisabled) {
        this.isDisabled = isDisabled == null ? null : isDisabled.trim();
    }

    public String getIsDisabledRemark() {
        return isDisabledRemark;
    }

    public void setIsDisabledRemark(String isDisabledRemark) {
        this.isDisabledRemark = isDisabledRemark == null ? null : isDisabledRemark.trim();
    }

    public String getIsOff() {
        return isOff;
    }

    public void setIsOff(String isOff) {
        this.isOff = isOff == null ? null : isOff.trim();
    }

    public String getIsOffRemark() {
        return isOffRemark;
    }

    public void setIsOffRemark(String isOffRemark) {
        this.isOffRemark = isOffRemark == null ? null : isOffRemark.trim();
    }
}