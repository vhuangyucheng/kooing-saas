package com.kooing.model.mysql.goods;

import java.util.Date;

public class TbGoodsGift {
    private Integer giftId;

    private String uuid;

    private Integer appId;

    private Integer goodsId;

    private Integer goodsCommonid;

    private Integer giftGoodsid;

    private String giftGoodsname;

    private String giftGoodsimage;

    private Integer giftAmount;

    private Date updateTime;

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
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

    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }

    public Integer getGiftGoodsid() {
        return giftGoodsid;
    }

    public void setGiftGoodsid(Integer giftGoodsid) {
        this.giftGoodsid = giftGoodsid;
    }

    public String getGiftGoodsname() {
        return giftGoodsname;
    }

    public void setGiftGoodsname(String giftGoodsname) {
        this.giftGoodsname = giftGoodsname == null ? null : giftGoodsname.trim();
    }

    public String getGiftGoodsimage() {
        return giftGoodsimage;
    }

    public void setGiftGoodsimage(String giftGoodsimage) {
        this.giftGoodsimage = giftGoodsimage == null ? null : giftGoodsimage.trim();
    }

    public Integer getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(Integer giftAmount) {
        this.giftAmount = giftAmount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}