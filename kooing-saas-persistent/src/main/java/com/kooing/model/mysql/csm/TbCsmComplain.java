package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmComplain {
    private Integer complainId;

    private String uuid;

    private Integer appId;

    private Integer orderId;

    private Integer orderGoodsId;

    private Integer accuserId;

    private String accuserName;

    private Integer accusedId;

    private String accusedName;

    private String complainSubjectContent;

    private Integer complainSubjectId;

    private String complainContent;

    private String complainPic1;

    private String complainPic2;

    private String complainPic3;

    private Integer complainDatetime;

    private Date complainHandleDatetime;

    private Integer complainHandleMemberId;

    private String appealMessage;

    private Integer appealDatetime;

    private String appealPic1;

    private String appealPic2;

    private String appealPic3;

    private String finalHandleMessage;

    private Date finalHandleDatetime;

    private Integer finalHandleMemberId;

    private Byte complainState;

    private Byte complainActive;

    private Date updateTime;

    public Integer getComplainId() {
        return complainId;
    }

    public void setComplainId(Integer complainId) {
        this.complainId = complainId;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Integer getAccuserId() {
        return accuserId;
    }

    public void setAccuserId(Integer accuserId) {
        this.accuserId = accuserId;
    }

    public String getAccuserName() {
        return accuserName;
    }

    public void setAccuserName(String accuserName) {
        this.accuserName = accuserName == null ? null : accuserName.trim();
    }

    public Integer getAccusedId() {
        return accusedId;
    }

    public void setAccusedId(Integer accusedId) {
        this.accusedId = accusedId;
    }

    public String getAccusedName() {
        return accusedName;
    }

    public void setAccusedName(String accusedName) {
        this.accusedName = accusedName == null ? null : accusedName.trim();
    }

    public String getComplainSubjectContent() {
        return complainSubjectContent;
    }

    public void setComplainSubjectContent(String complainSubjectContent) {
        this.complainSubjectContent = complainSubjectContent == null ? null : complainSubjectContent.trim();
    }

    public Integer getComplainSubjectId() {
        return complainSubjectId;
    }

    public void setComplainSubjectId(Integer complainSubjectId) {
        this.complainSubjectId = complainSubjectId;
    }

    public String getComplainContent() {
        return complainContent;
    }

    public void setComplainContent(String complainContent) {
        this.complainContent = complainContent == null ? null : complainContent.trim();
    }

    public String getComplainPic1() {
        return complainPic1;
    }

    public void setComplainPic1(String complainPic1) {
        this.complainPic1 = complainPic1 == null ? null : complainPic1.trim();
    }

    public String getComplainPic2() {
        return complainPic2;
    }

    public void setComplainPic2(String complainPic2) {
        this.complainPic2 = complainPic2 == null ? null : complainPic2.trim();
    }

    public String getComplainPic3() {
        return complainPic3;
    }

    public void setComplainPic3(String complainPic3) {
        this.complainPic3 = complainPic3 == null ? null : complainPic3.trim();
    }

    public Integer getComplainDatetime() {
        return complainDatetime;
    }

    public void setComplainDatetime(Integer complainDatetime) {
        this.complainDatetime = complainDatetime;
    }

    public Date getComplainHandleDatetime() {
        return complainHandleDatetime;
    }

    public void setComplainHandleDatetime(Date complainHandleDatetime) {
        this.complainHandleDatetime = complainHandleDatetime;
    }

    public Integer getComplainHandleMemberId() {
        return complainHandleMemberId;
    }

    public void setComplainHandleMemberId(Integer complainHandleMemberId) {
        this.complainHandleMemberId = complainHandleMemberId;
    }

    public String getAppealMessage() {
        return appealMessage;
    }

    public void setAppealMessage(String appealMessage) {
        this.appealMessage = appealMessage == null ? null : appealMessage.trim();
    }

    public Integer getAppealDatetime() {
        return appealDatetime;
    }

    public void setAppealDatetime(Integer appealDatetime) {
        this.appealDatetime = appealDatetime;
    }

    public String getAppealPic1() {
        return appealPic1;
    }

    public void setAppealPic1(String appealPic1) {
        this.appealPic1 = appealPic1 == null ? null : appealPic1.trim();
    }

    public String getAppealPic2() {
        return appealPic2;
    }

    public void setAppealPic2(String appealPic2) {
        this.appealPic2 = appealPic2 == null ? null : appealPic2.trim();
    }

    public String getAppealPic3() {
        return appealPic3;
    }

    public void setAppealPic3(String appealPic3) {
        this.appealPic3 = appealPic3 == null ? null : appealPic3.trim();
    }

    public String getFinalHandleMessage() {
        return finalHandleMessage;
    }

    public void setFinalHandleMessage(String finalHandleMessage) {
        this.finalHandleMessage = finalHandleMessage == null ? null : finalHandleMessage.trim();
    }

    public Date getFinalHandleDatetime() {
        return finalHandleDatetime;
    }

    public void setFinalHandleDatetime(Date finalHandleDatetime) {
        this.finalHandleDatetime = finalHandleDatetime;
    }

    public Integer getFinalHandleMemberId() {
        return finalHandleMemberId;
    }

    public void setFinalHandleMemberId(Integer finalHandleMemberId) {
        this.finalHandleMemberId = finalHandleMemberId;
    }

    public Byte getComplainState() {
        return complainState;
    }

    public void setComplainState(Byte complainState) {
        this.complainState = complainState;
    }

    public Byte getComplainActive() {
        return complainActive;
    }

    public void setComplainActive(Byte complainActive) {
        this.complainActive = complainActive;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}