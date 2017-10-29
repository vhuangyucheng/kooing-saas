package com.kooing.model.mysql.logistics;

import java.util.Date;

public class TbLgmDeliveryPoint {
    private Integer dlypId;

    private String uuid;

    private Integer appId;

    private String dlypName;

    private String dlypPasswd;

    private String dlypTruename;

    private String dlypMobile;

    private String dlypTelephony;

    private String dlypAddressName;

    private Integer dlypArea2;

    private Integer dlypArea3;

    private String dlypAreaInfo;

    private String dlypAddress;

    private String dlypIdcard;

    private String dlypIdcardImage;

    private Date dlypAddtime;

    private Integer dlypState;

    private String dlypFailReason;

    private Date updateTime;

    public Integer getDlypId() {
        return dlypId;
    }

    public void setDlypId(Integer dlypId) {
        this.dlypId = dlypId;
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

    public String getDlypName() {
        return dlypName;
    }

    public void setDlypName(String dlypName) {
        this.dlypName = dlypName == null ? null : dlypName.trim();
    }

    public String getDlypPasswd() {
        return dlypPasswd;
    }

    public void setDlypPasswd(String dlypPasswd) {
        this.dlypPasswd = dlypPasswd == null ? null : dlypPasswd.trim();
    }

    public String getDlypTruename() {
        return dlypTruename;
    }

    public void setDlypTruename(String dlypTruename) {
        this.dlypTruename = dlypTruename == null ? null : dlypTruename.trim();
    }

    public String getDlypMobile() {
        return dlypMobile;
    }

    public void setDlypMobile(String dlypMobile) {
        this.dlypMobile = dlypMobile == null ? null : dlypMobile.trim();
    }

    public String getDlypTelephony() {
        return dlypTelephony;
    }

    public void setDlypTelephony(String dlypTelephony) {
        this.dlypTelephony = dlypTelephony == null ? null : dlypTelephony.trim();
    }

    public String getDlypAddressName() {
        return dlypAddressName;
    }

    public void setDlypAddressName(String dlypAddressName) {
        this.dlypAddressName = dlypAddressName == null ? null : dlypAddressName.trim();
    }

    public Integer getDlypArea2() {
        return dlypArea2;
    }

    public void setDlypArea2(Integer dlypArea2) {
        this.dlypArea2 = dlypArea2;
    }

    public Integer getDlypArea3() {
        return dlypArea3;
    }

    public void setDlypArea3(Integer dlypArea3) {
        this.dlypArea3 = dlypArea3;
    }

    public String getDlypAreaInfo() {
        return dlypAreaInfo;
    }

    public void setDlypAreaInfo(String dlypAreaInfo) {
        this.dlypAreaInfo = dlypAreaInfo == null ? null : dlypAreaInfo.trim();
    }

    public String getDlypAddress() {
        return dlypAddress;
    }

    public void setDlypAddress(String dlypAddress) {
        this.dlypAddress = dlypAddress == null ? null : dlypAddress.trim();
    }

    public String getDlypIdcard() {
        return dlypIdcard;
    }

    public void setDlypIdcard(String dlypIdcard) {
        this.dlypIdcard = dlypIdcard == null ? null : dlypIdcard.trim();
    }

    public String getDlypIdcardImage() {
        return dlypIdcardImage;
    }

    public void setDlypIdcardImage(String dlypIdcardImage) {
        this.dlypIdcardImage = dlypIdcardImage == null ? null : dlypIdcardImage.trim();
    }

    public Date getDlypAddtime() {
        return dlypAddtime;
    }

    public void setDlypAddtime(Date dlypAddtime) {
        this.dlypAddtime = dlypAddtime;
    }

    public Integer getDlypState() {
        return dlypState;
    }

    public void setDlypState(Integer dlypState) {
        this.dlypState = dlypState;
    }

    public String getDlypFailReason() {
        return dlypFailReason;
    }

    public void setDlypFailReason(String dlypFailReason) {
        this.dlypFailReason = dlypFailReason == null ? null : dlypFailReason.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}