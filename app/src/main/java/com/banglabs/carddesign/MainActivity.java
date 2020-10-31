package com.banglabs.carddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button create, readymade, saved, edited;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        // find button

        create = findViewById(R.id.create_card_btn_id);
        readymade = findViewById(R.id.ready_made_btn_id);
        saved = findViewById(R.id.saved_card_btn_id);
        edited = findViewById(R.id.edited_card_btn_id);

        //listener added
        create.setOnClickListener(this);
        readymade.setOnClickListener(this);
        saved.setOnClickListener(this);
        edited.setOnClickListener(this);


    }

    //button click
    @Override
    public void onClick(View view) {







    }
}
