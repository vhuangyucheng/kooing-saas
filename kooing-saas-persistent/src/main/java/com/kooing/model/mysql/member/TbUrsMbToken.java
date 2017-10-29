package com.kooing.model.mysql.member;

import java.util.Date;

public class TbUrsMbToken {
    private Integer tokenId;

    private String uuid;

    private Integer appId;

    private Integer memberId;

    private String memberName;

    private String token;

    private Date loginTime;

    private String clientType;

    private String memberAge;

    private String memberTermBrand;

    private String memberTermModel;

    private String memberTermOs;

    private String memberTermOsver;

    private String memberTermScreen;

    private String memberMobileResolution;

    private String memberMobileOperator;

    private String memberNetworkingMode;

    private Date updateTime;

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    public String getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(String memberAge) {
        this.memberAge = memberAge == null ? null : memberAge.trim();
    }

    public String getMemberTermBrand() {
        return memberTermBrand;
    }

    public void setMemberTermBrand(String memberTermBrand) {
        this.memberTermBrand = memberTermBrand == null ? null : memberTermBrand.trim();
    }

    public String getMemberTermModel() {
        return memberTermModel;
    }

    public void setMemberTermModel(String memberTermModel) {
        this.memberTermModel = memberTermModel == null ? null : memberTermModel.trim();
    }

    public String getMemberTermOs() {
        return memberTermOs;
    }

    public void setMemberTermOs(String memberTermOs) {
        this.memberTermOs = memberTermOs == null ? null : memberTermOs.trim();
    }

    public String getMemberTermOsver() {
        return memberTermOsver;
    }

    public void setMemberTermOsver(String memberTermOsver) {
        this.memberTermOsver = memberTermOsver == null ? null : memberTermOsver.trim();
    }

    public String getMemberTermScreen() {
        return memberTermScreen;
    }

    public void setMemberTermScreen(String memberTermScreen) {
        this.memberTermScreen = memberTermScreen == null ? null : memberTermScreen.trim();
    }

    public String getMemberMobileResolution() {
        return memberMobileResolution;
    }

    public void setMemberMobileResolution(String memberMobileResolution) {
        this.memberMobileResolution = memberMobileResolution == null ? null : memberMobileResolution.trim();
    }

    public String getMemberMobileOperator() {
        return memberMobileOperator;
    }

    public void setMemberMobileOperator(String memberMobileOperator) {
        this.memberMobileOperator = memberMobileOperator == null ? null : memberMobileOperator.trim();
    }

    public String getMemberNetworkingMode() {
        return memberNetworkingMode;
    }

    public void setMemberNetworkingMode(String memberNetworkingMode) {
        this.memberNetworkingMode = memberNetworkingMode == null ? null : memberNetworkingMode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}