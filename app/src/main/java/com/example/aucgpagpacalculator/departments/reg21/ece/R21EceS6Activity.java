package com.example.aucgpagpacalculator.departments.reg21.ece;

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

public class R21EceS6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r21_ece_s6);

        Button r21s6gpabtn = findViewById(R.id.s6gpabtn);
        TextView r21s6gpatv = findViewById(R.id.s6gpatextView);
        Spinner spinner=findViewById(R.id.spinner);
        Spinner spinner2=findViewById(R.id.spinner2);
        Spinner spinner3=findViewById(R.id.spinner3);
        Spinner spinner4=findViewById(R.id.spinner4);
        Spinner spinner5=findViewById(R.id.spinner5);
        Spinner spinner6=findViewById(R.id.spinner6);
        Spinner spinner7=findViewById(R.id.spinner7);
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

        r21s6gpabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String grade1 = spinner.getSelectedItem().toString();
                String grade2 = spinner2.getSelectedItem().toString();
                String grade3 = spinner3.getSelectedItem().toString();
                String grade4 = spinner4.getSelectedItem().toString();
                String grade5 = spinner5.getSelectedItem().toString();
                String grade6 = spinner6.getSelectedItem().toString();
                String grade7 = spinner7.getSelectedItem().toString();

                // Calculate the GPA based on the grades
                double Gpa = calculate(grade1, grade2, grade3, grade4, grade5, grade6, grade7);


                r21s6gpatv.setText(Gpa + "  ");
            }

            public double calculate(String grade1, String grade2, String grade3, String
                    grade4, String grade5, String grade6, String grade7) {
                // Convert the grades to numeric values
                double S1marks = gradePoint(grade1);
                double S2marks = gradePoint(grade2);
                double S3marks = gradePoint(grade3);
                double S4marks = gradePoint(grade4);
                double S5marks = gradePoint(grade5);
                double S6marks = gradePoint(grade6);
                double S7marks = gradePoint(grade7);

                // Calculate the GPA based on the marks
                double gpa = (S1marks * 4 + S2marks * 4 + S3marks * 3 + S4marks * 3 + S5marks * 3 + S6marks * 3 + S7marks * 0);
                // Calculate the gp based on the marks
                double S1gp,S2gp,S3gp,S4gp,S5gp,S6gp,S7gp;

                if (S1marks==0.0){
                    S1gp = 0;
                }
                else{
                    S1gp = 4;
                }
                if (S2marks==0.0){
                    S2gp= 0;
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
                if (S6marks==0.0){
                    S6gp = 0;
                }
                else{
                    S6gp = 3;
                }
                if (S7marks==0.0){
                    S7gp = 0;
                }
                else{
                    S7gp = 0.0;
                }

                double gp = (S1gp + S2gp + S3gp + S4gp + S5gp + S6gp + S7gp);

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