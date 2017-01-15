package com.example.thuan.retrofitex.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by thuan on 1/15/2017.
 */

public class AromaVideo {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("duration")
    @Expose
    private Double duration;
    @SerializedName("android_local_url")
    @Expose
    private String androidLocalUrl;
    @SerializedName("ios_local_url")
    @Expose
    private String iosLocalUrl;
    @SerializedName("windows_local_url")
    @Expose
    private String windowsLocalUrl;
    @SerializedName("online_url")
    @Expose
    private String onlineUrl;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("aroma_timelines")
    @Expose
    private List<AromaTimelineData> aromaTimelines = null;
    @SerializedName("users")
    @Expose
    private List<User> users = null;

    public AromaVideo(String abcd, String o, String s, String o1, double v, String o2) {
        this.title = abcd;
        this.androidLocalUrl  = o;
        this.iosLocalUrl = s;
        this.onlineUrl = o1;
        this.duration = v;
        this.thumbnail = o2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getAndroidLocalUrl() {
        return androidLocalUrl;
    }

    public void setAndroidLocalUrl(String androidLocalUrl) {
        this.androidLocalUrl = androidLocalUrl;
    }

    public String getIosLocalUrl() {
        return iosLocalUrl;
    }

    public void setIosLocalUrl(String iosLocalUrl) {
        this.iosLocalUrl = iosLocalUrl;
    }

    public String getWindowsLocalUrl() {
        return windowsLocalUrl;
    }

    public void setWindowsLocalUrl(String windowsLocalUrl) {
        this.windowsLocalUrl = windowsLocalUrl;
    }

    public String getOnlineUrl() {
        return onlineUrl;
    }

    public void setOnlineUrl(String onlineUrl) {
        this.onlineUrl = onlineUrl;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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

    public List<AromaTimelineData> getAromaTimelines() {
        return aromaTimelines;
    }

    public void setAromaTimelines(List<AromaTimelineData> aromaTimelines) {
        this.aromaTimelines = aromaTimelines;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
