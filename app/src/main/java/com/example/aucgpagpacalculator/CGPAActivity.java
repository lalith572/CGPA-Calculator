package com.example.aucgpagpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CGPAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);

        //declaring button and editTexts
        Button calcbtn = findViewById(R.id.calcbtn);


        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText sem1 = findViewById(R.id.sem1EditText);
                EditText sem2 = findViewById(R.id.sem2EditText);
                EditText sem3 = findViewById(R.id.sem3EditText);
                EditText sem4 = findViewById(R.id.sem4EditText);
                EditText sem5 = findViewById(R.id.sem5EditText);
                EditText sem6 = findViewById(R.id.sem6EditText);
                EditText sem7 = findViewById(R.id.sem7EditText);
                EditText sem8 = findViewById(R.id.sem8EditText);
                EditText nos = findViewById(R.id.noofsemEditText);
                TextView cgpa = findViewById(R.id.cgpaTextView);

                String s1 = (sem1.getText().toString());
                String s2 = (sem2.getText().toString());
                String s3 = (sem3.getText().toString());
                String s4 = (sem4.getText().toString());
                String s5 = (sem5.getText().toString());
                String s6 = (sem6.getText().toString());
                String s7 = (sem7.getText().toString());
                String s8 = (sem8.getText().toString());
                int n = Integer.parseInt(nos.getText().toString());

                double semester1,semester2,semester3,semester4,semester5,semester6,semester7,semester8;

                if(TextUtils.isEmpty(s1)){
                    semester1=0.0;
                }else{
                    semester1=Double.parseDouble(s1);
                }
                if(TextUtils.isEmpty(s2)){
                    semester2=0.0;
                }else{
                    semester2=Double.parseDouble(s2);
                }
                if(TextUtils.isEmpty(s3)){
                    semester3=0.0;
                }else{
                    semester3=Double.parseDouble(s3);
                }
                if(TextUtils.isEmpty(s4)){
                    semester4=0.0;
                }else{
                    semester4=Double.parseDouble(s4);
                }
                if(TextUtils.isEmpty(s5)){
                    semester5=0.0;
                }else{
                    semester5=Double.parseDouble(s5);
                }
                if(TextUtils.isEmpty(s6)){
                    semester6=0.0;
                }else{
                    semester6=Double.parseDouble(s6);
                }
                if(TextUtils.isEmpty(s7)){
                    semester7=0.0;
                }else{
                    semester7=Double.parseDouble(s7);
                }
                if(TextUtils.isEmpty(s8)){
                    semester8=0.0;
                }else{
                    semester8=Double.parseDouble(s8);
                }

                double result = (semester1 + semester2 + semester3 + semester4 + semester5 + semester6 + semester7 + semester8)/n ;


                cgpa.setText("your CGPA is " + result + " ");
            }
        } );
    }
}