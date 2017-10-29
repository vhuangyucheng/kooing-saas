package com.kooing.model.mysql.goods;

import java.util.Date;

public class TbGoodsImages {
    private Integer goodsImageId;

    private String uuid;

    private Integer appId;

    private Integer goodsCommonid;

    private Integer storeId;

    private Integer colorId;

    private String goodsImage;

    private Integer goodsImageSort;

    private Integer isDefault;

    private Date updateTime;

    public Integer getGoodsImageId() {
        return goodsImageId;
    }

    public void setGoodsImageId(Integer goodsImageId) {
        this.goodsImageId = goodsImageId;
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

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public Integer getGoodsImageSort() {
        return goodsImageSort;
    }

    public void setGoodsImageSort(Integer goodsImageSort) {
        this.goodsImageSort = goodsImageSort;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}