package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class osy_previousyearquestion_papers extends AppCompatActivity {

    CardView cv_previous_question_paper_summer_2015_osy;
    CardView cv_previous_question_paper_winter_2015_osy;

    CardView cv_previous_question_paper_summer_2016_osy;
    CardView cv_previous_question_paper_winter_2016_osy;

    CardView cv_previous_question_paper_summer_2017_osy;
    CardView cv_previous_question_paper_winter_2017_osy;

    CardView cv_previous_question_paper_summer_2018_osy;
    CardView cv_previous_question_paper_winter_2018_osy;

    CardView cv_previous_question_paper_summer_2019_osy;
    CardView cv_previous_question_paper_winter_2019_osy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osy_previousyearquestion_papers);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" OSY Previous Year Question Papers ");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);

        cv_previous_question_paper_summer_2015_osy=findViewById(R.id.previousquestionpapers_summer_2015_osy);
        cv_previous_question_paper_winter_2015_osy=findViewById(R.id.previousquestionpapers_winter_2015_osy);

        cv_previous_question_paper_summer_2016_osy=findViewById(R.id.previousquestionpapers_summer_2016_osy);
        cv_previous_question_paper_winter_2016_osy=findViewById(R.id.previousquestionpapers_winter_2016_osy);

        cv_previous_question_paper_summer_2017_osy=findViewById(R.id.previousquestionpapers_summer_2017_osy);
        cv_previous_question_paper_winter_2017_osy=findViewById(R.id.previousquestionpapers_winter_2017_osy);

        cv_previous_question_paper_summer_2018_osy=findViewById(R.id.previousquestionpapers_summer_2018_osy);
        cv_previous_question_paper_winter_2018_osy=findViewById(R.id.previousquestionpapers_winter_2018_osy);

        cv_previous_question_paper_summer_2019_osy=findViewById(R.id.previousquestionpapers_summer_2019_osy);
        cv_previous_question_paper_winter_2019_osy=findViewById(R.id.previousquestionpapers_winter_2019_osy);



        cv_previous_question_paper_summer_2015_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/15ZsekG4D23g6cdi7pyZ8a2MZxy5FX8Xc/view?usp=sharing") ;
            }
        });
        cv_previous_question_paper_winter_2015_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/15XskNCVJKyk_RVr4HfAqTMcmx5jcft_c/view?usp=sharing") ;
            }
        });


        cv_previous_question_paper_summer_2016_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/15_7-i7zDBHyaIczdSSVlNc4LCFwVJ6gz/view?usp=sharing") ;
            }
        });
        cv_previous_question_paper_winter_2016_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/15OjNKECdAFOwWgSa-sd3SjUlHU3yQR5V/view?usp=sharing") ;
            }
        });


        cv_previous_question_paper_summer_2017_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/15WW88vFXQiIOxFdh6lQOdCc448M8v5r3/view?usp=sharing") ;
            }
        });
        cv_previous_question_paper_winter_2017_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1f3X-F6Dy296d65YGeI3lfmxdPFuMqEOU/view?usp=sharing") ;
            }
        });


        cv_previous_question_paper_summer_2018_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1BfR4GAjzLIA2_JS2TqQuMv_psU9DxfPK/view?usp=sharing") ;
            }
        });
        cv_previous_question_paper_winter_2018_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1FFbFcpHKfqb-yjaJN-XnSda9V3ZhdYyH/view?usp=sharing") ;
            }
        });


        cv_previous_question_paper_summer_2019_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1jpCeCBrC_wtf-0NKLCONbWLJryzoAnfa/view?usp=sharing") ;
            }
        });
        cv_previous_question_paper_winter_2019_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1OUFGWCWnJu7Oai7MmIc2uvT1d-Gey8O1/view?usp=sharing") ;
            }
        });


    }

    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}