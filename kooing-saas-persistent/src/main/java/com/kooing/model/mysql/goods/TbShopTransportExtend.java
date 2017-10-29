package com.kooing.model.mysql.goods;

import java.math.BigDecimal;
import java.util.Date;

public class TbShopTransportExtend {
    private Integer id;

    private String uuid;

    private Integer appId;

    private String areaId;

    private String topAreaId;

    private String areaName;

    private Integer snum;

    private BigDecimal sprice;

    private Integer xnum;

    private BigDecimal xprice;

    private Integer isDefault;

    private Integer transportId;

    private String transportTitle;

    private Date updateTime;

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

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getTopAreaId() {
        return topAreaId;
    }

    public void setTopAreaId(String topAreaId) {
        this.topAreaId = topAreaId == null ? null : topAreaId.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getSnum() {
        return snum;
    }

    public void setSnum(Integer snum) {
        this.snum = snum;
    }

    public BigDecimal getSprice() {
        return sprice;
    }

    public void setSprice(BigDecimal sprice) {
        this.sprice = sprice;
    }

    public Integer getXnum() {
        return xnum;
    }

    public void setXnum(Integer xnum) {
        this.xnum = xnum;
    }

    public BigDecimal getXprice() {
        return xprice;
    }

    public void setXprice(BigDecimal xprice) {
        this.xprice = xprice;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getTransportId() {
        return transportId;
    }

    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    public String getTransportTitle() {
        return transportTitle;
    }

    public void setTransportTitle(String transportTitle) {
        this.transportTitle = transportTitle == null ? null : transportTitle.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}