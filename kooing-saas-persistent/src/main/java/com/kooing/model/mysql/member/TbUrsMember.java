package com.kooing.model.mysql.member;

import java.math.BigDecimal;
import java.util.Date;

public class TbUrsMember {
    private Integer memberId;

    private String uuid;

    private String appName;

    private Integer appId;

    private String appVersion;

    private String memberName;

    private String memberTruename;

    private String memberAvatar;

    private Integer memberSex;

    private String idcard;

    private Date memberBirthday;

    private String memberPasswd;

    private String memberPaypwd;

    private String memberEmail;

    private Integer memberEmailBind;

    private String memberMobile;

    private Integer memberMobileBind;

    private String memberQq;

    private String memberWw;

    private Integer memberLoginNum;

    private Date memberTime;

    private Date memberLoginTime;

    private Date memberOldLoginTime;

    private String memberLoginIp;

    private String memberOldLoginIp;

    private Date memberExitTime;

    private String memberWxopenid;

    private String memberQqopenid;

    private String memberSinaopenid;

    private Integer memberPoints;

    private BigDecimal availablePredeposit;

    private BigDecimal freezePredeposit;

    private BigDecimal availableRcBalance;

    private BigDecimal freezeRcBalance;

    private Integer informAllow;

    private Integer isBuy;

    private Integer isAllowtalk;

    private Integer memberState;

    private Integer memberSnsvisitnum;

    private Integer memberAreaid;

    private Integer memberCityid;

    private Integer memberProvinceid;

    private String memberAreainfo;

    private String memberQuicklink;

    private Integer memberExppoints;

    private String memberGrade;

    private Integer storeId;

    private String clientId;

    private Integer referrer;

    private Date updateTime;

    private Integer isDistribution;

    private String memberPayPasswordQuestions;

    private String memberPayPasswordAnswers;

    private String companyName;

    private Integer attestationFlag;

    private Integer payState;

    private BigDecimal deposit;

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

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberTruename() {
        return memberTruename;
    }

    public void setMemberTruename(String memberTruename) {
        this.memberTruename = memberTruename == null ? null : memberTruename.trim();
    }

    public String getMemberAvatar() {
        return memberAvatar;
    }

    public void setMemberAvatar(String memberAvatar) {
        this.memberAvatar = memberAvatar == null ? null : memberAvatar.trim();
    }

