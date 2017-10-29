package com.kooing.model.mysql.foods;

import java.util.Date;

public class TbUrsFoodsReply {
    private Long replyId;

    private Long frId;

    private Long replyUpId;

    private Integer customerId;

    private String sendContent;

    private Date sendTime;

    private Integer type;

    private Integer appId;

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Long getFrId() {
        return frId;
    }

    public void setFrId(Long frId) {
        this.frId = frId;
    }

    public Long getReplyUpId() {
        return replyUpId;
    }

    public void setReplyUpId(Long replyUpId) {
        this.replyUpId = replyUpId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getSendContent() {
        return sendContent;
    }

    public void setSendContent(String sendContent) {
        this.sendContent = sendContent == null ? null : sendContent.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}