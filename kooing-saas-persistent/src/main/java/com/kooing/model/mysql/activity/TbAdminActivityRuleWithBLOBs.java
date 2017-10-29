package com.kooing.model.mysql.activity;

public class TbAdminActivityRuleWithBLOBs extends TbAdminActivityRule {
    private String ruleDesc;

    private String designDesc;

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc == null ? null : ruleDesc.trim();
    }

    public String getDesignDesc() {
        return designDesc;
    }

    public void setDesignDesc(String designDesc) {
        this.designDesc = designDesc == null ? null : designDesc.trim();
    }
}