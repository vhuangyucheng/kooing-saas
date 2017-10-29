package com.kooing.model.mysql.point;

import java.math.BigDecimal;
import java.util.Date;

public class TbPointsGoods {
    private Integer pgoodsId;

    private String uuid;

    private Integer appId;

    private String pgoodsName;

    private BigDecimal pgoodsPrice;

    private Integer pgoodsPoints;

    private String pgoodsImage;

    private String pgoodsTag;

    private String pgoodsSerial;

    private Integer pgoodsStorage;

    private Boolean pgoodsShow;

    private Boolean pgoodsCommend;

    private Date pgoodsAddTime;

    private String pgoodsKeywords;

    private String pgoodsDescription;

    private Boolean pgoodsState;

    private String pgoodsCloseReason;

    private Integer pgoodsSalenum;

    private Integer pgoodsView;

    private Boolean pgoodsIslimit;

    private Integer pgoodsLimitnum;

    private Boolean pgoodsIslimittime;

    private Integer pgoodsLimitmgrade;

    private Date pgoodsStarttime;

    private Date pgoodsEndtime;

    private Integer pgoodsSort;

    private Date updateTime;

    private String pgoodsBody;

    public Integer getPgoodsId() {
        return pgoodsId;
    }

    public void setPgoodsId(Integer pgoodsId) {
        this.pgoodsId = pgoodsId;
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

    public String getPgoodsName() {
        return pgoodsName;
    }

    public void setPgoodsName(String pgoodsName) {
        this.pgoodsName = pgoodsName == null ? null : pgoodsName.trim();
    }

    public BigDecimal getPgoodsPrice() {
        return pgoodsPrice;
    }

    public void setPgoodsPrice(BigDecimal pgoodsPrice) {
        this.pgoodsPrice = pgoodsPrice;
    }

    public Integer getPgoodsPoints() {
        return pgoodsPoints;
    }

    public void setPgoodsPoints(Integer pgoodsPoints) {
        this.pgoodsPoints = pgoodsPoints;
    }

    public String getPgoodsImage() {
        return pgoodsImage;
    }

    public void setPgoodsImage(String pgoodsImage) {
        this.pgoodsImage = pgoodsImage == null ? null : pgoodsImage.trim();
    }

    public String getPgoodsTag() {
        return pgoodsTag;
    }

    public void setPgoodsTag(String pgoodsTag) {
        this.pgoodsTag = pgoodsTag == null ? null : pgoodsTag.trim();
    }

    public String getPgoodsSerial() {
        return pgoodsSerial;
    }

    public void setPgoodsSerial(String pgoodsSerial) {
        this.pgoodsSerial = pgoodsSerial == null ? null : pgoodsSerial.trim();
    }

    public Integer getPgoodsStorage() {
        return pgoodsStorage;
    }

    public void setPgoodsStorage(Integer pgoodsStorage) {
        this.pgoodsStorage = pgoodsStorage;
    }

    public Boolean getPgoodsShow() {
        return pgoodsShow;
    }

    public void setPgoodsShow(Boolean pgoodsShow) {
        this.pgoodsShow = pgoodsShow;
    }

    public Boolean getPgoodsCommend() {
        return pgoodsCommend;
    }

    public void setPgoodsCommend(Boolean pgoodsCommend) {
        this.pgoodsCommend = pgoodsCommend;
    }

    public Date getPgoodsAddTime() {
        return pgoodsAddTime;
    }

    public void setPgoodsAddTime(Date pgoodsAddTime) {
        this.pgoodsAddTime = pgoodsAddTime;
    }

    public String getPgoodsKeywords() {
        return pgoodsKeywords;
    }

    public void setPgoodsKeywords(String pgoodsKeywords) {
        this.pgoodsKeywords = pgoodsKeywords == null ? null : pgoodsKeywords.trim();
    }

    public String getPgoodsDescription() {
        return pgoodsDescription;
    }

    public void setPgoodsDescription(String pgoodsDescription) {
        this.pgoodsDescription = pgoodsDescription == null ? null : pgoodsDescription.trim();
    }

    public Boolean getPgoodsState() {
        return pgoodsState;
    }

    public void setPgoodsState(Boolean pgoodsState) {
        this.pgoodsState = pgoodsState;
    }

    public String getPgoodsCloseReason() {
        return pgoodsCloseReason;
    }

    public void setPgoodsCloseReason(String pgoodsCloseReason) {
        this.pgoodsCloseReason = pgoodsCloseReason == null ? null : pgoodsCloseReason.trim();
    }

    public Integer getPgoodsSalenum() {
        return pgoodsSalenum;
    }

    public void setPgoodsSalenum(Integer pgoodsSalenum) {
        this.pgoodsSalenum = pgoodsSalenum;
    }

    public Integer getPgoodsView() {
        return pgoodsView;
    }

    public void setPgoodsView(Integer pgoodsView) {
        this.pgoodsView = pgoodsView;
    }

    public Boolean getPgoodsIslimit() {
        return pgoodsIslimit;
    }

    public void setPgoodsIslimit(Boolean pgoodsIslimit) {
        this.pgoodsIslimit = pgoodsIslimit;
    }

    public Integer getPgoodsLimitnum() {
        return pgoodsLimitnum;
    }

    public void setPgoodsLimitnum(Integer pgoodsLimitnum) {
        this.pgoodsLimitnum = pgoodsLimitnum;
    }

    public Boolean getPgoodsIslimittime() {
        return pgoodsIslimittime;
    }

    public void setPgoodsIslimittime(Boolean pgoodsIslimittime) {
        this.pgoodsIslimittime = pgoodsIslimittime;
    }

    public Integer getPgoodsLimitmgrade() {
        return pgoodsLimitmgrade;
    }

    public void setPgoodsLimitmgrade(Integer pgoodsLimitmgrade) {
        this.pgoodsLimitmgrade = pgoodsLimitmgrade;
    }

    public Date getPgoodsStarttime() {
        return pgoodsStarttime;
    }

    public void setPgoodsStarttime(Date pgoodsStarttime) {
        this.pgoodsStarttime = pgoodsStarttime;
    }

    public Date getPgoodsEndtime() {
        return pgoodsEndtime;
    }

    public void setPgoodsEndtime(Date pgoodsEndtime) {
        this.pgoodsEndtime = pgoodsEndtime;
    }

    public Integer getPgoodsSort() {
        return pgoodsSort;
    }

    public void setPgoodsSort(Integer pgoodsSort) {
        this.pgoodsSort = pgoodsSort;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPgoodsBody() {
        return pgoodsBody;
    }

    public void setPgoodsBody(String pgoodsBody) {
        this.pgoodsBody = pgoodsBody == null ? null : pgoodsBody.trim();
    }
}