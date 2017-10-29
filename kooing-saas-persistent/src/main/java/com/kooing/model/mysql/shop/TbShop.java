package com.kooing.model.mysql.shop;

import java.math.BigDecimal;

public class TbShop {
    private Integer storeId;

    private String uuid;

    private Integer appId;

    private String storeName;

    private Integer gradeId;

    private Integer memberId;

    private String memberName;

    private String sellerName;

    private Integer scId;

    private String storeCompanyName;

    private String longitude;

    private String latitude;

    private String areaInfo;

    private String storeAddress;

    private String storeZip;

    private Integer storeState;

    private String storeCloseInfo;

    private Integer storeSort;

    private String storeTime;

    private String storeEndTime;

    private String storeLabel;

    private String storeIntroduction;

    private String storeBanner;

    private String storeAvatar;

    private String storeKeywords;

    private String storeDescription;

    private String storeWx;

    private String storeQq;

    private String storeWw;

    private String storePhone;

    private String storeDomain;

    private Integer storeDomainTimes;

    private Integer storeRecommend;

    private String storeTheme;

    private Integer storeCredit;

    private Float storeQualityMark;

    private Float storeServiceMark;

    private Float storeLogisticsMark;

    private Integer newGoodsNumber;

    private Integer goodsNumber;

    private Integer storeCollect;

    private String storeStamp;

    private String storePrintdesc;

    private Integer storeSales;

    private String storeWorkingtime;

    private BigDecimal storeFreePrice;

    private Integer storeDecorationSwitch;

    private Integer storeDecorationOnly;

    private Integer storeDecorationImageCount;

    private String liveStoreName;

    private String liveStoreAddress;

    private String liveStoreTel;

    private String liveStoreBus;

    private Integer isOwnShop;

    private Integer bindAllGc;

    private String storeVrcodePrefix;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
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

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public String getStoreCompanyName() {
        return storeCompanyName;
    }

