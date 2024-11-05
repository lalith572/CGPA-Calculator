package com.example.aucgpagpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.aucgpagpacalculator.departments.reg17.DepartmentActivity;
import com.example.aucgpagpacalculator.departments.reg21.R21DepartmentActivity;

public class RegulationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regulation);

        Button Reg17 = findViewById(R.id.R17btn);
        Button Reg21 = findViewById(R.id.R21btn);

        Reg17.setOnClickListener(view ->{
            Intent deptpg = new Intent(getApplicationContext(), DepartmentActivity.class);
            startActivity(deptpg);
        } );

        Reg21.setOnClickListener(view ->{
            Intent r21deptpg = new Intent(getApplicationContext(), R21DepartmentActivity.class);
            startActivity(r21deptpg);
        } );
    }
}