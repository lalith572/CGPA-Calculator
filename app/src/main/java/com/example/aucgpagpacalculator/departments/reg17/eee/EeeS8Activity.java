package com.example.aucgpagpacalculator.departments.reg17.eee;

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

public class EeeS8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee_s8);

        Button s8gpabtn = findViewById(R.id.s8gpabtn);
        TextView s8gpatv = findViewById(R.id.s8gpatextView);
        Spinner spinner=findViewById(R.id.spinner);
        Spinner spinner2=findViewById(R.id.spinner2);
        Spinner spinner3=findViewById(R.id.spinner3);
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

        spinner2.setAdapter(arrayAdapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String pe5 = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + pe5, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner3.setAdapter(arrayAdapter);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String project = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + project, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        s8gpabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String grade1 = spinner.getSelectedItem().toString();
                String grade2 = spinner2.getSelectedItem().toString();
                String grade3 = spinner3.getSelectedItem().toString();


                // Calculate the GPA based on the grades
                double Gpa = calculate(grade1 , grade2 , grade3);


                s8gpatv.setText(Gpa + "  ");
            }

            public double calculate(String grade1, String grade2, String grade3) {
                // Convert the grades to numeric values
                double S1marks = gradePoint(grade1);
                double S2marks = gradePoint(grade2);
                double projectmarks = gradePoint(grade3);


                // Calculate the GPA based on the marks
                double gpa = (S1marks * 3 + S2marks * 3 + projectmarks * 10);


                // Calculate the gp based on the marks
                double S1gp,S2gp,projectgp;

                if (S1marks==0.0){
                    S1gp = 0;
                }
                else{
                    S1gp = 3;
                }
                if (S2marks==0.0){
                    S2gp = 0;
                }
                else{
                    S2gp = 3;
                }
                if (projectmarks==0.0){
                    projectgp = 0;
                }
                else{
                    projectgp = 10;
                }
                double gp = (S1gp + S2gp + projectgp );

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