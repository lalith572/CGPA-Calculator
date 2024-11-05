package com.example.aucgpagpacalculator.departments.reg17.mecs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.aucgpagpacalculator.R;

public class MecsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecs);

        Button sem1 = findViewById(R.id.sem1);
        Button sem2 = findViewById(R.id.sem2);
        Button sem3 = findViewById(R.id.sem3);
        Button sem4 = findViewById(R.id.sem4);

        sem1.setOnClickListener(view ->{
            Intent s1 = new Intent(getApplicationContext(), MecsS1Activity.class);
            startActivity(s1);
        } );

        sem2.setOnClickListener(view ->{
            Intent s2 = new Intent(getApplicationContext(), MecsS2Activity.class);
            startActivity(s2);
        } );

        sem3.setOnClickListener(view ->{
            Intent s3 = new Intent(getApplicationContext(), MecsS3Activity.class);
            startActivity(s3);
        } );

        sem4.setOnClickListener(view ->{
            Intent s4 = new Intent(getApplicationContext(), MecsS4Activity.class);
            startActivity(s4);
        } );
    }
}