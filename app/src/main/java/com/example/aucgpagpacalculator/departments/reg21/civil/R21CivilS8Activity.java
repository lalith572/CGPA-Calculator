package com.example.aucgpagpacalculator.departments.reg21.civil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aucgpagpacalculator.R;

import java.util.ArrayList;

public class R21CivilS8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r21_civil_s8);

        Button r21s8gpabtn = findViewById(R.id.s8gpabtn);
        TextView r21s8gpatv = findViewById(R.id.s8gpatextView);
        Spinner spinner=findViewById(R.id.spinner);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("O");
        arrayList.add("A+");
        arrayList.add("A");
        arrayList.add("B+");
        arrayList.add("B");
        arrayList.add("U/RA");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String pe4 = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + pe4, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        r21s8gpabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String grade1 = spinner.getSelectedItem().toString();

                // Calculate the GPA based on the grades
                double Gpa = calculate(grade1);


                r21s8gpatv.setText(Gpa + "  ");
            }

            public double calculate(String grade1) {
                // Convert the grades to numeric values
                double projectmarks = gradePoint(grade1);


                // Calculate the GPA based on the marks
                double gpa = (projectmarks * 10);


                // Calculate the gp based on the marks
                double projectgp;

                if (projectmarks==0.0){
                    projectgp = 0;
                }
                else{
                    projectgp = 10;
                }
                double gp = ( projectgp );

                double t_gpa = gpa / gp;
                return t_gpa;
            }

            public double gradePoint(String grade) {
                double mark = 0.0;

                if (grade.equals("O")) {
                    mark = 10.0;
                } else if (grade.equals("A+")) {
                    mark = 9.0;
                } else if (grade.equals("A")) {
                    mark = 8.0;
                } else if (grade.equals("B+")) {
                    mark = 7.0;
                } else if (grade.equals("B")) {
                    mark = 6.0;
                } else if (grade.equals("U") || grade.equals("RA")) {
                    mark = 0.0;
                }

                return mark;
            }
        });
    }
}