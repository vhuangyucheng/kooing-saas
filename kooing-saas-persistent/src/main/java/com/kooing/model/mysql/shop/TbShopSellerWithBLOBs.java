package com.kooing.model.mysql.shop;

public class TbShopSellerWithBLOBs extends TbShopSeller {
    private String passwordQuestion;

    private String passwordAnswers;

    public String getPasswordQuestion() {
        return passwordQuestion;
    }

    public void setPasswordQuestion(String passwordQuestion) {
        this.passwordQuestion = passwordQuestion == null ? null : passwordQuestion.trim();
    }

    public String getPasswordAnswers() {
        return passwordAnswers;
    }

    public void setPasswordAnswers(String passwordAnswers) {
        this.passwordAnswers = passwordAnswers == null ? null : passwordAnswers.trim();
    }
}