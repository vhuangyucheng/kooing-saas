package com.kooing.model.mysql.goods;

import java.math.BigDecimal;
import java.util.Date;

public class TbGoodsCommon {
    private Integer goodsCommonid;

    private String uuid;

    private Integer appId;

    private String goodsName;

    private String goodsJingle;

    private Integer gcId;

    private Integer gcId1;

    private Integer gcId2;

    private Integer gcId3;

    private String gcName;

    private Integer supId;

    private Integer storeId;

    private String storeName;

    private String specName;

    private String specValue;

    private String goodSpecValue;

    private Integer brandId;

    private String brandName;

    private Integer typeId;

    private String goodsImage;

    private String goodsAttr;

    private Integer goodsState;

    private String goodsStateremark;

    private Integer goodsVerify;

    private String goodsVerifyremark;

    private Integer goodsLock;

    private Date goodsAddtime;

    private Date goodsSelltime;

    private Date goodsOffselltime;

    private Integer goodsStorage;

    private Integer goodsClick;

    private Integer goodsSalenum;

    private Integer goodsCollect;

    private Integer goodsLikenum;

    private Integer goodsShare;

    private Integer evaluationGoodStar;

    private Integer evaluationCount;

    private BigDecimal comprehensiveScore;

    private String goodsSpecname;

    private BigDecimal goodsPrice;

    private BigDecimal goodsMarketprice;

    private BigDecimal goodsCostprice;

    private BigDecimal goodsDiscount;

    private String goodsSerial;

    private Integer goodsStorageAlarm;

    private Integer transportId;

    private String transportTitle;

    private Integer goodsCommend;

    private Integer goodsFreight;

    private String goodsService;

    private String otherService;

    private Integer goodsVat;

    private Integer areaid1;

    private Integer areaid2;

    private String goodsStcids;

    private Integer plateidTop;

    private Integer plateidBottom;

    private Integer isVirtual;

    private Integer virtualIndate;

    private Integer virtualLimit;

    private Integer virtualInvalidRefund;

    private Integer isFcode;

    private Integer isAppoint;

    private Date appointSatedate;

    private Integer isPresell;

    private Date presellDeliverdate;

    private Integer isOwnShop;

    private Date updateTime;

    private BigDecimal commisRate;

    private String goodsType;

    private String goodsFlag;

