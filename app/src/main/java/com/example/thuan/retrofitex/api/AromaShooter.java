package com.example.thuan.retrofitex.api;

import com.example.thuan.retrofitex.model.request.SessionRequest;
import com.example.thuan.retrofitex.model.request.SignUpRequest;
import com.example.thuan.retrofitex.model.response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by thuan on 1/9/2017.
 */

public interface AromaShooter {
    @Headers({
            "Accept: application/json",
            "Content-type: application/json"
    })
    @FormUrlEncoded
    @POST("api/users.json")
    Call<SignUpRequest> createUser(@Field("email") String email, @Field("email") String password);

    @Headers({
            "Accept: application/json",
            "Content-type: application/json"
    })
    @POST("api/sessions.json")
    Call<LoginResponse> login(@Body SessionRequest sessionRequest);
}
