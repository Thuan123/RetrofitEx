package com.example.thuan.retrofitex.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by thuan on 1/9/2017.
 */

public class LoginResponse {
    @SerializedName("data")
    @Expose
    private LoginRes data;

    public LoginRes getData() {
        return data;
    }

    public void setData(LoginRes data) {
        this.data = data;
    }
}
