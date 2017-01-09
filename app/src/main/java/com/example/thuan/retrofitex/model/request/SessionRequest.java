package com.example.thuan.retrofitex.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by thuan on 1/9/2017.
 */

public class SessionRequest {
    @SerializedName("session")
    @Expose
    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

}
