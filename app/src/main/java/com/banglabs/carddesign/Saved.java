package com.banglabs.carddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Saved extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Saved");
        setContentView(R.layout.activity_saved);
    }
}
