package com.banglabs.carddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Edited extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Edited");
        setContentView(R.layout.activity_edited);
    }
}
