package com.kooing.saas.persistent.model.comment;

public class TbShopsComment {
    private Long goodsCommentId;

    private String uuid;

    private Integer storeId;

    private Integer goodsId;

    private Integer commentVirtual;

    private Integer memberId;

    private String memberAvatar;

    private String commentPhoto;

    private String commentContent;

    public Long getGoodsCommentId() {
        return goodsCommentId;
    }

    public void setGoodsCommentId(Long goodsCommentId) {
        this.goodsCommentId = goodsCommentId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCommentVirtual() {
        return commentVirtual;
    }

    public void setCommentVirtual(Integer commentVirtual) {
        this.commentVirtual = commentVirtual;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberAvatar() {
        return memberAvatar;
    }

    public void setMemberAvatar(String memberAvatar) {
        this.memberAvatar = memberAvatar == null ? null : memberAvatar.trim();
    }

    public String getCommentPhoto() {
        return commentPhoto;
    }

    public void setCommentPhoto(String commentPhoto) {
        this.commentPhoto = commentPhoto == null ? null : commentPhoto.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}