package com.kooing.model.mysql.order;

import java.math.BigDecimal;
import java.util.Date;

public class TbOdmOrderCommon {
    private Integer id;

    private Integer orderId;

    private String uuid;

    private Integer appId;

    private Integer storeId;

    private Integer supId;

    private Date shippingTime;

    private Date confirmShippingTime;

    private Integer shippingExpressId;

    private Date evaluationTime;

    private Integer evalsellerState;

    private Date evalsellerTime;

    private String orderMessage;

    private Integer orderPointscount;

    private Integer voucherId;

    private BigDecimal voucherPrice;

    private String voucherCode;

    private String deliverExplain;

    private Integer daddressId;

    private String reciverName;

    private String reciverPhone;

    private String reciverInfo;

    private Integer reciverProvinceId;

    private Integer reciverCityId;

    private String invoiceInfo;

    private String promotionInfo;

    private String dlyoPickupCode;

    private Date updateTime;

    private BigDecimal serviceFee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getSupId() {
        return supId;
    }

    public void setSupId(Integer supId) {
        this.supId = supId;
    }

    public Date getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Date shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Date getConfirmShippingTime() {
        return confirmShippingTime;
    }

    public void setConfirmShippingTime(Date confirmShippingTime) {
        this.confirmShippingTime = confirmShippingTime;
    }

    public Integer getShippingExpressId() {
        return shippingExpressId;
    }

    public void setShippingExpressId(Integer shippingExpressId) {
        this.shippingExpressId = shippingExpressId;
    }

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public Integer getEvalsellerState() {
        return evalsellerState;
    }

    public void setEvalsellerState(Integer evalsellerState) {
        this.evalsellerState = evalsellerState;
    }

    public Date getEvalsellerTime() {
        return evalsellerTime;
    }

    public void setEvalsellerTime(Date evalsellerTime) {
        this.evalsellerTime = evalsellerTime;
    }

    public String getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage == null ? null : orderMessage.trim();
    }

    public Integer getOrderPointscount() {
        return orderPointscount;
    }

    public void setOrderPointscount(Integer orderPointscount) {
        this.orderPointscount = orderPointscount;
    }

    public Integer getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Integer voucherId) {
        this.voucherId = voucherId;
    }

    public BigDecimal getVoucherPrice() {
        return voucherPrice;
    }

    public void setVoucherPrice(BigDecimal voucherPrice) {
        this.voucherPrice = voucherPrice;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode == null ? null : voucherCode.trim();
    }

    public String getDeliverExplain() {
        return deliverExplain;
    }

    public void setDeliverExplain(String deliverExplain) {
        this.deliverExplain = deliverExplain == null ? null : deliverExplain.trim();
    }

    public Integer getDaddressId() {
        return daddressId;
    }

    public void setDaddressId(Integer daddressId) {
        this.daddressId = daddressId;
    }

    public String getReciverName() {
        return reciverName;
    }

    public void setReciverName(String reciverName) {
        this.reciverName = reciverName == null ? null : reciverName.trim();
    }

    public String getReciverPhone() {
        return reciverPhone;
    }

    public void setReciverPhone(String reciverPhone) {
        this.reciverPhone = reciverPhone == null ? null : reciverPhone.trim();
    }

    public String getReciverInfo() {
        return reciverInfo;
    }

    public void setReciverInfo(String reciverInfo) {
        this.reciverInfo = reciverInfo == null ? null : reciverInfo.trim();
    }

    public Integer getReciverProvinceId() {
        return reciverProvinceId;
    }

    public void setReciverProvinceId(Integer reciverProvinceId) {
        this.reciverProvinceId = reciverProvinceId;
    }

    public Integer getReciverCityId() {
        return reciverCityId;
    }

    public void setReciverCityId(Integer reciverCityId) {
        this.reciverCityId = reciverCityId;
    }

    public String getInvoiceInfo() {
        return invoiceInfo;
    }

    public void setInvoiceInfo(String invoiceInfo) {
        this.invoiceInfo = invoiceInfo == null ? null : invoiceInfo.trim();
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo == null ? null : promotionInfo.trim();
    }

    public String getDlyoPickupCode() {
        return dlyoPickupCode;
    }

    public void setDlyoPickupCode(String dlyoPickupCode) {
        this.dlyoPickupCode = dlyoPickupCode == null ? null : dlyoPickupCode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }
}