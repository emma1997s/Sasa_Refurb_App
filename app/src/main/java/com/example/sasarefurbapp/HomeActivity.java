package com.example.sasarefurbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Remove the App ActionBar
        Objects.requireNonNull(getSupportActionBar()).hide();

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent4 = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(intent4);
    }
}