package com.kooing.saas.persistent.model.login;

import lombok.ToString;

@ToString
public class TbRoleMember {
    private Long recId;

    private Integer memberId;

    private Integer roleId;

    public Long getRecId() {
        return recId;
    }

    public void setRecId(Long recId) {
        this.recId = recId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}