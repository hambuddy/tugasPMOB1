package com.example.tugasloginregister;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void clickGetStarted(View view) {
        Intent i = new Intent(Welcome.this, WelcomeBack.class);
        startActivity(i);
    }
}