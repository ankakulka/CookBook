package com.annakulczycka.cookbook;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    Button clk;
    VideoView videov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        clk = (Button) findViewById(R.id.startButton);
        videov = (VideoView) findViewById(R.id.videoView);





    }


    public void videoplay(View v) {

        String videopath = "android.resourse://com.annakulczycka.cookbook"+ R.raw.huis;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.start();

    }



}
