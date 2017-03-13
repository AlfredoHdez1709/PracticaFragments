package com.ahrsoft.movil.practicafragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SeriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
    }

    public void ClickHome1 (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
