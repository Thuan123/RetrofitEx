package com.example.thuan.retrofitex.model;

/**
 * Created by thuan on 1/9/2017.
 */

public class GithubRepos {
    String name;
    String url;

    @Override
    public String toString() {
        return(name + " " +  url);
    }
}
