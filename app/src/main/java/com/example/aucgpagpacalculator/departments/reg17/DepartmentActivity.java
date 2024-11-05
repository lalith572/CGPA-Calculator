package com.example.aucgpagpacalculator.departments.reg17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.aucgpagpacalculator.R;
import com.example.aucgpagpacalculator.departments.reg17.aero.AeroActivity;
import com.example.aucgpagpacalculator.departments.reg17.agri.AgriActivity;
import com.example.aucgpagpacalculator.departments.reg17.bme.BmeActivity;
import com.example.aucgpagpacalculator.departments.reg17.civil.CivilActivity;
import com.example.aucgpagpacalculator.departments.reg17.cse.CseActivity;
import com.example.aucgpagpacalculator.departments.reg17.ece.EceActivity;
import com.example.aucgpagpacalculator.departments.reg17.eee.EeeActivity;
import com.example.aucgpagpacalculator.departments.reg17.food.FoodActivity;
import com.example.aucgpagpacalculator.departments.reg17.it.ItActivity;
import com.example.aucgpagpacalculator.departments.reg17.mba.MbaActivity;
import com.example.aucgpagpacalculator.departments.reg17.mca.McaActivity;
import com.example.aucgpagpacalculator.departments.reg17.meaero.MeaeroActivity;
import com.example.aucgpagpacalculator.departments.reg17.mech.MechActivity;
import com.example.aucgpagpacalculator.departments.reg17.mecs.MecsActivity;
import com.example.aucgpagpacalculator.departments.reg17.mecse.MecseActivity;
import com.example.aucgpagpacalculator.departments.reg17.meped.MepedActivity;

public class DepartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        //declaring buttons
        Button cse = findViewById(R.id.csebtn);
        Button eee = findViewById(R.id.eeebtn);
        Button ece = findViewById(R.id.ecebtn);
        Button aero = findViewById(R.id.aerobtn);
        Button it = findViewById(R.id.itbtn);
        Button mech = findViewById(R.id.mechbtn);
        Button bme = findViewById(R.id.bmebtn);
        Button food = findViewById(R.id.foodbtn);
        Button agri = findViewById(R.id.agribtn);
        Button civil = findViewById(R.id.civilbtn);
        Button mba = findViewById(R.id.mbabtn);
        Button mca = findViewById(R.id.mcabtn);
        Button mecse = findViewById(R.id.mecsebtn);
        Button meed = findViewById(R.id.mepedbtn);
        Button mec = findViewById(R.id.mecsbtn);
        Button meaero = findViewById(R.id.meaerobtn);

        //action of buttons
        cse.setOnClickListener(view ->{
            Intent csepg = new Intent(getApplicationContext(), CseActivity.class);
            startActivity(csepg);
        } );
        eee.setOnClickListener(view ->{
            Intent eeepg = new Intent(getApplicationContext(), EeeActivity.class);
            startActivity(eeepg);
        } );
        ece.setOnClickListener(view ->{
            Intent ecepg = new Intent(getApplicationContext(), EceActivity.class);
            startActivity(ecepg);
        } );
        aero.setOnClickListener(view ->{
            Intent aeropg = new Intent(getApplicationContext(), AeroActivity.class);
            startActivity(aeropg);
        } );
        it.setOnClickListener(view ->{
            Intent itpg = new Intent(getApplicationContext(), ItActivity.class);
            startActivity(itpg);
        } );
        mech.setOnClickListener(view ->{
            Intent mechpg = new Intent(getApplicationContext(), MechActivity.class);
            startActivity(mechpg);
        } );
        civil.setOnClickListener(view ->{
            Intent civilpg = new Intent(getApplicationContext(), CivilActivity.class);
            startActivity(civilpg);
        } );
        agri.setOnClickListener(view ->{
            Intent agripg = new Intent(getApplicationContext(), AgriActivity.class);
            startActivity(agripg);
        } );
        food.setOnClickListener(view ->{
            Intent foodpg = new Intent(getApplicationContext(), FoodActivity.class);
            startActivity(foodpg);
        } );
        bme.setOnClickListener(view ->{
            Intent bmepg = new Intent(getApplicationContext(), BmeActivity.class);
            startActivity(bmepg);
        } );
        mba.setOnClickListener(view ->{
            Intent mbapg = new Intent(getApplicationContext(), MbaActivity.class);
            startActivity(mbapg);
        } );
        mca.setOnClickListener(view ->{
            Intent mcapg = new Intent(getApplicationContext(), McaActivity.class);
            startActivity(mcapg);
        } );
        mecse.setOnClickListener(view ->{
            Intent mecsepg = new Intent(getApplicationContext(), MecseActivity.class);
            startActivity(mecsepg);
        } );
        mec.setOnClickListener(view ->{
            Intent mecpg = new Intent(getApplicationContext(), MecsActivity.class);
            startActivity(mecpg);
        } );
        meed.setOnClickListener(view ->{
            Intent meedpg = new Intent(getApplicationContext(), MepedActivity.class);
            startActivity(meedpg);
        } );
        meaero.setOnClickListener(view ->{
            Intent meaeropg = new Intent(getApplicationContext(), MeaeroActivity.class);
            startActivity(meaeropg);
        } );
    }
}