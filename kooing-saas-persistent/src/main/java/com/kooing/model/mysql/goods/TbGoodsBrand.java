package com.kooing.model.mysql.goods;

import java.util.Date;

public class TbGoodsBrand {
    private Integer brandId;

    private String uuid;

    private Integer appId;

    private String brandName;

    private String brandInitial;

    private String brandClass;

    private String brandPic;

    private Integer brandSort;

    private Integer brandRecommend;

    private Integer storeId;

    private Integer brandApply;

    private Integer classId;

    private Integer showType;

    private Date updateTime;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandInitial() {
        return brandInitial;
    }

    public void setBrandInitial(String brandInitial) {
        this.brandInitial = brandInitial == null ? null : brandInitial.trim();
    }

    public String getBrandClass() {
        return brandClass;
    }

    public void setBrandClass(String brandClass) {
        this.brandClass = brandClass == null ? null : brandClass.trim();
    }

    public String getBrandPic() {
        return brandPic;
    }

    public void setBrandPic(String brandPic) {
        this.brandPic = brandPic == null ? null : brandPic.trim();
    }

    public Integer getBrandSort() {
        return brandSort;
    }

    public void setBrandSort(Integer brandSort) {
        this.brandSort = brandSort;
    }

    public Integer getBrandRecommend() {
        return brandRecommend;
    }

    public void setBrandRecommend(Integer brandRecommend) {
        this.brandRecommend = brandRecommend;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getBrandApply() {
        return brandApply;
    }

    public void setBrandApply(Integer brandApply) {
        this.brandApply = brandApply;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}