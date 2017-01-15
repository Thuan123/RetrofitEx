package com.example.thuan.retrofitex.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by thuan on 1/15/2017.
 */

public class User {
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
}
