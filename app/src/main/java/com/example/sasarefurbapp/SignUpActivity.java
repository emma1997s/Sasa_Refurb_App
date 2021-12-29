package com.example.sasarefurbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Removes the ActionBar
        Objects.requireNonNull(getSupportActionBar()).hide();

        Button butt = findViewById(R.id.button_login);
        butt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Set the loginActivity
        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}