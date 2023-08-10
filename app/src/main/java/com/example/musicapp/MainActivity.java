package com.example.musicapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
     Button play, pause;
     MediaPlayer mediaPlayer;
     boolean isPlaying = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.button3);
        pause = findViewById(R.id.button4);


        mediaPlayer = MediaPlayer.create(this, R.raw.safari_song);


        play.setOnClickListener(v -> {
            if(!isPlaying){
                mediaPlayer.start();
                isPlaying = true;

            }
        });
        pause.setOnClickListener(v -> {
            if(!isPlaying){
                mediaPlayer.stop();
                isPlaying = false;
                //Toast.makeText(MainActivity.this, "Successfully Login", Toast.LENGTH_SHORT).show();
            }
        });

    }
}