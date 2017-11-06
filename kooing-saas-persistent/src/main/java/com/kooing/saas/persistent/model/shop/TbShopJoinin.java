package com.kooing.saas.persistent.model.shop;

import java.util.Date;

public class TbShopJoinin {
    private Integer shopJoininId;

    private Integer memberId;

    private String uuid;

    private String memberName;

    private String memberPhone;

    private String memberAccount;

    private String memberPassword;

    private Integer storeType;

    private String memberAddress;

    private String memberEmail;

    private String idcard;

    private String idcardFront;

    private String idcardBack;

    private String idcardHandLicense;

    private String storeName;

    private Integer authState;

    private Date authTime;

    private String companyName;

    private Integer companyProvinceId;

    private Integer companyCityId;

    private String companyAddress;

    private String companyPhone;

    public Integer getShopJoininId() {
        return shopJoininId;
    }

    public void setShopJoininId(Integer shopJoininId) {
        this.shopJoininId = shopJoininId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone == null ? null : memberPhone.trim();
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount == null ? null : memberAccount.trim();
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword == null ? null : memberPassword.trim();
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress == null ? null : memberAddress.trim();
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getIdcardFront() {
        return idcardFront;
    }

    public void setIdcardFront(String idcardFront) {
        this.idcardFront = idcardFront == null ? null : idcardFront.trim();
    }

    public String getIdcardBack() {
        return idcardBack;
    }

    public void setIdcardBack(String idcardBack) {
        this.idcardBack = idcardBack == null ? null : idcardBack.trim();
    }

    public String getIdcardHandLicense() {
        return idcardHandLicense;
    }

    public void setIdcardHandLicense(String idcardHandLicense) {
        this.idcardHandLicense = idcardHandLicense == null ? null : idcardHandLicense.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getAuthState() {
        return authState;
    }

    public void setAuthState(Integer authState) {
        this.authState = authState;
    }

    public Date getAuthTime() {
        return authTime;
    }

    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getCompanyProvinceId() {
        return companyProvinceId;
    }

    public void setCompanyProvinceId(Integer companyProvinceId) {
        this.companyProvinceId = companyProvinceId;
    }

    public Integer getCompanyCityId() {
        return companyCityId;
    }

    public void setCompanyCityId(Integer companyCityId) {
        this.companyCityId = companyCityId;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }
}