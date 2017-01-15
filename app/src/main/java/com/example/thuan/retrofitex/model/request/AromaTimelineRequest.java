package com.example.thuan.retrofitex.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by thuan on 1/15/2017.
 */

public class AromaTimelineRequest {
    @SerializedName("aroma_timeline")
    @Expose
    private AromaTimeline aromaTimeline;

    public AromaTimelineRequest(AromaTimeline aromaTimeline) {
        this.aromaTimeline = aromaTimeline;
    }

    public AromaTimeline getAromaTimeline() {
        return aromaTimeline;
    }

    public void setAromaTimeline(AromaTimeline aromaTimeline) {
        this.aromaTimeline = aromaTimeline;
    }
}
