package com.ahrsoft.movil.practicafragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ClickArea(View view){
        Intent i = new Intent(this, AreasActivity.class);
        startActivity(i);
    }

    public  void ClickSerie(View view){
        Intent i = new Intent(this, SeriesActivity.class);
        startActivity(i);
    }

    public void ClickContac (View view){
        Toast.makeText(MainActivity.this, "Apartado de Contactos", Toast.LENGTH_LONG).show();
    }

    public void ClickSalir(View view){
        System.exit(0);
    }
}
