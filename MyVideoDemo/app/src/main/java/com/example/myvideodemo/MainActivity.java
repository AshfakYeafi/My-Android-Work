package com.example.myvideodemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    AlertDialog.Builder alerBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView=(VideoView) findViewById(R.id.video_view);
        Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video_3);
        videoView.setVideoURI(uri);
        MediaController mediaController=new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();

    }

    @Override
    public void onBackPressed() {
        alerBuilder=new AlertDialog.Builder(MainActivity.this);
        alerBuilder.setTitle("Alert");
        alerBuilder.setMessage("Do you want to exit?");
        alerBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alerBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alerBuilder.show();
    }
}