package com.example.aucgpagpacalculator.departments.reg21.it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.aucgpagpacalculator.R;

public class R21ItActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r21_it);

        Button sem1 = findViewById(R.id.sem1);
        Button sem2 = findViewById(R.id.sem2);
        Button sem3 = findViewById(R.id.sem3);
        Button sem4 = findViewById(R.id.sem4);
        Button sem5 = findViewById(R.id.sem5);
        Button sem6 = findViewById(R.id.sem6);
        Button sem7 = findViewById(R.id.sem7);
        Button sem8 = findViewById(R.id.sem8);

        sem1.setOnClickListener(view ->{
            Intent s1 = new Intent(getApplicationContext(), R21ItS1Activity.class);
            startActivity(s1);
        } );

        sem2.setOnClickListener(view ->{
            Intent s2 = new Intent(getApplicationContext(), R21ItS2Activity.class);
            startActivity(s2);
        } );

        sem3.setOnClickListener(view ->{
            Intent s3 = new Intent(getApplicationContext(), R21ItS3Activity.class);
            startActivity(s3);
        } );

        sem4.setOnClickListener(view ->{
            Intent s4 = new Intent(getApplicationContext(), R21ItS4Activity.class);
            startActivity(s4);
        } );

        sem5.setOnClickListener(view ->{
            Intent s5 = new Intent(getApplicationContext(), R21ItS5Activity.class);
            startActivity(s5);
        } );

        sem6.setOnClickListener(view ->{
            Intent s6 = new Intent(getApplicationContext(), R21ItS6Activity.class);
            startActivity(s6);
        } );

        sem7.setOnClickListener(view ->{
            Intent s7 = new Intent(getApplicationContext(), R21ItS7Activity.class);
            startActivity(s7);
        } );

        sem8.setOnClickListener(view ->{
            Intent s8 = new Intent(getApplicationContext(), R21ItS8Activity.class);
            startActivity(s8);
        } );
    }
}