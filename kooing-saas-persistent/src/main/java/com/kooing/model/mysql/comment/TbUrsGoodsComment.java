package com.kooing.model.mysql.comment;

import java.util.Date;

public class TbUrsGoodsComment {
    private Integer id;

    private String uuid;

    private Integer appId;

    private String type;

    private Integer orderId;

    private Integer orderGoodsId;

    private String commentType;

    private Integer isHiddenName;

    private String virtualUserAvatar;

    private String virtualUserName;

    private Integer goodsId;

    private Integer goodsCommonid;

    private Integer storeId;

    private Integer memberId;

    private Integer qualityMark;

    private Integer serviceMark;

    private Integer logisticsMark;

    private Integer countState;

    private Date commentTime;

    private Integer gcId;

    private Integer gcId1;

    private Integer gcId2;

    private Integer gcId3;

    private String goodsName;

    private Date updateTime;

    private String deleteState;

    private String commentContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType == null ? null : commentType.trim();
    }

    public Integer getIsHiddenName() {
        return isHiddenName;
    }

    public void setIsHiddenName(Integer isHiddenName) {
        this.isHiddenName = isHiddenName;
    }

    public String getVirtualUserAvatar() {
        return virtualUserAvatar;
    }

    public void setVirtualUserAvatar(String virtualUserAvatar) {
        this.virtualUserAvatar = virtualUserAvatar == null ? null : virtualUserAvatar.trim();
    }

    public String getVirtualUserName() {
        return virtualUserName;
    }

    public void setVirtualUserName(String virtualUserName) {
        this.virtualUserName = virtualUserName == null ? null : virtualUserName.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getQualityMark() {
        return qualityMark;
    }

    public void setQualityMark(Integer qualityMark) {
        this.qualityMark = qualityMark;
    }

    public Integer getServiceMark() {
        return serviceMark;
    }

    public void setServiceMark(Integer serviceMark) {
        this.serviceMark = serviceMark;
    }

    public Integer getLogisticsMark() {
        return logisticsMark;
    }

    public void setLogisticsMark(Integer logisticsMark) {
        this.logisticsMark = logisticsMark;
    }

    public Integer getCountState() {
        return countState;
    }

    public void setCountState(Integer countState) {
        this.countState = countState;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getGcId() {
        return gcId;
    }

    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    public Integer getGcId1() {
        return gcId1;
    }

    public void setGcId1(Integer gcId1) {
        this.gcId1 = gcId1;
    }

    public Integer getGcId2() {
        return gcId2;
    }

    public void setGcId2(Integer gcId2) {
        this.gcId2 = gcId2;
    }

    public Integer getGcId3() {
        return gcId3;
    }

    public void setGcId3(Integer gcId3) {
        this.gcId3 = gcId3;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(String deleteState) {
        this.deleteState = deleteState == null ? null : deleteState.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}