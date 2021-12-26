package com.example.sasarefurbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Remove actionBar menu
        Objects.requireNonNull(getSupportActionBar()).hide();

        //Create intent for the splashScreen and the next Activity
        Handler handler = new Handler();
        handler.postDelayed(() -> {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
        }, 10000);
    }
}