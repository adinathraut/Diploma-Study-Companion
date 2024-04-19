package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Semester_5 extends AppCompatActivity {

    CardView cv_opertaingsysytem;
    CardView cv_advancedjava;
    CardView cv_softwaretesting;
    CardView cv_envirnomentalstudies;
    CardView cv_clientsidescriptinglanguage;
    CardView cv_advancecomputernetwork;
    CardView cv_advancedatabasemanagementsystem;
    CardView cv_capstonprojectplannnig;
    CardView cv_industrialtraining;


    Button syllabus_5th_semester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester5);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" Semester Five");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);


        cv_opertaingsysytem=findViewById(R.id.cv_osy);
        cv_advancedjava=findViewById(R.id.cv_ajp);
        cv_softwaretesting=findViewById(R.id.cv_ste);
        cv_envirnomentalstudies=findViewById(R.id.cv_est);
        cv_clientsidescriptinglanguage=findViewById(R.id.cv_css);
        cv_advancecomputernetwork=findViewById(R.id.cv_acn);
        cv_advancedatabasemanagementsystem=findViewById(R.id.cv_adm);
        cv_capstonprojectplannnig=findViewById(R.id.cv_cpp);
        cv_industrialtraining=findViewById(R.id.cv_itr);


       syllabus_5th_semester=findViewById(R.id.btn_syllabus5th);

        cv_opertaingsysytem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Semester_5.this,osy.class);
                startActivity(intent);
            }
        });
        cv_advancedjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Semester_5.this,ajp.class);
                startActivity(intent);
            }
        });
        cv_softwaretesting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Semester_5.this,ste.class);
                startActivity(intent);
            }
        });
        cv_envirnomentalstudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Semester_5.this,est.class);
                startActivity(intent);
            }
        });
        cv_clientsidescriptinglanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Semester_5.this,css.class);
                startActivity(intent);
            }
        });

        cv_advancecomputernetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1opEA3BeBD1jb6fJTTWALJNiDQWqlrdIk?usp=sharing") ;

            }
        });
        cv_advancedatabasemanagementsystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1mAO2Tm53-X1K9avMQ8ixNsAvPbzYLGx2?usp=sharing") ;

            }
        });
        cv_capstonprojectplannnig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1g7j4e2NIVhuTmUEcDH6fHNlBkqSbAF-X?usp=sharing") ;

            }
        });
        cv_industrialtraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1ISTxBPh9xKA_AhaLNGmOmtslenAhpRwE?usp=sharing") ;

            }
        });






       syllabus_5th_semester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/10SZqyUsZBYEiSvFFFwur8HbsdsTUIxdJ/view?usp=sharing") ;
            }
        });


    }
    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }

}