    public Integer getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(Integer memberSex) {
        this.memberSex = memberSex;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Date getMemberBirthday() {
        return memberBirthday;
    }

    public void setMemberBirthday(Date memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public String getMemberPasswd() {
        return memberPasswd;
    }

    public void setMemberPasswd(String memberPasswd) {
        this.memberPasswd = memberPasswd == null ? null : memberPasswd.trim();
    }

    public String getMemberPaypwd() {
        return memberPaypwd;
    }

    public void setMemberPaypwd(String memberPaypwd) {
        this.memberPaypwd = memberPaypwd == null ? null : memberPaypwd.trim();
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public Integer getMemberEmailBind() {
        return memberEmailBind;
    }

    public void setMemberEmailBind(Integer memberEmailBind) {
        this.memberEmailBind = memberEmailBind;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile == null ? null : memberMobile.trim();
    }

    public Integer getMemberMobileBind() {
        return memberMobileBind;
    }

    public void setMemberMobileBind(Integer memberMobileBind) {
        this.memberMobileBind = memberMobileBind;
    }

    public String getMemberQq() {
        return memberQq;
    }

    public void setMemberQq(String memberQq) {
        this.memberQq = memberQq == null ? null : memberQq.trim();
    }

    public String getMemberWw() {
        return memberWw;
    }

    public void setMemberWw(String memberWw) {
        this.memberWw = memberWw == null ? null : memberWw.trim();
    }

    public Integer getMemberLoginNum() {
        return memberLoginNum;
    }

    public void setMemberLoginNum(Integer memberLoginNum) {
        this.memberLoginNum = memberLoginNum;
    }

    public Date getMemberTime() {
        return memberTime;
    }

    public void setMemberTime(Date memberTime) {
        this.memberTime = memberTime;
    }

    public Date getMemberLoginTime() {
        return memberLoginTime;
    }

    public void setMemberLoginTime(Date memberLoginTime) {
        this.memberLoginTime = memberLoginTime;
    }

    public Date getMemberOldLoginTime() {
        return memberOldLoginTime;
    }

    public void setMemberOldLoginTime(Date memberOldLoginTime) {
        this.memberOldLoginTime = memberOldLoginTime;
    }

    public String getMemberLoginIp() {
        return memberLoginIp;
    }

    public void setMemberLoginIp(String memberLoginIp) {
        this.memberLoginIp = memberLoginIp == null ? null : memberLoginIp.trim();
    }

    public String getMemberOldLoginIp() {
        return memberOldLoginIp;
    }

    public void setMemberOldLoginIp(String memberOldLoginIp) {
        this.memberOldLoginIp = memberOldLoginIp == null ? null : memberOldLoginIp.trim();
    }

    public Date getMemberExitTime() {
        return memberExitTime;
    }

    public void setMemberExitTime(Date memberExitTime) {
        this.memberExitTime = memberExitTime;
    }

    public String getMemberWxopenid() {
        return memberWxopenid;
    }

    public void setMemberWxopenid(String memberWxopenid) {
        this.memberWxopenid = memberWxopenid == null ? null : memberWxopenid.trim();
    }

    public String getMemberQqopenid() {
        return memberQqopenid;
    }

    public void setMemberQqopenid(String memberQqopenid) {
        this.memberQqopenid = memberQqopenid == null ? null : memberQqopenid.trim();
    }

    public String getMemberSinaopenid() {
        return memberSinaopenid;
    }

    public void setMemberSinaopenid(String memberSinaopenid) {
        this.memberSinaopenid = memberSinaopenid == null ? null : memberSinaopenid.trim();
    }

    public Integer getMemberPoints() {
        return memberPoints;
    }

    public void setMemberPoints(Integer memberPoints) {
        this.memberPoints = memberPoints;
    }

    public BigDecimal getAvailablePredeposit() {
        return availablePredeposit;
    }

    public void setAvailablePredeposit(BigDecimal availablePredeposit) {
        this.availablePredeposit = availablePredeposit;
    }

    public BigDecimal getFreezePredeposit() {
        return freezePredeposit;
    }

    public void setFreezePredeposit(BigDecimal freezePredeposit) {
        this.freezePredeposit = freezePredeposit;
    }

    public BigDecimal getAvailableRcBalance() {
        return availableRcBalance;
    }

    public void setAvailableRcBalance(BigDecimal availableRcBalance) {
        this.availableRcBalance = availableRcBalance;
    }

    public BigDecimal getFreezeRcBalance() {
        return freezeRcBalance;
    }

    public void setFreezeRcBalance(BigDecimal freezeRcBalance) {
        this.freezeRcBalance = freezeRcBalance;
    }

    public Integer getInformAllow() {
        return informAllow;
    }

    public void setInformAllow(Integer informAllow) {
        this.informAllow = informAllow;
    }

    public Integer getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Integer isBuy) {
        this.isBuy = isBuy;
    }

    public Integer getIsAllowtalk() {
        return isAllowtalk;
    }

    public void setIsAllowtalk(Integer isAllowtalk) {
        this.isAllowtalk = isAllowtalk;
    }

    public Integer getMemberState() {
        return memberState;
    }

    public void setMemberState(Integer memberState) {
        this.memberState = memberState;
    }

    public Integer getMemberSnsvisitnum() {
        return memberSnsvisitnum;
    }

    public void setMemberSnsvisitnum(Integer memberSnsvisitnum) {
        this.memberSnsvisitnum = memberSnsvisitnum;
    }

    public Integer getMemberAreaid() {
        return memberAreaid;
    }

    public void setMemberAreaid(Integer memberAreaid) {
        this.memberAreaid = memberAreaid;
    }

    public Integer getMemberCityid() {
        return memberCityid;
    }

    public void setMemberCityid(Integer memberCityid) {
        this.memberCityid = memberCityid;
    }

    public Integer getMemberProvinceid() {
        return memberProvinceid;
    }

    public void setMemberProvinceid(Integer memberProvinceid) {
        this.memberProvinceid = memberProvinceid;
    }

    public String getMemberAreainfo() {
        return memberAreainfo;
    }

    public void setMemberAreainfo(String memberAreainfo) {
        this.memberAreainfo = memberAreainfo == null ? null : memberAreainfo.trim();
    }

    public String getMemberQuicklink() {
        return memberQuicklink;
    }

    public void setMemberQuicklink(String memberQuicklink) {
        this.memberQuicklink = memberQuicklink == null ? null : memberQuicklink.trim();
    }

    public Integer getMemberExppoints() {
        return memberExppoints;
    }

    public void setMemberExppoints(Integer memberExppoints) {
        this.memberExppoints = memberExppoints;
    }

    public String getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(String memberGrade) {
        this.memberGrade = memberGrade == null ? null : memberGrade.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public Integer getReferrer() {
        return referrer;
    }

    public void setReferrer(Integer referrer) {
        this.referrer = referrer;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDistribution() {
        return isDistribution;
    }

    public void setIsDistribution(Integer isDistribution) {
        this.isDistribution = isDistribution;
    }

    public String getMemberPayPasswordQuestions() {
        return memberPayPasswordQuestions;
    }

    public void setMemberPayPasswordQuestions(String memberPayPasswordQuestions) {
        this.memberPayPasswordQuestions = memberPayPasswordQuestions == null ? null : memberPayPasswordQuestions.trim();
    }

    public String getMemberPayPasswordAnswers() {
        return memberPayPasswordAnswers;
    }

    public void setMemberPayPasswordAnswers(String memberPayPasswordAnswers) {
        this.memberPayPasswordAnswers = memberPayPasswordAnswers == null ? null : memberPayPasswordAnswers.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getAttestationFlag() {
        return attestationFlag;
    }

    public void setAttestationFlag(Integer attestationFlag) {
        this.attestationFlag = attestationFlag;
    }

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }
}