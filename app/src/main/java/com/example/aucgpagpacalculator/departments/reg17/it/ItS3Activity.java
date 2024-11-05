package com.example.aucgpagpacalculator.departments.reg17.it;

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

public class ItS3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_s3);

        Button s3gpabtn = findViewById(R.id.s3gpabtn);
        TextView s3gpatv = findViewById(R.id.s3gpatextView);
        Spinner spinner=findViewById(R.id.spinner);
        Spinner spinner2=findViewById(R.id.spinner2);
        Spinner spinner3=findViewById(R.id.spinner3);
        Spinner spinner4=findViewById(R.id.spinner4);
        Spinner spinner5=findViewById(R.id.spinner5);
        Spinner spinner6=findViewById(R.id.spinner6);
        Spinner spinner7=findViewById(R.id.spinner7);
        Spinner spinner8=findViewById(R.id.spinner8);
        Spinner spinner9=findViewById(R.id.spinner9);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("O");
        arrayList.add("A+");
        arrayList.add("A");
        arrayList.add("B+");
        arrayList.add("B");
        arrayList.add("U/RA");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sub= parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + sub,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });
        spinner2.setAdapter(arrayAdapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sub = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + sub,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });
        spinner3.setAdapter(arrayAdapter);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sub = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + sub,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });
        spinner4.setAdapter(arrayAdapter);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sub = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + sub,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });
        spinner5.setAdapter(arrayAdapter);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sub = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + sub,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });
        spinner6.setAdapter(arrayAdapter);
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sub = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + sub,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });
        spinner7.setAdapter(arrayAdapter);
        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sub = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + sub,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });
        spinner8.setAdapter(arrayAdapter);
        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sub = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + sub,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });
        spinner9.setAdapter(arrayAdapter);
        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sub = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + sub,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });

        s3gpabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String grade1 = spinner.getSelectedItem().toString();
                String grade2 = spinner2.getSelectedItem().toString();
                String grade3 = spinner3.getSelectedItem().toString();
                String grade4 = spinner4.getSelectedItem().toString();
                String grade5 = spinner5.getSelectedItem().toString();
                String grade6 = spinner6.getSelectedItem().toString();
                String grade7 = spinner7.getSelectedItem().toString();
                String grade8 = spinner8.getSelectedItem().toString();
                String grade9 = spinner9.getSelectedItem().toString();

                // Calculate the GPA based on the grades
                double Gpa = calculate(grade1, grade2, grade3, grade4, grade5, grade6, grade7, grade8 , grade9);


                s3gpatv.setText(Gpa + "  ");
            }

            public double calculate(String grade1, String grade2, String grade3, String
                    grade4, String grade5, String grade6, String grade7, String grade8, String grade9) {
                // Convert the grades to numeric values
                double S1marks = gradePoint(grade1);
                double S2marks = gradePoint(grade2);
                double S3marks = gradePoint(grade3);
                double S4marks = gradePoint(grade4);
                double S5marks = gradePoint(grade5);
                double L1marks = gradePoint(grade6);
                double L2marks = gradePoint(grade7);
                double L3marks = gradePoint(grade8);
                double L4marks = gradePoint(grade9);


                // Calculate the GPA based on the marks
                double gpa = (S1marks * 4 + S2marks * 4 + S3marks * 3 + S4marks * 3 + S5marks * 3 + L1marks * 2 + L2marks * 2 + L3marks * 2+ L4marks * 1);
                // Calculate the gp based on the marks
                double S1gp,S2gp,S3gp,S4gp,S5gp,L1gp,L2gp,L3gp,L4gp;

                if (S1marks==0.0){
                    S1gp = 0;
                }
                else{
                    S1gp = 4;
                }
                if (S2marks==0.0){
                    S2gp = 0;
                }
                else{
                    S2gp = 4;
                }
                if (S3marks==0.0){
                    S3gp = 0;
                }
                else{
                    S3gp = 3;
                }
                if (S4marks==0.0){
                    S4gp = 0;
                }
                else{
                    S4gp = 3;
                }
                if (S5marks==0.0){
                    S5gp = 0;
                }
                else{
                    S5gp = 3;
                }
                if (L1marks==0.0){
                    L1gp = 0;
                }
                else{
                    L1gp = 2;
                }
                if (L2marks==0.0){
                    L2gp = 0;
                }
                else{
                    L2gp = 2;
                }
                if (L3marks==0.0){
                    L3gp = 0;
                }
                else{
                    L3gp = 2;
                }
                if (L4marks==0.0){
                    L4gp = 0;
                }
                else{
                    L4gp = 1;
                }
                double gp = (S1gp + S2gp + S3gp + S4gp + S5gp + L1gp + L2gp + L3gp + L4gp);

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