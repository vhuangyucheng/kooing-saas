package com.kooing.model.mysql.order;

import java.util.Date;

public class TbOdmArrivalNotice {
    private Integer anId;

    private String uuid;

    private Integer appId;

    private Integer goodsId;

    private String goodsName;

    private Integer memberId;

    private Date anAddtime;

    private String anEmail;

    private String anMobile;

    private Integer anType;

    private Date updateTime;

    public Integer getAnId() {
        return anId;
    }

    public void setAnId(Integer anId) {
        this.anId = anId;
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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getAnAddtime() {
        return anAddtime;
    }

    public void setAnAddtime(Date anAddtime) {
        this.anAddtime = anAddtime;
    }

    public String getAnEmail() {
        return anEmail;
    }

    public void setAnEmail(String anEmail) {
        this.anEmail = anEmail == null ? null : anEmail.trim();
    }

    public String getAnMobile() {
        return anMobile;
    }

    public void setAnMobile(String anMobile) {
        this.anMobile = anMobile == null ? null : anMobile.trim();
    }

    public Integer getAnType() {
        return anType;
    }

    public void setAnType(Integer anType) {
        this.anType = anType;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}