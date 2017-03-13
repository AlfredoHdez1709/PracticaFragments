package com.ahrsoft.movil.practicafragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Scanner;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

    private TextView resultprimo;
    private EditText numprimo;
    private Button btnprimo;



    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        resultprimo = (TextView) view.findViewById(R.id.seriePrimos);
        numprimo = (EditText) view.findViewById(R.id.txtprimos);
        btnprimo = (Button) view.findViewById(R.id.btnprimos);

        btnprimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1  = numprimo.getText().toString();
                int var = Integer.parseInt(num1);
                int i =1, j =1;
                
                String result = "";
              
                for ( i = 1; i < var ; i++){
                    int count = 0;
                    for ( j = 1; j <= i; j++){
                        if(i % j == 0)
                            count++;

                    }
                    if(count==2){
                        result += " " + String.valueOf(i);
                        resultprimo.setText(result);
                    }
                }

            }
        });

        return view;

    }

}
