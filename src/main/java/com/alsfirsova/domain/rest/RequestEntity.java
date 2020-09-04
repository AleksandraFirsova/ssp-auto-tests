package com.alsfirsova.domain.rest;

import com.google.gson.Gson;

public class RequestEntity {
    private String username;
    private String password;
    private String captchaResponse;
    private Roles type;
    private boolean isChina;
    private String fingerprint;

    private static transient Gson gson = new Gson();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaptchaResponse() {
        return captchaResponse;
    }

    public void setCaptchaResponse(String captchaResponse) {
        this.captchaResponse = captchaResponse;
    }

    public Roles getType() {
        return type;
    }

    public void setType(Roles type) {
        this.type = type;
    }

    public boolean getIsChina() {
        return isChina;
    }

    public void setIsChina(boolean isChina) {
        this.isChina = isChina;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String toJson() {
        return gson.toJson(this);
    }

    public static RequestEntity fromJson(String json) {
        return gson.fromJson(json, RequestEntity.class);
    }
}


