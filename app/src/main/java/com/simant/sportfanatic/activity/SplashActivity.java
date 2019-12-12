package com.simant.sportfanatic.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;

import com.simant.sportfanatic.R;

public class SplashActivity extends AppCompatActivity {

    // splash screen time out
    private static int SPLASH_SCREEN_TIMEOUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // status bar color
        getWindow().setStatusBarColor(Color.parseColor("#2E8B57"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(splashIntent);
                finish();
            }
        }, SPLASH_SCREEN_TIMEOUT);
    }
}