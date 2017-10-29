package com.kooing.model.mysql.goods;

import java.math.BigDecimal;
import java.util.Date;

public class TbGoods {
    private Integer goodsId;

    private String uuid;

    private Integer appId;

    private Integer goodsCommonid;

    private String goodsName;

    private String goodsJingle;

    private Integer supId;

    private Integer storeId;

    private String storeName;

    private Integer gcId;

    private Integer gcId1;

    private Integer gcId2;

    private Integer gcId3;

    private Integer brandId;

    private BigDecimal goodsPrice;

    private BigDecimal goodsPromotionPrice;

    private Integer goodsPromotionType;

    private BigDecimal goodsMarketprice;

    private BigDecimal tradePrice;

    private String goodsSerial;

    private BigDecimal commisRate;

    private Integer goodsStorageAlarm;

    private String goodsCommonSpec;

    private String goodsSpecSimple;

    private String goodsSpec;

    private Integer goodsStorage;

    private String goodsImage;

    private Integer goodsState;

    private Integer goodsVerify;

    private Date goodsAddtime;

    private Date goodsEdittime;

    private Integer areaid1;

    private Integer areaid2;

    private Integer colorId;

    private Integer transportId;

    private Integer goodsFreight;

    private Integer goodsVat;

    private Integer goodsCommend;

    private String goodsStcids;

    private Integer evaluationGoodStar;

    private Integer evaluationCount;

    private Integer isVirtual;

    private Date virtualIndate;

    private Integer virtualLimit;

    private Integer virtualInvalidRefund;

    private Integer isFcode;

    private Integer isAppoint;

    private Integer isPresell;

    private Integer haveGift;

    private Integer isNew;

    private Integer isOwnShop;

    private Date updateTime;

    private String goodsType;

    private Integer goodsCollect;

    private Integer goodsLikenum;

    private Integer goodsShare;

    private BigDecimal priceTmp;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsJingle() {
        return goodsJingle;
    }

    public void setGoodsJingle(String goodsJingle) {
        this.goodsJingle = goodsJingle == null ? null : goodsJingle.trim();
    }

    public Integer getSupId() {
        return supId;
    }

    public void setSupId(Integer supId) {
        this.supId = supId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsPromotionPrice() {
        return goodsPromotionPrice;
    }

    public void setGoodsPromotionPrice(BigDecimal goodsPromotionPrice) {
        this.goodsPromotionPrice = goodsPromotionPrice;
    }

    public Integer getGoodsPromotionType() {
        return goodsPromotionType;
    }

    public void setGoodsPromotionType(Integer goodsPromotionType) {
        this.goodsPromotionType = goodsPromotionType;
    }

    public BigDecimal getGoodsMarketprice() {
        return goodsMarketprice;
    }

    public void setGoodsMarketprice(BigDecimal goodsMarketprice) {
        this.goodsMarketprice = goodsMarketprice;
    }

    public BigDecimal getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(BigDecimal tradePrice) {
        this.tradePrice = tradePrice;
    }

    public String getGoodsSerial() {
        return goodsSerial;
    }

    public void setGoodsSerial(String goodsSerial) {
        this.goodsSerial = goodsSerial == null ? null : goodsSerial.trim();
    }

    public BigDecimal getCommisRate() {
        return commisRate;
    }

    public void setCommisRate(BigDecimal commisRate) {
        this.commisRate = commisRate;
    }

    public Integer getGoodsStorageAlarm() {
        return goodsStorageAlarm;
    }

    public void setGoodsStorageAlarm(Integer goodsStorageAlarm) {
        this.goodsStorageAlarm = goodsStorageAlarm;
    }

    public String getGoodsCommonSpec() {
        return goodsCommonSpec;
    }

    public void setGoodsCommonSpec(String goodsCommonSpec) {
        this.goodsCommonSpec = goodsCommonSpec == null ? null : goodsCommonSpec.trim();
    }

    public String getGoodsSpecSimple() {
        return goodsSpecSimple;
    }

    public void setGoodsSpecSimple(String goodsSpecSimple) {
        this.goodsSpecSimple = goodsSpecSimple == null ? null : goodsSpecSimple.trim();
    }

    public String getGoodsSpec() {
        return goodsSpec;
    }

    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec == null ? null : goodsSpec.trim();
    }

    public Integer getGoodsStorage() {
        return goodsStorage;
    }

