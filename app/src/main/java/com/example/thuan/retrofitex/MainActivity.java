package com.example.thuan.retrofitex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.thuan.retrofitex.api.AromaShooter;
import com.example.thuan.retrofitex.api.ServiceGenerator;
import com.example.thuan.retrofitex.model.request.AromaTimeline;
import com.example.thuan.retrofitex.model.request.AromaTimelineRequest;
import com.example.thuan.retrofitex.model.request.Session;
import com.example.thuan.retrofitex.model.request.SessionRequest;
import com.example.thuan.retrofitex.model.response.AromaTimelineResponse;
import com.example.thuan.retrofitex.model.response.AromaVideo;
import com.example.thuan.retrofitex.model.response.LoginResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button searchBtn;
    TextView responseText;
    EditText editText;
    ProgressBar progressBar;
    //GitHubClient gitHubClient;

    AromaShooter shooter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a very simple REST adapter which points the GitHub API endpoint.
        //gitHubClient = ServiceGenerator.createService(GitHubClient.class);

        shooter = ServiceGenerator.createService(AromaShooter.class);
        searchBtn = (Button) findViewById(R.id.main_btn_lookup);
        responseText = (TextView) findViewById(R.id.main_text_response);
        editText = (EditText) findViewById(R.id.main_edit_username);
        progressBar = (ProgressBar) findViewById(R.id.main_progress);
        progressBar.setVisibility(View.INVISIBLE);


        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchForUser();
            }
        });

        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    searchForUser();
                }
                return handled;
            }
        });
    }

    public void searchForUser() {
        String user = editText.getText().toString();
        progressBar.setVisibility(View.VISIBLE);

        Session session = new Session("quangnguyen@aromajoin.com", "12345678");
        SessionRequest sessionRequest = new SessionRequest();
        sessionRequest.setSession(session);
        Call<LoginResponse> call = shooter.login(sessionRequest);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Response<LoginResponse> response) {
                Log.e("res", response.toString());

                String authen = response.body().getData().getAuthenticationToken();
                int userId = response.body().getData().getId();

                Log.e("authen", authen);
                Log.e("userId", String.valueOf(userId));

                /*AromaVideo aromaVideo = new AromaVideo("ABCD", null, "assets-library://asset/asset.mp4?id=77FE7443-9DD1-4FF0-AC06-049D0F3E5447&ext=mp4", null, 21.4785, null);
                CreateAromaVideo createAromaVideo = new CreateAromaVideo(aromaVideo);
                Call<CreateAromaVideoResponse> createAromaVideoResponseCall = shooter.createAromaVideo(authen, userId, createAromaVideo);
                createAromaVideoResponseCall.enqueue(new Callback<CreateAromaVideoResponse>() {
                    @Override
                    public void onResponse(Response<CreateAromaVideoResponse> response) {
                        Log.e("code", String.valueOf(response.code()));
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });*/

                Call<List<AromaVideo>> resCall = shooter.getAllAromaVideo(authen, userId, true, "title");
                resCall.enqueue(new Callback<List<AromaVideo>>() {
                    @Override
                    public void onResponse(Response<List<AromaVideo>> response) {
                        Log.e("code", String.valueOf(response.code()));
                        Log.e("size", String.valueOf(response.body().size()));
                        Log.e("id", String.valueOf(response.body().get(0).getId()));
                        Log.e("title", response.body().get(0).getTitle());
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
                AromaTimeline aromaTimeline = new AromaTimeline(1.0, null);
                AromaTimelineRequest aromaTimelineRequest = new AromaTimelineRequest(aromaTimeline);
                Call<AromaTimelineResponse> aromaTimelineResponseCall = shooter.createAromaTimeline(authen, userId, 1, aromaTimelineRequest);
                aromaTimelineResponseCall.enqueue(new Callback<AromaTimelineResponse>() {
                    @Override
                    public void onResponse(Response<AromaTimelineResponse> response) {
                        Log.e("code", String.valueOf(response.code()));
                    }

                    @Override
                    public void onFailure(Throwable t) {
                        Log.e("error", t.getMessage());
                    }
                });
                progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("error", "thuan");
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
        /*Call<DestroyAromaTimeline> destroyAromaTimelineCall = shooter.destroyAromaTimle(authen, userId, 56, 147);
                destroyAromaTimelineCall.enqueue(new Callback<DestroyAromaTimeline>() {
                    @Override
                    public void onResponse(Response<DestroyAromaTimeline> response) {
                        Log.e("code", String.valueOf(response.code()));
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });*/
        /*Call<SignUpRequest> call = shooter.createUser("testaccount@gmail.com", "123456789");

        call.enqueue(new Callback<SignUpRequest>() {
            @Override
            public void onResponse(Response<SignUpRequest> response) {
                Log.e("res", response.headers().toString());
                progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("t", t.getMessage());
                progressBar.setVisibility(View.INVISIBLE);
            }
        });*/
        /*Call<GitHubUser> call = gitHubClient.getFeed(user);
        call.enqueue(new Callback<GitHubUser>() {
            @Override
            public void onResponse(Response<GitHubUser> response) {
                //Display successful response results
                GitHubUser gitModel = response.body();
                if (gitModel != null) {
                    responseText.setText(getString(R.string.main_response_text,
                            gitModel.getName(),
                            gitModel.getBlog(),
                            gitModel.getAvatarUrl()));
                } else {
                    responseText.setText("");
                    Toast.makeText(getApplicationContext(),
                            getString(R.string.main_error_text),
                            Toast.LENGTH_SHORT).show();

                }
                //Hide progressbar when done
                progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onFailure(Throwable t) {
                // Display error message if the request fails
                responseText.setText(""); //Error needs to be handled properly
                //Hide progressbar when done
                progressBar.setVisibility(View.INVISIBLE);
            }
        });

        Call<List<GithubRepos>> call1 = gitHubClient.getRepos(user);
        call1.enqueue(new Callback<List<GithubRepos>>() {
            @Override
            public void onResponse(Response<List<GithubRepos>> response) {
                Log.e("test", response.body().toString());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("error", t.getMessage());
            }
        });*/
    }
}
