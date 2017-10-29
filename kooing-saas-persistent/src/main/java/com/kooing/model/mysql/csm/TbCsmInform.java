package com.kooing.model.mysql.csm;

import java.util.Date;

public class TbCsmInform {
    private Integer informId;

    private String uuid;

    private Integer appId;

    private Integer informMemberId;

    private String informMemberName;

    private Integer informGoodsId;

    private String informGoodsName;

    private Integer informSubjectId;

    private String informSubjectContent;

    private String informContent;

    private String informPic1;

    private String informPic2;

    private String informPic3;

    private Date informDatetime;

    private Integer informStoreId;

    private Byte informState;

    private Byte informHandleType;

    private String informHandleMessage;

    private Date informHandleDatetime;

    private Integer informHandleMemberId;

    private String informGoodsImage;

    private String informStoreName;

    private Date updateTime;

    public Integer getInformId() {
        return informId;
    }

    public void setInformId(Integer informId) {
        this.informId = informId;
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

    public Integer getInformMemberId() {
        return informMemberId;
    }

    public void setInformMemberId(Integer informMemberId) {
        this.informMemberId = informMemberId;
    }

    public String getInformMemberName() {
        return informMemberName;
    }

    public void setInformMemberName(String informMemberName) {
        this.informMemberName = informMemberName == null ? null : informMemberName.trim();
    }

    public Integer getInformGoodsId() {
        return informGoodsId;
    }

    public void setInformGoodsId(Integer informGoodsId) {
        this.informGoodsId = informGoodsId;
    }

    public String getInformGoodsName() {
        return informGoodsName;
    }

    public void setInformGoodsName(String informGoodsName) {
        this.informGoodsName = informGoodsName == null ? null : informGoodsName.trim();
    }

    public Integer getInformSubjectId() {
        return informSubjectId;
    }

    public void setInformSubjectId(Integer informSubjectId) {
        this.informSubjectId = informSubjectId;
    }

    public String getInformSubjectContent() {
        return informSubjectContent;
    }

    public void setInformSubjectContent(String informSubjectContent) {
        this.informSubjectContent = informSubjectContent == null ? null : informSubjectContent.trim();
    }

    public String getInformContent() {
        return informContent;
    }

    public void setInformContent(String informContent) {
        this.informContent = informContent == null ? null : informContent.trim();
    }

    public String getInformPic1() {
        return informPic1;
    }

    public void setInformPic1(String informPic1) {
        this.informPic1 = informPic1 == null ? null : informPic1.trim();
    }

    public String getInformPic2() {
        return informPic2;
    }

    public void setInformPic2(String informPic2) {
        this.informPic2 = informPic2 == null ? null : informPic2.trim();
    }

    public String getInformPic3() {
        return informPic3;
    }

    public void setInformPic3(String informPic3) {
        this.informPic3 = informPic3 == null ? null : informPic3.trim();
    }

    public Date getInformDatetime() {
        return informDatetime;
    }

    public void setInformDatetime(Date informDatetime) {
        this.informDatetime = informDatetime;
    }

    public Integer getInformStoreId() {
        return informStoreId;
    }

    public void setInformStoreId(Integer informStoreId) {
        this.informStoreId = informStoreId;
    }

    public Byte getInformState() {
        return informState;
    }

    public void setInformState(Byte informState) {
        this.informState = informState;
    }

    public Byte getInformHandleType() {
        return informHandleType;
    }

    public void setInformHandleType(Byte informHandleType) {
        this.informHandleType = informHandleType;
    }

    public String getInformHandleMessage() {
        return informHandleMessage;
    }

    public void setInformHandleMessage(String informHandleMessage) {
        this.informHandleMessage = informHandleMessage == null ? null : informHandleMessage.trim();
    }

    public Date getInformHandleDatetime() {
        return informHandleDatetime;
    }

    public void setInformHandleDatetime(Date informHandleDatetime) {
        this.informHandleDatetime = informHandleDatetime;
    }

    public Integer getInformHandleMemberId() {
        return informHandleMemberId;
    }

    public void setInformHandleMemberId(Integer informHandleMemberId) {
        this.informHandleMemberId = informHandleMemberId;
    }

    public String getInformGoodsImage() {
        return informGoodsImage;
    }

    public void setInformGoodsImage(String informGoodsImage) {
        this.informGoodsImage = informGoodsImage == null ? null : informGoodsImage.trim();
    }

    public String getInformStoreName() {
        return informStoreName;
    }

    public void setInformStoreName(String informStoreName) {
        this.informStoreName = informStoreName == null ? null : informStoreName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}