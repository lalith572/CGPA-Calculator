package com.example.aucgpagpacalculator.departments.reg17.meped;

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

public class MepedS3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meped_s3);

        Button s3gpabtn = findViewById(R.id.s3gpabtn);
        TextView s3gpatv = findViewById(R.id.s3gpatextView);
        Spinner spinner=findViewById(R.id.spinner);
        Spinner spinner2=findViewById(R.id.spinner2);
        Spinner spinner3=findViewById(R.id.spinner3);
        Spinner spinner4=findViewById(R.id.spinner4);
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
                String sub = parent.getItemAtPosition(position).toString();
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

        s3gpabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input values from the EditText fields
                String grade1 = spinner.getSelectedItem().toString();
                String grade2 = spinner2.getSelectedItem().toString();
                String grade3 = spinner3.getSelectedItem().toString();
                String grade4 = spinner4.getSelectedItem().toString();

                // Calculate the GPA based on the grades
                double Gpa = calculate(grade1, grade2, grade3, grade4);


                s3gpatv.setText(Gpa + "  ");
            }

            public double calculate (String grade1, String grade2, String grade3, String grade4){
                // Convert the grades to numeric values
                double S1marks = gradePoint(grade1);
                double S2marks = gradePoint(grade2);
                double S3marks = gradePoint(grade3);
                double L1marks = gradePoint(grade4);

                // Calculate the GPA based on the marks
                double gpa = (S1marks * 3 + S2marks * 3 + S3marks * 3 + L1marks * 6 );
                // calculate gp based on the marks
                double S1gp,S2gp,S3gp,L1gp;

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
                if (S3marks==0.0){
                    S3gp = 0;
                }
                else{
                    S3gp = 3;
                }
                if (L1marks==0.0){
                    L1gp = 0;
                }
                else{
                    L1gp = 6;
                }

                double gp = (S1gp + S2gp + S3gp + L1gp);
                double t_gpa = gpa / gp;
                return t_gpa;
            }

            public double gradePoint (String grade){
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