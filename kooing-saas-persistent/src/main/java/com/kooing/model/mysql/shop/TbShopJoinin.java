package com.kooing.model.mysql.shop;

import java.math.BigDecimal;
import java.util.Date;

public class TbShopJoinin {
    private Integer id;

    private Integer memberId;

    private String uuid;

    private Integer appId;

    private String memberName;

    private String memberPhone;

    private String memberAccount;

    private String memberPassword;

    private String storeType;

    private String memberAddress;

    private String memberEmail;

    private String idcard;

    private String idcardFront;

    private String idcardBack;

    private String idcardHandLicense;

    private String storeName;

    private String storeClassIds;

    private String storeClassNames;

    private String authState;

    private Date authTime;

    private String joininState;

    private String joininMessage;

    private Integer joininYear;

    private String sgName;

    private Integer sgId;

    private String sgInfo;

    private String scName;

    private Integer scId;

    private BigDecimal scBail;

    private String storeClassCommisRates;

    private String companyName;

    private Integer companyProvinceId;

    private Integer companyCityId;

    private Integer companyAreaId;

    private String companyAddress;

    private String companyAddressDetail;

    private String companyPhone;

    private Integer companyEmployeeCount;

    private BigDecimal companyRegisteredCapital;

    private String businessLicenceNumber;

    private String businessLicenceAddress;

    private Date businessLicenceStart;

    private Date businessLicenceEnd;

    private String businessSphere;

    private String businessLicenceNumberElectronic;

    private String organizationCode;

    private String organizationCodeElectronic;

    private String generalTaxpayer;

    private String bankAccountName;

    private String bankAccountNumber;

    private String bankName;

    private String bankCode;

    private String bankAddress;

    private String bankLicenceElectronic;

    private Integer isSettlementAccount;

    private String settlementBankAccountName;

    private String settlementBankAccountNumber;

    private String settlementBankName;

    private String settlementBankCode;

    private String settlementBankAddress;

    private String taxRegistrationCertificate;

    private String taxpayerId;

    private String taxRegistrationCertificateElectronic;

    private String payingMoneyCertificate;

    private String payingMoneyCertificateExplain;

    private BigDecimal payingAmount;

    private String payState;

    private Date createTime;

    private Date updateTime;

    private Date expireTime;

    private String memberTruename;

    private String businesslicenceImg;

    private String legalcertifyImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
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

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType == null ? null : storeType.trim();
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

    public String getStoreClassIds() {
        return storeClassIds;
    }

    public void setStoreClassIds(String storeClassIds) {
        this.storeClassIds = storeClassIds == null ? null : storeClassIds.trim();
    }

    public String getStoreClassNames() {
        return storeClassNames;
    }

    public void setStoreClassNames(String storeClassNames) {
        this.storeClassNames = storeClassNames == null ? null : storeClassNames.trim();
    }

    public String getAuthState() {
        return authState;
    }

    public void setAuthState(String authState) {
        this.authState = authState == null ? null : authState.trim();
    }

    public Date getAuthTime() {
        return authTime;
    }

    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    public String getJoininState() {
        return joininState;
    }

    public void setJoininState(String joininState) {
        this.joininState = joininState == null ? null : joininState.trim();
    }

    public String getJoininMessage() {
        return joininMessage;
    }

    public void setJoininMessage(String joininMessage) {
        this.joininMessage = joininMessage == null ? null : joininMessage.trim();
    }

    public Integer getJoininYear() {
        return joininYear;
    }

    public void setJoininYear(Integer joininYear) {
        this.joininYear = joininYear;
    }

    public String getSgName() {
        return sgName;
    }

    public void setSgName(String sgName) {
        this.sgName = sgName == null ? null : sgName.trim();
    }

    public Integer getSgId() {
        return sgId;
    }

    public void setSgId(Integer sgId) {
        this.sgId = sgId;
    }

    public String getSgInfo() {
        return sgInfo;
    }