    public void setStoreCompanyName(String storeCompanyName) {
        this.storeCompanyName = storeCompanyName == null ? null : storeCompanyName.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getAreaInfo() {
        return areaInfo;
    }

    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo == null ? null : areaInfo.trim();
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    public String getStoreZip() {
        return storeZip;
    }

    public void setStoreZip(String storeZip) {
        this.storeZip = storeZip == null ? null : storeZip.trim();
    }

    public Integer getStoreState() {
        return storeState;
    }

    public void setStoreState(Integer storeState) {
        this.storeState = storeState;
    }

    public String getStoreCloseInfo() {
        return storeCloseInfo;
    }

    public void setStoreCloseInfo(String storeCloseInfo) {
        this.storeCloseInfo = storeCloseInfo == null ? null : storeCloseInfo.trim();
    }

    public Integer getStoreSort() {
        return storeSort;
    }

    public void setStoreSort(Integer storeSort) {
        this.storeSort = storeSort;
    }

    public String getStoreTime() {
        return storeTime;
    }

    public void setStoreTime(String storeTime) {
        this.storeTime = storeTime == null ? null : storeTime.trim();
    }

    public String getStoreEndTime() {
        return storeEndTime;
    }

    public void setStoreEndTime(String storeEndTime) {
        this.storeEndTime = storeEndTime == null ? null : storeEndTime.trim();
    }

    public String getStoreLabel() {
        return storeLabel;
    }

    public void setStoreLabel(String storeLabel) {
        this.storeLabel = storeLabel == null ? null : storeLabel.trim();
    }

    public String getStoreIntroduction() {
        return storeIntroduction;
    }

    public void setStoreIntroduction(String storeIntroduction) {
        this.storeIntroduction = storeIntroduction == null ? null : storeIntroduction.trim();
    }

    public String getStoreBanner() {
        return storeBanner;
    }

    public void setStoreBanner(String storeBanner) {
        this.storeBanner = storeBanner == null ? null : storeBanner.trim();
    }

    public String getStoreAvatar() {
        return storeAvatar;
    }

    public void setStoreAvatar(String storeAvatar) {
        this.storeAvatar = storeAvatar == null ? null : storeAvatar.trim();
    }

    public String getStoreKeywords() {
        return storeKeywords;
    }

    public void setStoreKeywords(String storeKeywords) {
        this.storeKeywords = storeKeywords == null ? null : storeKeywords.trim();
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription == null ? null : storeDescription.trim();
    }

    public String getStoreWx() {
        return storeWx;
    }

    public void setStoreWx(String storeWx) {
        this.storeWx = storeWx == null ? null : storeWx.trim();
    }

    public String getStoreQq() {
        return storeQq;
    }

    public void setStoreQq(String storeQq) {
        this.storeQq = storeQq == null ? null : storeQq.trim();
    }

    public String getStoreWw() {
        return storeWw;
    }

    public void setStoreWw(String storeWw) {
        this.storeWw = storeWw == null ? null : storeWw.trim();
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone == null ? null : storePhone.trim();
    }

    public String getStoreDomain() {
        return storeDomain;
    }

    public void setStoreDomain(String storeDomain) {
        this.storeDomain = storeDomain == null ? null : storeDomain.trim();
    }

    public Integer getStoreDomainTimes() {
        return storeDomainTimes;
    }

    public void setStoreDomainTimes(Integer storeDomainTimes) {
        this.storeDomainTimes = storeDomainTimes;
    }

    public Integer getStoreRecommend() {
        return storeRecommend;
    }

    public void setStoreRecommend(Integer storeRecommend) {
        this.storeRecommend = storeRecommend;
    }

    public String getStoreTheme() {
        return storeTheme;
    }

    public void setStoreTheme(String storeTheme) {
        this.storeTheme = storeTheme == null ? null : storeTheme.trim();
    }

    public Integer getStoreCredit() {
        return storeCredit;
    }

    public void setStoreCredit(Integer storeCredit) {
        this.storeCredit = storeCredit;
    }

    public Float getStoreQualityMark() {
        return storeQualityMark;
    }

    public void setStoreQualityMark(Float storeQualityMark) {
        this.storeQualityMark = storeQualityMark;
    }

    public Float getStoreServiceMark() {
        return storeServiceMark;
    }

    public void setStoreServiceMark(Float storeServiceMark) {
        this.storeServiceMark = storeServiceMark;
    }

    public Float getStoreLogisticsMark() {
        return storeLogisticsMark;
    }

    public void setStoreLogisticsMark(Float storeLogisticsMark) {
        this.storeLogisticsMark = storeLogisticsMark;
    }

    public Integer getNewGoodsNumber() {
        return newGoodsNumber;
    }

    public void setNewGoodsNumber(Integer newGoodsNumber) {
        this.newGoodsNumber = newGoodsNumber;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getStoreCollect() {
        return storeCollect;
    }

    public void setStoreCollect(Integer storeCollect) {
        this.storeCollect = storeCollect;
    }

    public String getStoreStamp() {
        return storeStamp;
    }

    public void setStoreStamp(String storeStamp) {
        this.storeStamp = storeStamp == null ? null : storeStamp.trim();
    }

    public String getStorePrintdesc() {
        return storePrintdesc;
    }

    public void setStorePrintdesc(String storePrintdesc) {
        this.storePrintdesc = storePrintdesc == null ? null : storePrintdesc.trim();
    }

    public Integer getStoreSales() {
        return storeSales;
    }

    public void setStoreSales(Integer storeSales) {
        this.storeSales = storeSales;
    }

    public String getStoreWorkingtime() {
        return storeWorkingtime;
    }

    public void setStoreWorkingtime(String storeWorkingtime) {
        this.storeWorkingtime = storeWorkingtime == null ? null : storeWorkingtime.trim();
    }

    public BigDecimal getStoreFreePrice() {
        return storeFreePrice;
    }

    public void setStoreFreePrice(BigDecimal storeFreePrice) {
        this.storeFreePrice = storeFreePrice;
    }

    public Integer getStoreDecorationSwitch() {
        return storeDecorationSwitch;
    }

    public void setStoreDecorationSwitch(Integer storeDecorationSwitch) {
        this.storeDecorationSwitch = storeDecorationSwitch;
    }

    public Integer getStoreDecorationOnly() {
        return storeDecorationOnly;
    }

    public void setStoreDecorationOnly(Integer storeDecorationOnly) {
        this.storeDecorationOnly = storeDecorationOnly;
    }

    public Integer getStoreDecorationImageCount() {
        return storeDecorationImageCount;
    }

    public void setStoreDecorationImageCount(Integer storeDecorationImageCount) {
        this.storeDecorationImageCount = storeDecorationImageCount;
    }

    public String getLiveStoreName() {
        return liveStoreName;
    }

    public void setLiveStoreName(String liveStoreName) {
        this.liveStoreName = liveStoreName == null ? null : liveStoreName.trim();
    }

    public String getLiveStoreAddress() {
        return liveStoreAddress;
    }

    public void setLiveStoreAddress(String liveStoreAddress) {
        this.liveStoreAddress = liveStoreAddress == null ? null : liveStoreAddress.trim();
    }

    public String getLiveStoreTel() {
        return liveStoreTel;
    }

    public void setLiveStoreTel(String liveStoreTel) {
        this.liveStoreTel = liveStoreTel == null ? null : liveStoreTel.trim();
    }

    public String getLiveStoreBus() {
        return liveStoreBus;
    }

    public void setLiveStoreBus(String liveStoreBus) {
        this.liveStoreBus = liveStoreBus == null ? null : liveStoreBus.trim();
    }

    public Integer getIsOwnShop() {
        return isOwnShop;
    }

    public void setIsOwnShop(Integer isOwnShop) {
        this.isOwnShop = isOwnShop;
    }

    public Integer getBindAllGc() {
        return bindAllGc;
    }

    public void setBindAllGc(Integer bindAllGc) {
        this.bindAllGc = bindAllGc;
    }

    public String getStoreVrcodePrefix() {
        return storeVrcodePrefix;
    }

    public void setStoreVrcodePrefix(String storeVrcodePrefix) {
        this.storeVrcodePrefix = storeVrcodePrefix == null ? null : storeVrcodePrefix.trim();
    }
}