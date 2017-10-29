package com.kooing.model.mysql.comment;

import java.math.BigDecimal;
import java.util.Date;

public class TbShopEvaluateGoods {
    private Integer gevalId;

    private String uuid;

    private Integer appId;

    private Integer gevalOrderid;

    private String gevalOrderno;

    private Integer gevalOrdergoodsid;

    private Integer gevalGoodsid;

    private String gevalGoodsname;

    private BigDecimal gevalGoodsprice;

    private String gevalGoodsimage;

    private Boolean gevalScores;

    private String gevalContent;

    private Boolean gevalIsanonymous;

    private Date gevalAddtime;

    private Integer gevalStoreid;

    private String gevalStorename;

    private Integer gevalFrommemberid;

    private String gevalFrommembername;

    private Boolean gevalState;

    private String gevalRemark;

    private String gevalExplain;

    private String gevalImage;

    private Date updateTime;

    public Integer getGevalId() {
        return gevalId;
    }

    public void setGevalId(Integer gevalId) {
        this.gevalId = gevalId;
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

    public Integer getGevalOrderid() {
        return gevalOrderid;
    }

    public void setGevalOrderid(Integer gevalOrderid) {
        this.gevalOrderid = gevalOrderid;
    }

    public String getGevalOrderno() {
        return gevalOrderno;
    }

    public void setGevalOrderno(String gevalOrderno) {
        this.gevalOrderno = gevalOrderno == null ? null : gevalOrderno.trim();
    }

    public Integer getGevalOrdergoodsid() {
        return gevalOrdergoodsid;
    }

    public void setGevalOrdergoodsid(Integer gevalOrdergoodsid) {
        this.gevalOrdergoodsid = gevalOrdergoodsid;
    }

    public Integer getGevalGoodsid() {
        return gevalGoodsid;
    }

    public void setGevalGoodsid(Integer gevalGoodsid) {
        this.gevalGoodsid = gevalGoodsid;
    }

    public String getGevalGoodsname() {
        return gevalGoodsname;
    }

    public void setGevalGoodsname(String gevalGoodsname) {
        this.gevalGoodsname = gevalGoodsname == null ? null : gevalGoodsname.trim();
    }

    public BigDecimal getGevalGoodsprice() {
        return gevalGoodsprice;
    }

    public void setGevalGoodsprice(BigDecimal gevalGoodsprice) {
        this.gevalGoodsprice = gevalGoodsprice;
    }

    public String getGevalGoodsimage() {
        return gevalGoodsimage;
    }

    public void setGevalGoodsimage(String gevalGoodsimage) {
        this.gevalGoodsimage = gevalGoodsimage == null ? null : gevalGoodsimage.trim();
    }

    public Boolean getGevalScores() {
        return gevalScores;
    }

    public void setGevalScores(Boolean gevalScores) {
        this.gevalScores = gevalScores;
    }

    public String getGevalContent() {
        return gevalContent;
    }

    public void setGevalContent(String gevalContent) {
        this.gevalContent = gevalContent == null ? null : gevalContent.trim();
    }

    public Boolean getGevalIsanonymous() {
        return gevalIsanonymous;
    }

    public void setGevalIsanonymous(Boolean gevalIsanonymous) {
        this.gevalIsanonymous = gevalIsanonymous;
    }

    public Date getGevalAddtime() {
        return gevalAddtime;
    }

    public void setGevalAddtime(Date gevalAddtime) {
        this.gevalAddtime = gevalAddtime;
    }

    public Integer getGevalStoreid() {
        return gevalStoreid;
    }

    public void setGevalStoreid(Integer gevalStoreid) {
        this.gevalStoreid = gevalStoreid;
    }

    public String getGevalStorename() {
        return gevalStorename;
    }

    public void setGevalStorename(String gevalStorename) {
        this.gevalStorename = gevalStorename == null ? null : gevalStorename.trim();
    }

    public Integer getGevalFrommemberid() {
        return gevalFrommemberid;
    }

    public void setGevalFrommemberid(Integer gevalFrommemberid) {
        this.gevalFrommemberid = gevalFrommemberid;
    }

    public String getGevalFrommembername() {
        return gevalFrommembername;
    }

    public void setGevalFrommembername(String gevalFrommembername) {
        this.gevalFrommembername = gevalFrommembername == null ? null : gevalFrommembername.trim();
    }

    public Boolean getGevalState() {
        return gevalState;
    }

    public void setGevalState(Boolean gevalState) {
        this.gevalState = gevalState;
    }

    public String getGevalRemark() {
        return gevalRemark;
    }

    public void setGevalRemark(String gevalRemark) {
        this.gevalRemark = gevalRemark == null ? null : gevalRemark.trim();
    }

    public String getGevalExplain() {
        return gevalExplain;
    }

    public void setGevalExplain(String gevalExplain) {
        this.gevalExplain = gevalExplain == null ? null : gevalExplain.trim();
    }

    public String getGevalImage() {
        return gevalImage;
    }

    public void setGevalImage(String gevalImage) {
        this.gevalImage = gevalImage == null ? null : gevalImage.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}