    public void setGoodsStorage(Integer goodsStorage) {
        this.goodsStorage = goodsStorage;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public Integer getGoodsVerify() {
        return goodsVerify;
    }

    public void setGoodsVerify(Integer goodsVerify) {
        this.goodsVerify = goodsVerify;
    }

    public Date getGoodsAddtime() {
        return goodsAddtime;
    }

    public void setGoodsAddtime(Date goodsAddtime) {
        this.goodsAddtime = goodsAddtime;
    }

    public Date getGoodsEdittime() {
        return goodsEdittime;
    }

    public void setGoodsEdittime(Date goodsEdittime) {
        this.goodsEdittime = goodsEdittime;
    }

    public Integer getAreaid1() {
        return areaid1;
    }

    public void setAreaid1(Integer areaid1) {
        this.areaid1 = areaid1;
    }

    public Integer getAreaid2() {
        return areaid2;
    }

    public void setAreaid2(Integer areaid2) {
        this.areaid2 = areaid2;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getTransportId() {
        return transportId;
    }

    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    public Integer getGoodsFreight() {
        return goodsFreight;
    }

    public void setGoodsFreight(Integer goodsFreight) {
        this.goodsFreight = goodsFreight;
    }

    public Integer getGoodsVat() {
        return goodsVat;
    }

    public void setGoodsVat(Integer goodsVat) {
        this.goodsVat = goodsVat;
    }

    public Integer getGoodsCommend() {
        return goodsCommend;
    }

    public void setGoodsCommend(Integer goodsCommend) {
        this.goodsCommend = goodsCommend;
    }

    public String getGoodsStcids() {
        return goodsStcids;
    }

    public void setGoodsStcids(String goodsStcids) {
        this.goodsStcids = goodsStcids == null ? null : goodsStcids.trim();
    }

    public Integer getEvaluationGoodStar() {
        return evaluationGoodStar;
    }

    public void setEvaluationGoodStar(Integer evaluationGoodStar) {
        this.evaluationGoodStar = evaluationGoodStar;
    }

    public Integer getEvaluationCount() {
        return evaluationCount;
    }

    public void setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
    }

    public Integer getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Integer isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Date getVirtualIndate() {
        return virtualIndate;
    }

    public void setVirtualIndate(Date virtualIndate) {
        this.virtualIndate = virtualIndate;
    }

    public Integer getVirtualLimit() {
        return virtualLimit;
    }

    public void setVirtualLimit(Integer virtualLimit) {
        this.virtualLimit = virtualLimit;
    }

    public Integer getVirtualInvalidRefund() {
        return virtualInvalidRefund;
    }

    public void setVirtualInvalidRefund(Integer virtualInvalidRefund) {
        this.virtualInvalidRefund = virtualInvalidRefund;
    }

    public Integer getIsFcode() {
        return isFcode;
    }

    public void setIsFcode(Integer isFcode) {
        this.isFcode = isFcode;
    }

    public Integer getIsAppoint() {
        return isAppoint;
    }

    public void setIsAppoint(Integer isAppoint) {
        this.isAppoint = isAppoint;
    }

    public Integer getIsPresell() {
        return isPresell;
    }

    public void setIsPresell(Integer isPresell) {
        this.isPresell = isPresell;
    }

    public Integer getHaveGift() {
        return haveGift;
    }

    public void setHaveGift(Integer haveGift) {
        this.haveGift = haveGift;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public Integer getIsOwnShop() {
        return isOwnShop;
    }

    public void setIsOwnShop(Integer isOwnShop) {
        this.isOwnShop = isOwnShop;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public Integer getGoodsCollect() {
        return goodsCollect;
    }

    public void setGoodsCollect(Integer goodsCollect) {
        this.goodsCollect = goodsCollect;
    }

    public Integer getGoodsLikenum() {
        return goodsLikenum;
    }

    public void setGoodsLikenum(Integer goodsLikenum) {
        this.goodsLikenum = goodsLikenum;
    }

    public Integer getGoodsShare() {
        return goodsShare;
    }

    public void setGoodsShare(Integer goodsShare) {
        this.goodsShare = goodsShare;
    }

    public BigDecimal getPriceTmp() {
        return priceTmp;
    }

    public void setPriceTmp(BigDecimal priceTmp) {
        this.priceTmp = priceTmp;
    }
}