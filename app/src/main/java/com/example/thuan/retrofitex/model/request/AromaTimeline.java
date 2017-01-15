package com.example.thuan.retrofitex.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by thuan on 1/15/2017.
 */

public class AromaTimeline {
    @SerializedName("timeline_version")
    @Expose
    private double version;
    @SerializedName("title")
    @Expose
    private String title;

    public AromaTimeline(double v, String title) {
        this.version = v;
        this.title = title;
    }

    public double getTimelineVersion() {
        return version;
    }

    public void setTimelineVersion(double timelineVersion) {
        this.version = timelineVersion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
