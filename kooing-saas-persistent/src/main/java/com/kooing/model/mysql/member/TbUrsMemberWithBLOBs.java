package com.kooing.model.mysql.member;

public class TbUrsMemberWithBLOBs extends TbUrsMember {
    private String memberWxinfo;

    private String memberQqinfo;

    private String memberSinainfo;

    private String memberPrivacy;

    public String getMemberWxinfo() {
        return memberWxinfo;
    }

    public void setMemberWxinfo(String memberWxinfo) {
        this.memberWxinfo = memberWxinfo == null ? null : memberWxinfo.trim();
    }

    public String getMemberQqinfo() {
        return memberQqinfo;
    }

    public void setMemberQqinfo(String memberQqinfo) {
        this.memberQqinfo = memberQqinfo == null ? null : memberQqinfo.trim();
    }

    public String getMemberSinainfo() {
        return memberSinainfo;
    }

    public void setMemberSinainfo(String memberSinainfo) {
        this.memberSinainfo = memberSinainfo == null ? null : memberSinainfo.trim();
    }

    public String getMemberPrivacy() {
        return memberPrivacy;
    }

    public void setMemberPrivacy(String memberPrivacy) {
        this.memberPrivacy = memberPrivacy == null ? null : memberPrivacy.trim();
    }
}