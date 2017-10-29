package com.kooing.model.mysql.point;

import java.util.Date;

public class TbPointsCart {
    private Integer pcartId;

    private String uuid;

    private Integer appId;

    private Integer pmemberId;

    private Integer pgoodsId;

    private String pgoodsName;

    private Integer pgoodsPoints;

    private Integer pgoodsChoosenum;

    private String pgoodsImage;

    private Date updateTime;

    public Integer getPcartId() {
        return pcartId;
    }

    public void setPcartId(Integer pcartId) {
        this.pcartId = pcartId;
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

    public Integer getPmemberId() {
        return pmemberId;
    }

    public void setPmemberId(Integer pmemberId) {
        this.pmemberId = pmemberId;
    }

    public Integer getPgoodsId() {
        return pgoodsId;
    }

    public void setPgoodsId(Integer pgoodsId) {
        this.pgoodsId = pgoodsId;
    }

    public String getPgoodsName() {
        return pgoodsName;
    }

    public void setPgoodsName(String pgoodsName) {
        this.pgoodsName = pgoodsName == null ? null : pgoodsName.trim();
    }

    public Integer getPgoodsPoints() {
        return pgoodsPoints;
    }

    public void setPgoodsPoints(Integer pgoodsPoints) {
        this.pgoodsPoints = pgoodsPoints;
    }

    public Integer getPgoodsChoosenum() {
        return pgoodsChoosenum;
    }

    public void setPgoodsChoosenum(Integer pgoodsChoosenum) {
        this.pgoodsChoosenum = pgoodsChoosenum;
    }

    public String getPgoodsImage() {
        return pgoodsImage;
    }

    public void setPgoodsImage(String pgoodsImage) {
        this.pgoodsImage = pgoodsImage == null ? null : pgoodsImage.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}