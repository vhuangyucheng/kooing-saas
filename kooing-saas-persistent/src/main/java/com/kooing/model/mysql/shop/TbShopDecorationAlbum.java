package com.kooing.model.mysql.shop;

import java.util.Date;

public class TbShopDecorationAlbum {
    private Integer imageId;

    private String uuid;

    private Integer appId;

    private String imageName;

    private String imageOriginName;

    private Integer imageWidth;

    private Integer imageHeight;

    private String imageUrl;

    private Float imageSize;

    private Integer storeId;

    private Date uploadTime;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getImageOriginName() {
        return imageOriginName;
    }

    public void setImageOriginName(String imageOriginName) {
        this.imageOriginName = imageOriginName == null ? null : imageOriginName.trim();
    }

    public Integer getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    public Integer getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Float getImageSize() {
        return imageSize;
    }

    public void setImageSize(Float imageSize) {
        this.imageSize = imageSize;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}