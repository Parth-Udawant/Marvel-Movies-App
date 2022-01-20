package com.tic.marvelreelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ScrollView nowPlaying;
    CardView profileView;
    HorizontalScrollView moviesScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nowPlaying = findViewById(R.id.scrollview);
        nowPlaying.setVerticalScrollBarEnabled(false);
        nowPlaying.setHorizontalScrollBarEnabled(false);
        moviesScroll = findViewById(R.id.MoviesScroll);

        profileView = findViewById(R.id.profileCard);

        profileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });

        moviesScroll.setVerticalScrollBarEnabled(false);
        moviesScroll.setHorizontalScrollBarEnabled(false);
    }
}