package com.example.thuan.retrofitex.api;

import com.example.thuan.retrofitex.model.request.AromaTimelineRequest;
import com.example.thuan.retrofitex.model.request.CreateAromaVideo;
import com.example.thuan.retrofitex.model.request.SessionRequest;
import com.example.thuan.retrofitex.model.request.SignUpRequest;
import com.example.thuan.retrofitex.model.response.AromaTimelineResponse;
import com.example.thuan.retrofitex.model.response.AromaVideo;
import com.example.thuan.retrofitex.model.response.CreateAromaVideoResponse;
import com.example.thuan.retrofitex.model.response.DestroyAromaTimeline;
import com.example.thuan.retrofitex.model.response.LoginResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

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

    @Headers({
            "Accept: application/json",
            "Content-type: application/json"
    })
    @POST("/api/users/{user_id}/aroma_videos/{aroma_video_id}/aroma_timelines.json")
    Call<AromaTimelineResponse> createAromaTimeline(@Header("Authorization") String authorization, @Path("user_id") int userId, @Path("aroma_video_id") int videoId, @Body AromaTimelineRequest aromaTimelineRequest);
    @Headers({
            "Accept: application/json",
            "Content-type: application/json"
    })
    @DELETE("/api/users/{user_id}/aroma_videos/{aroma_video_id}/aroma_timelines/{id}")
    Call<DestroyAromaTimeline> destroyAromaTimle(@Header("Authorization") String authorization, @Path("user_id") int userId, @Path("aroma_video_id") int videoId, @Path("id") int id);
    @Headers({
            "Accept: application/json",
            "Content-type: application/json"
    })
    @GET("/api/users/{user_id}/aroma_videos.json")
    Call<List<AromaVideo>> getAllAromaVideo(@Header("Authorization") String authorization, @Path("user_id") int userId, @Query("sort") boolean sort, @Query("sortby") String sortBy);

    @Headers({
            "Accept: application/json",
            "Content-type: application/json"
    })
    @POST("/api/users/{user_id}/aroma_videos.json")
    Call<CreateAromaVideoResponse> createAromaVideo(@Header("Authorization") String authorization, @Path("user_id") int userId, @Body CreateAromaVideo createAromaVideo);
}
