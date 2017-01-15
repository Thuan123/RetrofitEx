package com.example.thuan.retrofitex.model.request;

import com.example.thuan.retrofitex.model.response.AromaVideo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by thuan on 1/15/2017.
 */

public class CreateAromaVideo {
    @SerializedName("aroma_video")
    @Expose
    private AromaVideo aromaVideo;

    public CreateAromaVideo(AromaVideo aromaVideo) {
        this.aromaVideo = aromaVideo;
    }

    public AromaVideo getAromaVideo() {
        return aromaVideo;
    }

    public void setAromaVideo(AromaVideo aromaVideo) {
        this.aromaVideo = aromaVideo;
    }

}
