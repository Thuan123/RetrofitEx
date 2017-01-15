package com.example.thuan.retrofitex.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by thuan on 1/15/2017.
 */

public class CreateAromaVideoResponse {

    @SerializedName("data")
    @Expose
    private AromaVideo data;

    public AromaVideo getData() {
        return data;
    }

    public void setData(AromaVideo data) {
        this.data = data;
    }
}
