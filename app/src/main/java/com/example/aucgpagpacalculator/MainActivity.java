package com.example.aucgpagpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        Animation addanim,subanim,divanim,eqlanim,mulanim,peranim,textanim,text2anim;
        ImageView addimage,subimage,divimage,mulimage,perimage,eqlimage;
        TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addanim = AnimationUtils.loadAnimation(this,R.anim.add);
        subanim = AnimationUtils.loadAnimation(this,R.anim.sub);
        mulanim = AnimationUtils.loadAnimation(this,R.anim.mul);
        divanim = AnimationUtils.loadAnimation(this,R.anim.div);
        peranim = AnimationUtils.loadAnimation(this,R.anim.per);
        eqlanim = AnimationUtils.loadAnimation(this,R.anim.eql);
        textanim = AnimationUtils.loadAnimation(this,R.anim.text);
        text2anim = AnimationUtils.loadAnimation(this,R.anim.text2);

        addimage = findViewById(R.id.addImage);
        subimage = findViewById(R.id.subImage);
        mulimage = findViewById(R.id.mulImage);
        divimage = findViewById(R.id.divImage);
        perimage = findViewById(R.id.perImage);
        eqlimage = findViewById(R.id.eqlImage);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                addimage.startAnimation(addanim);
                subimage.startAnimation(subanim);
                mulimage.startAnimation(mulanim);
                divimage.startAnimation(divanim);
                perimage.startAnimation(peranim);
                eqlimage.startAnimation(eqlanim);
                tv1.startAnimation(textanim);
                tv2.startAnimation(text2anim);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this, SelectActivity.class));
                        finish();
                    }
                }, 4000);
            }
        },2000);





    }
}