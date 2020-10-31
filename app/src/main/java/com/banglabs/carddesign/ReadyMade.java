package com.banglabs.carddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ReadyMade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Ready Made");
        setContentView(R.layout.activity_ready_made);
    }
}
