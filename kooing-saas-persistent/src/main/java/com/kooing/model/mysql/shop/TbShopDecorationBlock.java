package com.kooing.model.mysql.shop;

import java.util.Date;

public class TbShopDecorationBlock {
    private Integer blockId;

    private String uuid;

    private Integer appId;

    private Integer decorationId;

    private Integer storeId;

    private String blockLayout;

    private String blockModuleType;

    private Integer blockFullWidth;

    private Integer blockSort;

    private Date updateTime;

    private String blockContent;

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
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

    public Integer getDecorationId() {
        return decorationId;
    }

    public void setDecorationId(Integer decorationId) {
        this.decorationId = decorationId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getBlockLayout() {
        return blockLayout;
    }

    public void setBlockLayout(String blockLayout) {
        this.blockLayout = blockLayout == null ? null : blockLayout.trim();
    }

    public String getBlockModuleType() {
        return blockModuleType;
    }

    public void setBlockModuleType(String blockModuleType) {
        this.blockModuleType = blockModuleType == null ? null : blockModuleType.trim();
    }

    public Integer getBlockFullWidth() {
        return blockFullWidth;
    }

    public void setBlockFullWidth(Integer blockFullWidth) {
        this.blockFullWidth = blockFullWidth;
    }

    public Integer getBlockSort() {
        return blockSort;
    }

    public void setBlockSort(Integer blockSort) {
        this.blockSort = blockSort;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBlockContent() {
        return blockContent;
    }

    public void setBlockContent(String blockContent) {
        this.blockContent = blockContent == null ? null : blockContent.trim();
    }
}