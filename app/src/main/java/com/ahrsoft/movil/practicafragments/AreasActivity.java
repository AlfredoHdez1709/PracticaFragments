package com.ahrsoft.movil.practicafragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AreasActivity extends AppCompatActivity {

   private  TextView  textoformula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);



    }


    public void clickCirculo(View view){
        textoformula = (TextView) findViewById(R.id.txtFormula);
        textoformula.setText("A= (PI * Radio)2 ");
    }

    public void clickCuadrado(View view){
        textoformula = (TextView) findViewById(R.id.txtFormula);
        textoformula.setText("A = Lado X Lado");
    }

    public void clickTriangulo(View view){
        textoformula = (TextView) findViewById(R.id.txtFormula);
        textoformula.setText("A = (Base x Altura)/2");
    }


    public void ClickHome(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