    private BigDecimal priceTmp;

    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
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

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName == null ? null : gcName.trim();
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

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }

    public String getSpecValue() {
        return specValue;
    }

    public void setSpecValue(String specValue) {
        this.specValue = specValue == null ? null : specValue.trim();
    }

    public String getGoodSpecValue() {
        return goodSpecValue;
    }

    public void setGoodSpecValue(String goodSpecValue) {
        this.goodSpecValue = goodSpecValue == null ? null : goodSpecValue.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr == null ? null : goodsAttr.trim();
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public String getGoodsStateremark() {
        return goodsStateremark;
    }

    public void setGoodsStateremark(String goodsStateremark) {
        this.goodsStateremark = goodsStateremark == null ? null : goodsStateremark.trim();
    }

    public Integer getGoodsVerify() {
        return goodsVerify;
    }

    public void setGoodsVerify(Integer goodsVerify) {
        this.goodsVerify = goodsVerify;
    }

    public String getGoodsVerifyremark() {
        return goodsVerifyremark;
    }

    public void setGoodsVerifyremark(String goodsVerifyremark) {
        this.goodsVerifyremark = goodsVerifyremark == null ? null : goodsVerifyremark.trim();
    }

    public Integer getGoodsLock() {
        return goodsLock;
    }

    public void setGoodsLock(Integer goodsLock) {
        this.goodsLock = goodsLock;
    }

    public Date getGoodsAddtime() {
        return goodsAddtime;
    }

    public void setGoodsAddtime(Date goodsAddtime) {
        this.goodsAddtime = goodsAddtime;
    }

    public Date getGoodsSelltime() {
        return goodsSelltime;
    }

    public void setGoodsSelltime(Date goodsSelltime) {
        this.goodsSelltime = goodsSelltime;
    }

    public Date getGoodsOffselltime() {
        return goodsOffselltime;
    }

    public void setGoodsOffselltime(Date goodsOffselltime) {
        this.goodsOffselltime = goodsOffselltime;
    }

    public Integer getGoodsStorage() {
        return goodsStorage;
    }

    public void setGoodsStorage(Integer goodsStorage) {
        this.goodsStorage = goodsStorage;
    }

    public Integer getGoodsClick() {
        return goodsClick;
    }

    public void setGoodsClick(Integer goodsClick) {
        this.goodsClick = goodsClick;
    }

    public Integer getGoodsSalenum() {
        return goodsSalenum;
    }

    public void setGoodsSalenum(Integer goodsSalenum) {
        this.goodsSalenum = goodsSalenum;
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

    public BigDecimal getComprehensiveScore() {
        return comprehensiveScore;
    }

    public void setComprehensiveScore(BigDecimal comprehensiveScore) {
        this.comprehensiveScore = comprehensiveScore;
    }

    public String getGoodsSpecname() {
        return goodsSpecname;
    }

    public void setGoodsSpecname(String goodsSpecname) {
        this.goodsSpecname = goodsSpecname == null ? null : goodsSpecname.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsMarketprice() {
        return goodsMarketprice;
    }

    public void setGoodsMarketprice(BigDecimal goodsMarketprice) {
        this.goodsMarketprice = goodsMarketprice;
    }

    public BigDecimal getGoodsCostprice() {
        return goodsCostprice;
    }

    public void setGoodsCostprice(BigDecimal goodsCostprice) {
        this.goodsCostprice = goodsCostprice;
    }

    public BigDecimal getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(BigDecimal goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public String getGoodsSerial() {
        return goodsSerial;
    }

    public void setGoodsSerial(String goodsSerial) {
        this.goodsSerial = goodsSerial == null ? null : goodsSerial.trim();
    }

    public Integer getGoodsStorageAlarm() {
        return goodsStorageAlarm;
    }

    public void setGoodsStorageAlarm(Integer goodsStorageAlarm) {
        this.goodsStorageAlarm = goodsStorageAlarm;
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

    public Integer getGoodsCommend() {
        return goodsCommend;
    }

    public void setGoodsCommend(Integer goodsCommend) {
        this.goodsCommend = goodsCommend;
    }

    public Integer getGoodsFreight() {
        return goodsFreight;
    }

    public void setGoodsFreight(Integer goodsFreight) {
        this.goodsFreight = goodsFreight;
    }

    public String getGoodsService() {
        return goodsService;
    }

    public void setGoodsService(String goodsService) {
        this.goodsService = goodsService == null ? null : goodsService.trim();
    }

    public String getOtherService() {
        return otherService;
    }

    public void setOtherService(String otherService) {
        this.otherService = otherService == null ? null : otherService.trim();
    }

    public Integer getGoodsVat() {
        return goodsVat;
    }

    public void setGoodsVat(Integer goodsVat) {
        this.goodsVat = goodsVat;
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

    public String getGoodsStcids() {
        return goodsStcids;
    }

    public void setGoodsStcids(String goodsStcids) {
        this.goodsStcids = goodsStcids == null ? null : goodsStcids.trim();
    }

    public Integer getPlateidTop() {
        return plateidTop;
    }

    public void setPlateidTop(Integer plateidTop) {
        this.plateidTop = plateidTop;
    }

    public Integer getPlateidBottom() {
        return plateidBottom;
    }

    public void setPlateidBottom(Integer plateidBottom) {
        this.plateidBottom = plateidBottom;
    }

    public Integer getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Integer isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Integer getVirtualIndate() {
        return virtualIndate;
    }

    public void setVirtualIndate(Integer virtualIndate) {
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

    public Date getAppointSatedate() {
        return appointSatedate;
    }

    public void setAppointSatedate(Date appointSatedate) {
        this.appointSatedate = appointSatedate;
    }

    public Integer getIsPresell() {
        return isPresell;
    }

    public void setIsPresell(Integer isPresell) {
        this.isPresell = isPresell;
    }

    public Date getPresellDeliverdate() {
        return presellDeliverdate;
    }

    public void setPresellDeliverdate(Date presellDeliverdate) {
        this.presellDeliverdate = presellDeliverdate;
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

    public BigDecimal getCommisRate() {
        return commisRate;
    }

    public void setCommisRate(BigDecimal commisRate) {
        this.commisRate = commisRate;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getGoodsFlag() {
        return goodsFlag;
    }

    public void setGoodsFlag(String goodsFlag) {
        this.goodsFlag = goodsFlag == null ? null : goodsFlag.trim();
    }

    public BigDecimal getPriceTmp() {
        return priceTmp;
    }

    public void setPriceTmp(BigDecimal priceTmp) {
        this.priceTmp = priceTmp;
    }
}