    public void setSgInfo(String sgInfo) {
        this.sgInfo = sgInfo == null ? null : sgInfo.trim();
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public BigDecimal getScBail() {
        return scBail;
    }

    public void setScBail(BigDecimal scBail) {
        this.scBail = scBail;
    }

    public String getStoreClassCommisRates() {
        return storeClassCommisRates;
    }

    public void setStoreClassCommisRates(String storeClassCommisRates) {
        this.storeClassCommisRates = storeClassCommisRates == null ? null : storeClassCommisRates.trim();
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

    public Integer getCompanyAreaId() {
        return companyAreaId;
    }

    public void setCompanyAreaId(Integer companyAreaId) {
        this.companyAreaId = companyAreaId;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyAddressDetail() {
        return companyAddressDetail;
    }

    public void setCompanyAddressDetail(String companyAddressDetail) {
        this.companyAddressDetail = companyAddressDetail == null ? null : companyAddressDetail.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public Integer getCompanyEmployeeCount() {
        return companyEmployeeCount;
    }

    public void setCompanyEmployeeCount(Integer companyEmployeeCount) {
        this.companyEmployeeCount = companyEmployeeCount;
    }

    public BigDecimal getCompanyRegisteredCapital() {
        return companyRegisteredCapital;
    }

    public void setCompanyRegisteredCapital(BigDecimal companyRegisteredCapital) {
        this.companyRegisteredCapital = companyRegisteredCapital;
    }

    public String getBusinessLicenceNumber() {
        return businessLicenceNumber;
    }

    public void setBusinessLicenceNumber(String businessLicenceNumber) {
        this.businessLicenceNumber = businessLicenceNumber == null ? null : businessLicenceNumber.trim();
    }

    public String getBusinessLicenceAddress() {
        return businessLicenceAddress;
    }

    public void setBusinessLicenceAddress(String businessLicenceAddress) {
        this.businessLicenceAddress = businessLicenceAddress == null ? null : businessLicenceAddress.trim();
    }

    public Date getBusinessLicenceStart() {
        return businessLicenceStart;
    }

    public void setBusinessLicenceStart(Date businessLicenceStart) {
        this.businessLicenceStart = businessLicenceStart;
    }

    public Date getBusinessLicenceEnd() {
        return businessLicenceEnd;
    }

    public void setBusinessLicenceEnd(Date businessLicenceEnd) {
        this.businessLicenceEnd = businessLicenceEnd;
    }

    public String getBusinessSphere() {
        return businessSphere;
    }

    public void setBusinessSphere(String businessSphere) {
        this.businessSphere = businessSphere == null ? null : businessSphere.trim();
    }

    public String getBusinessLicenceNumberElectronic() {
        return businessLicenceNumberElectronic;
    }

    public void setBusinessLicenceNumberElectronic(String businessLicenceNumberElectronic) {
        this.businessLicenceNumberElectronic = businessLicenceNumberElectronic == null ? null : businessLicenceNumberElectronic.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getOrganizationCodeElectronic() {
        return organizationCodeElectronic;
    }

    public void setOrganizationCodeElectronic(String organizationCodeElectronic) {
        this.organizationCodeElectronic = organizationCodeElectronic == null ? null : organizationCodeElectronic.trim();
    }

    public String getGeneralTaxpayer() {
        return generalTaxpayer;
    }

    public void setGeneralTaxpayer(String generalTaxpayer) {
        this.generalTaxpayer = generalTaxpayer == null ? null : generalTaxpayer.trim();
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber == null ? null : bankAccountNumber.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    public String getBankLicenceElectronic() {
        return bankLicenceElectronic;
    }

    public void setBankLicenceElectronic(String bankLicenceElectronic) {
        this.bankLicenceElectronic = bankLicenceElectronic == null ? null : bankLicenceElectronic.trim();
    }

    public Integer getIsSettlementAccount() {
        return isSettlementAccount;
    }

    public void setIsSettlementAccount(Integer isSettlementAccount) {
        this.isSettlementAccount = isSettlementAccount;
    }

    public String getSettlementBankAccountName() {
        return settlementBankAccountName;
    }

    public void setSettlementBankAccountName(String settlementBankAccountName) {
        this.settlementBankAccountName = settlementBankAccountName == null ? null : settlementBankAccountName.trim();
    }

    public String getSettlementBankAccountNumber() {
        return settlementBankAccountNumber;
    }

    public void setSettlementBankAccountNumber(String settlementBankAccountNumber) {
        this.settlementBankAccountNumber = settlementBankAccountNumber == null ? null : settlementBankAccountNumber.trim();
    }

    public String getSettlementBankName() {
        return settlementBankName;
    }

    public void setSettlementBankName(String settlementBankName) {
        this.settlementBankName = settlementBankName == null ? null : settlementBankName.trim();
    }

    public String getSettlementBankCode() {
        return settlementBankCode;
    }

    public void setSettlementBankCode(String settlementBankCode) {
        this.settlementBankCode = settlementBankCode == null ? null : settlementBankCode.trim();
    }

    public String getSettlementBankAddress() {
        return settlementBankAddress;
    }

    public void setSettlementBankAddress(String settlementBankAddress) {
        this.settlementBankAddress = settlementBankAddress == null ? null : settlementBankAddress.trim();
    }

    public String getTaxRegistrationCertificate() {
        return taxRegistrationCertificate;
    }

    public void setTaxRegistrationCertificate(String taxRegistrationCertificate) {
        this.taxRegistrationCertificate = taxRegistrationCertificate == null ? null : taxRegistrationCertificate.trim();
    }

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId == null ? null : taxpayerId.trim();
    }

    public String getTaxRegistrationCertificateElectronic() {
        return taxRegistrationCertificateElectronic;
    }

    public void setTaxRegistrationCertificateElectronic(String taxRegistrationCertificateElectronic) {
        this.taxRegistrationCertificateElectronic = taxRegistrationCertificateElectronic == null ? null : taxRegistrationCertificateElectronic.trim();
    }

    public String getPayingMoneyCertificate() {
        return payingMoneyCertificate;
    }

    public void setPayingMoneyCertificate(String payingMoneyCertificate) {
        this.payingMoneyCertificate = payingMoneyCertificate == null ? null : payingMoneyCertificate.trim();
    }

    public String getPayingMoneyCertificateExplain() {
        return payingMoneyCertificateExplain;
    }

    public void setPayingMoneyCertificateExplain(String payingMoneyCertificateExplain) {
        this.payingMoneyCertificateExplain = payingMoneyCertificateExplain == null ? null : payingMoneyCertificateExplain.trim();
    }

    public BigDecimal getPayingAmount() {
        return payingAmount;
    }

    public void setPayingAmount(BigDecimal payingAmount) {
        this.payingAmount = payingAmount;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState == null ? null : payState.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getMemberTruename() {
        return memberTruename;
    }

    public void setMemberTruename(String memberTruename) {
        this.memberTruename = memberTruename == null ? null : memberTruename.trim();
    }

    public String getBusinesslicenceImg() {
        return businesslicenceImg;
    }

    public void setBusinesslicenceImg(String businesslicenceImg) {
        this.businesslicenceImg = businesslicenceImg == null ? null : businesslicenceImg.trim();
    }

    public String getLegalcertifyImg() {
        return legalcertifyImg;
    }

    public void setLegalcertifyImg(String legalcertifyImg) {
        this.legalcertifyImg = legalcertifyImg == null ? null : legalcertifyImg.trim();
    }
}