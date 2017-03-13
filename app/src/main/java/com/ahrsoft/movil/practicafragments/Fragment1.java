package com.ahrsoft.movil.practicafragments;


import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    private TextView resultFibo;
    private EditText numFibo;
    private Button btnIniciarFibo;



    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment1, container, false);

        resultFibo = (TextView) view.findViewById(R.id.seriefibo);
        numFibo = (EditText) view.findViewById(R.id.txtFibona);
        btnIniciarFibo = (Button) view.findViewById(R.id.btnFobi);



        btnIniciarFibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String num1  = numFibo.getText().toString();
                int var = Integer.parseInt(num1);
                String res;
                int  c,f1,f2,f3=0;
                c=0;
                f1=0;
                f2=1;

                res = String.valueOf(f1);
                while(c<var){
                    res += " " + String.valueOf(f1);
                    f3=f1+f2;
                    f1=f2;
                    f2=f3;
                    c++;
                }
                resultFibo.setText(res);
            }
        });

        return view;
    }


}
