package com.example.thuan.retrofitex.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by thuan on 1/9/2017.
 */

public class LoginRes {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("provider")
    @Expose
    private Object provider;
    @SerializedName("uid")
    @Expose
    private Object uid;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("facebook_token")
    @Expose
    private Object facebookToken;
    @SerializedName("authentication_token")
    @Expose
    private String authenticationToken;
    @SerializedName("token_expiry")
    @Expose
    private String tokenExpiry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getProvider() {
        return provider;
    }

    public void setProvider(Object provider) {
        this.provider = provider;
    }

    public Object getUid() {
        return uid;
    }

    public void setUid(Object uid) {
        this.uid = uid;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Object getFacebookToken() {
        return facebookToken;
    }

    public void setFacebookToken(Object facebookToken) {
        this.facebookToken = facebookToken;
    }

    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    public String getTokenExpiry() {
        return tokenExpiry;
    }

    public void setTokenExpiry(String tokenExpiry) {
        this.tokenExpiry = tokenExpiry;
    }
}
