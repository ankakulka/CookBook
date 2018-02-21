package com.annakulczycka.cookbook;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    Button clk;
    VideoView videov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String fileName = "huis";
        String filePlace = "android.resource://" + getPackageName()+ "/raw/" + fileName;


        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse(filePlace));
        videoView.start();

    }
}
