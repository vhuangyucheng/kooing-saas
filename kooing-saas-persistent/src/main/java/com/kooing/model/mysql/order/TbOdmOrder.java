package com.kooing.model.mysql.order;

import java.math.BigDecimal;
import java.util.Date;

public class TbOdmOrder {
    private Integer orderId;

    private String uuid;

    private Integer appId;

    private String orderSn;

    private String paySn;

    private Integer storeId;

    private String julunDoorshopName;

    private Integer julunDoorshopId;

    private String julunDoorshopLogo;

    private Date julunInstallDatetime;

    private String julunCarNum;

    private String julunCarType;

    private String storeName;

    private String storeLogo;

    private Integer supId;

    private String supName;

    private Integer buyerId;

    private String buyerName;

    private String buyerEmail;

    private Date addTime;

    private String paymentCode;

    private Date paymentTime;

    private Date finnshedTime;

    private BigDecimal goodsAmount;

    private BigDecimal salesAmt;

    private BigDecimal salesAmount;

    private BigDecimal orderAmount;

    private BigDecimal rcbAmount;

    private BigDecimal pdAmount;

    private BigDecimal shippingFee;

    private Integer evaluationState;

    private Integer orderState;

    private Integer refundState;

    private Integer lockState;

    private Integer deleteState;

    private BigDecimal refundAmount;

    private Date delayTime;

    private Integer orderFrom;

    private Integer relationId;

    private String shippingCode;

    private Date updateTime;

    private Integer isFreeSend;

    private Integer allowShipment;

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

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getPaySn() {
        return paySn;
    }

    public void setPaySn(String paySn) {
        this.paySn = paySn == null ? null : paySn.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getJulunDoorshopName() {
        return julunDoorshopName;
    }

    public void setJulunDoorshopName(String julunDoorshopName) {
        this.julunDoorshopName = julunDoorshopName == null ? null : julunDoorshopName.trim();
    }

    public Integer getJulunDoorshopId() {
        return julunDoorshopId;
    }

    public void setJulunDoorshopId(Integer julunDoorshopId) {
        this.julunDoorshopId = julunDoorshopId;
    }

    public String getJulunDoorshopLogo() {
        return julunDoorshopLogo;
    }

    public void setJulunDoorshopLogo(String julunDoorshopLogo) {
        this.julunDoorshopLogo = julunDoorshopLogo == null ? null : julunDoorshopLogo.trim();
    }

    public Date getJulunInstallDatetime() {
        return julunInstallDatetime;
    }

    public void setJulunInstallDatetime(Date julunInstallDatetime) {
        this.julunInstallDatetime = julunInstallDatetime;
    }

    public String getJulunCarNum() {
        return julunCarNum;
    }

    public void setJulunCarNum(String julunCarNum) {
        this.julunCarNum = julunCarNum == null ? null : julunCarNum.trim();
    }

    public String getJulunCarType() {
        return julunCarType;
    }

    public void setJulunCarType(String julunCarType) {
        this.julunCarType = julunCarType == null ? null : julunCarType.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreLogo() {
        return storeLogo;
    }

    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo == null ? null : storeLogo.trim();
    }

    public Integer getSupId() {
        return supId;
    }

    public void setSupId(Integer supId) {
        this.supId = supId;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail == null ? null : buyerEmail.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode == null ? null : paymentCode.trim();
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getFinnshedTime() {
        return finnshedTime;
    }

    public void setFinnshedTime(Date finnshedTime) {
        this.finnshedTime = finnshedTime;
    }

    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public BigDecimal getSalesAmt() {
        return salesAmt;
    }

    public void setSalesAmt(BigDecimal salesAmt) {
        this.salesAmt = salesAmt;
    }

    public BigDecimal getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(BigDecimal salesAmount) {
        this.salesAmount = salesAmount;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getRcbAmount() {
        return rcbAmount;
    }

    public void setRcbAmount(BigDecimal rcbAmount) {
        this.rcbAmount = rcbAmount;
    }

    public BigDecimal getPdAmount() {
        return pdAmount;
    }

    public void setPdAmount(BigDecimal pdAmount) {
        this.pdAmount = pdAmount;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public Integer getEvaluationState() {
        return evaluationState;
    }

    public void setEvaluationState(Integer evaluationState) {
        this.evaluationState = evaluationState;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getRefundState() {
        return refundState;
    }

    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }

    public Integer getLockState() {
        return lockState;
    }

    public void setLockState(Integer lockState) {
        this.lockState = lockState;
    }

    public Integer getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(Integer deleteState) {
        this.deleteState = deleteState;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Date getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Date delayTime) {
        this.delayTime = delayTime;
    }

    public Integer getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(Integer orderFrom) {
        this.orderFrom = orderFrom;
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsFreeSend() {
        return isFreeSend;
    }

    public void setIsFreeSend(Integer isFreeSend) {
        this.isFreeSend = isFreeSend;
    }

    public Integer getAllowShipment() {
        return allowShipment;
    }

    public void setAllowShipment(Integer allowShipment) {
        this.allowShipment = allowShipment;
    }
}