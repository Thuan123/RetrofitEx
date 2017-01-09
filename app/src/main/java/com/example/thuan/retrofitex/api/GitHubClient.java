package com.example.thuan.retrofitex.api;

import com.example.thuan.retrofitex.model.GitHubUser;
import com.example.thuan.retrofitex.model.GithubRepos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by thuan on 1/9/2017.
 */

public interface GitHubClient {
    @GET("users/{user}")
        //The second part of the URL
    Call<GitHubUser> getFeed(@Path("user") String user);
    //String user is for passing values from the EditText e.g. user="danbuckland", "google"
    //Response is the response from the server which is now in the POJO

    @GET("users/{user}/repos")
    Call<List<GithubRepos>> getRepos(@Path("user") String user);

}
