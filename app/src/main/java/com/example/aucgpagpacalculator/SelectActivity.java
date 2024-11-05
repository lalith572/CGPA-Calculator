package com.example.aucgpagpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        //declaring buttons
        Button gpabtn = findViewById(R.id.gpabtn);
        Button cgpabtn = findViewById(R.id.cgpabtn);

        //gpa button action
        gpabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regpg = new Intent(getApplicationContext(), RegulationActivity.class);
                startActivity(regpg);
            }
        });

        //cgpa button action
        cgpabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cgpapg = new Intent(getApplicationContext(), CGPAActivity.class);
                startActivity(cgpapg);
            }
        });
    }
}