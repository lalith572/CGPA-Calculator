package com.example.aucgpagpacalculator.departments.reg21.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.aucgpagpacalculator.R;

public class R21CseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r21_cse);

        Button sem1 = findViewById(R.id.sem1);
        Button sem2 = findViewById(R.id.sem2);
        Button sem3 = findViewById(R.id.sem3);
        Button sem4 = findViewById(R.id.sem4);
        Button sem5 = findViewById(R.id.sem5);
        Button sem6 = findViewById(R.id.sem6);
        Button sem7 = findViewById(R.id.sem7);
        Button sem8 = findViewById(R.id.sem8);

        sem1.setOnClickListener(view ->{
            Intent s1 = new Intent(getApplicationContext(), R21CseS1Activity.class);
            startActivity(s1);
        } );

        sem2.setOnClickListener(view ->{
            Intent s2 = new Intent(getApplicationContext(), R21CseS2Activity.class);
            startActivity(s2);
        } );

        sem3.setOnClickListener(view ->{
            Intent s3 = new Intent(getApplicationContext(), R21CseS3Activity.class);
            startActivity(s3);
        } );

        sem4.setOnClickListener(view ->{
            Intent s4 = new Intent(getApplicationContext(), R21CseS4Activity.class);
            startActivity(s4);
        } );

        sem5.setOnClickListener(view ->{
            Intent s5 = new Intent(getApplicationContext(), R21CseS5Activity.class);
            startActivity(s5);
        } );

        sem6.setOnClickListener(view ->{
            Intent s6 = new Intent(getApplicationContext(), R21CseS6Activity.class);
            startActivity(s6);
        } );

        sem7.setOnClickListener(view ->{
            Intent s7 = new Intent(getApplicationContext(), R21CseS7Activity.class);
            startActivity(s7);
        } );

        sem8.setOnClickListener(view ->{
            Intent s8 = new Intent(getApplicationContext(), R21CseS8Activity.class);
            startActivity(s8);
        } );
    }
}