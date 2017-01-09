package com.example.thuan.retrofitex.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by thuan on 1/9/2017.
 */

public class SignUpRequest {
    @SerializedName("password")
    private String password;

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("last_sign_in_at")
    @Expose
    private String lastSignInAt;
    @SerializedName("last_sign_in_ip")
    @Expose
    private String lastSignInIp;
    @SerializedName("profile")
    @Expose
    private Object profile;
    @SerializedName("aroma_shooters")
    @Expose
    private List<Object> aromaShooters = null;
    @SerializedName("aroma_videos")
    @Expose
    private List<Object> aromaVideos = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastSignInAt() {
        return lastSignInAt;
    }

    public void setLastSignInAt(String lastSignInAt) {
        this.lastSignInAt = lastSignInAt;
    }

    public String getLastSignInIp() {
        return lastSignInIp;
    }

    public void setLastSignInIp(String lastSignInIp) {
        this.lastSignInIp = lastSignInIp;
    }

    public Object getProfile() {
        return profile;
    }

    public void setProfile(Object profile) {
        this.profile = profile;
    }

    public List<Object> getAromaShooters() {
        return aromaShooters;
    }

    public void setAromaShooters(List<Object> aromaShooters) {
        this.aromaShooters = aromaShooters;
    }

    public List<Object> getAromaVideos() {
        return aromaVideos;
    }

    public void setAromaVideos(List<Object> aromaVideos) {
        this.aromaVideos = aromaVideos;
    }

    public SignUpRequest(String s, String s1) {
        this.email = s;
        this.password = s1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
