package com.example.aucgpagpacalculator.departments.reg21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.aucgpagpacalculator.R;
import com.example.aucgpagpacalculator.departments.reg17.aero.AeroActivity;
import com.example.aucgpagpacalculator.departments.reg17.agri.AgriActivity;
import com.example.aucgpagpacalculator.departments.reg21.aids.R21AidsActivity;
import com.example.aucgpagpacalculator.departments.reg17.bme.BmeActivity;
import com.example.aucgpagpacalculator.departments.reg17.civil.CivilActivity;
import com.example.aucgpagpacalculator.departments.reg17.cse.CseActivity;
import com.example.aucgpagpacalculator.departments.reg21.cybersec.R21CybersecActivity;
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
import com.example.aucgpagpacalculator.departments.reg21.aero.R21AeroActivity;
import com.example.aucgpagpacalculator.departments.reg21.agri.R21AgriActivity;
import com.example.aucgpagpacalculator.departments.reg21.aids.R21AidsActivity;
import com.example.aucgpagpacalculator.departments.reg21.bme.R21BmeActivity;
import com.example.aucgpagpacalculator.departments.reg21.civil.R21CivilActivity;
import com.example.aucgpagpacalculator.departments.reg21.cse.R21CseActivity;
import com.example.aucgpagpacalculator.departments.reg21.cybersec.R21CybersecActivity;
import com.example.aucgpagpacalculator.departments.reg21.ece.R21EceActivity;
import com.example.aucgpagpacalculator.departments.reg21.eee.R21EeeActivity;
import com.example.aucgpagpacalculator.departments.reg21.food.R21FoodActivity;
import com.example.aucgpagpacalculator.departments.reg21.it.R21ItActivity;
import com.example.aucgpagpacalculator.departments.reg21.mba.R21MbaActivity;
import com.example.aucgpagpacalculator.departments.reg21.mca.R21McaActivity;
import com.example.aucgpagpacalculator.departments.reg21.meaero.R21MeaeroActivity;
import com.example.aucgpagpacalculator.departments.reg21.mech.R21MechActivity;
import com.example.aucgpagpacalculator.departments.reg21.mecs.R21MecsActivity;
import com.example.aucgpagpacalculator.departments.reg21.mecse.R21MecseActivity;
import com.example.aucgpagpacalculator.departments.reg21.meped.R21MepedActivity;

public class R21DepartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r21_department);

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
        Button cybersec = findViewById(R.id.cyberbtn);
        Button ai = findViewById(R.id.aidsbtn);
        Button mba = findViewById(R.id.mbabtn);
        Button mca = findViewById(R.id.mcabtn);
        Button mecse = findViewById(R.id.mecsebtn);
        Button meed = findViewById(R.id.mepedbtn);
        Button mec = findViewById(R.id.mecsbtn);
        Button meaero = findViewById(R.id.meaerobtn);

        //action of buttons
        cse.setOnClickListener(view ->{
            Intent csepg = new Intent(getApplicationContext(), R21CseActivity.class);
            startActivity(csepg);
        } );
        eee.setOnClickListener(view ->{
            Intent eeepg = new Intent(getApplicationContext(), R21EeeActivity.class);
            startActivity(eeepg);
        } );
        ece.setOnClickListener(view ->{
            Intent ecepg = new Intent(getApplicationContext(), R21EceActivity.class);
            startActivity(ecepg);
        } );
        aero.setOnClickListener(view ->{
            Intent aeropg = new Intent(getApplicationContext(), R21AeroActivity.class);
            startActivity(aeropg);
        } );
        it.setOnClickListener(view ->{
            Intent itpg = new Intent(getApplicationContext(), R21ItActivity.class);
            startActivity(itpg);
        } );
        mech.setOnClickListener(view ->{
            Intent mechpg = new Intent(getApplicationContext(), R21MechActivity.class);
            startActivity(mechpg);
        } );
        civil.setOnClickListener(view ->{
            Intent civilpg = new Intent(getApplicationContext(), R21CivilActivity.class);
            startActivity(civilpg);
        } );
        agri.setOnClickListener(view ->{
            Intent agripg = new Intent(getApplicationContext(), R21AgriActivity.class);
            startActivity(agripg);
        } );
        food.setOnClickListener(view ->{
            Intent foodpg = new Intent(getApplicationContext(), R21FoodActivity.class);
            startActivity(foodpg);
        } );
        bme.setOnClickListener(view ->{
            Intent bmepg = new Intent(getApplicationContext(), R21BmeActivity.class);
            startActivity(bmepg);
        } );
        cybersec.setOnClickListener(view ->{
            Intent cybersecpg = new Intent(getApplicationContext(), R21CybersecActivity.class);
            startActivity(cybersecpg);
        } );
        ai.setOnClickListener(view ->{
            Intent aipg = new Intent(getApplicationContext(), R21AidsActivity.class);
            startActivity(aipg);
        } );
        mba.setOnClickListener(view ->{
            Intent mbapg = new Intent(getApplicationContext(), R21MbaActivity.class);
            startActivity(mbapg);
        } );
        mca.setOnClickListener(view ->{
            Intent mcapg = new Intent(getApplicationContext(), R21McaActivity.class);
            startActivity(mcapg);
        } );
        mecse.setOnClickListener(view ->{
            Intent mecsepg = new Intent(getApplicationContext(), R21MecseActivity.class);
            startActivity(mecsepg);
        } );
        mec.setOnClickListener(view ->{
            Intent mecpg = new Intent(getApplicationContext(), R21MecsActivity.class);
            startActivity(mecpg);
        } );
        meed.setOnClickListener(view ->{
            Intent meedpg = new Intent(getApplicationContext(), R21MepedActivity.class);
            startActivity(meedpg);
        } );
        meaero.setOnClickListener(view ->{
            Intent meaeropg = new Intent(getApplicationContext(), R21MeaeroActivity.class);
            startActivity(meaeropg);
        } );
    }
}