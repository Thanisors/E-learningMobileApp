package com.nutticha.e_learningmobileapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class OnlineClass extends AppCompatActivity {
    private YouTubePlayerView videoOnlineView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onlineclass);
        videoOnlineView = findViewById(R.id.videoCustomListView);
        getLifecycle().addObserver(videoOnlineView);

        videoOnlineView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "P1LFl5CYulc";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
    }
}