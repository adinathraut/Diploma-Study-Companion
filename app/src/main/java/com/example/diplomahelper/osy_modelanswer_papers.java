package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class osy_modelanswer_papers extends AppCompatActivity {


    CardView cv_model_answer_summer_2015_osy;
    CardView cv_model_answer_winter_2015_osy;

    CardView cv_model_answer_summer_2016_osy;
    CardView cv_model_answer_winter_2016_osy;

    CardView cv_model_answer_summer_2017_osy;
    CardView cv_model_answer_winter_2017_osy;

    CardView cv_model_answer_summer_2018_osy;
    CardView cv_model_answer_winter_2018_osy;

    CardView cv_model_answer_summer_2019_osy;
    CardView cv_model_answer_winter_2019_osy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osy_modelanswer_papers);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" OSY Model Answers ");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);

        cv_model_answer_summer_2015_osy=findViewById(R.id.modelanswer_summer_2015_osy);
        cv_model_answer_winter_2015_osy=findViewById(R.id.modelanswer_winter_2015_osy);

        cv_model_answer_summer_2016_osy=findViewById(R.id.modelanswer_summer_2016_osy);
        cv_model_answer_winter_2016_osy=findViewById(R.id.modelanswer_winter_2016_osy);

        cv_model_answer_summer_2017_osy=findViewById(R.id.modelanswer_summer_2017_osy);
        cv_model_answer_winter_2017_osy=findViewById(R.id.modelanswer_winter_2017_osy);

        cv_model_answer_summer_2018_osy=findViewById(R.id.modelanswer_summer_2018_osy);
        cv_model_answer_winter_2018_osy=findViewById(R.id.modelanswer_winter_2018_osy);

        cv_model_answer_summer_2019_osy=findViewById(R.id.modelanswer_summer_2019_osy);
        cv_model_answer_winter_2019_osy=findViewById(R.id.modelanswer_winter_2019_osy);




        cv_model_answer_summer_2015_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/148TbNBrQ3y-MzJrfAgsv7WAvg_zqrvdB/view?usp=sharing") ;
            }
        });
        cv_model_answer_winter_2015_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/140N67U5iKFxUk1hWrqYFoEM7aB0PIliT/view?usp=sharing") ;
            }
        });


        cv_model_answer_summer_2016_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/148ckysB0Gsv_wvis21Pel6orClEyxGuu/view?usp=sharing") ;
            }
        });
        cv_model_answer_winter_2016_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/14-SIKJeakl84oQ830ml-9YGv8Py6Vhxp/view?usp=sharing") ;
            }
        });


        cv_model_answer_summer_2017_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/13x2fw44WXcwl6ORvwycBuZXZcczhvg6F/view?usp=sharing") ;
            }
        });
        cv_model_answer_winter_2017_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/13vnil0pC3RF8BdpogYnw2YQjx1O0mtpR/view?usp=sharing") ;
            }
        });


        cv_model_answer_summer_2018_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/13fl0O90fTNlIz_Nrsihork-3MxV9TLOI/view?usp=sharing") ;
            }
        });
        cv_model_answer_winter_2018_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/13f-AFG0Pjk-4VgtwyLD3VgPniPRDRiR7/view?usp=sharing") ;
            }
        });


        cv_model_answer_summer_2019_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/13blA-h-EcZcIC4xFsrYTS15E88-kV1Wr/view?usp=sharing") ;
            }
        });
        cv_model_answer_winter_2019_osy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/13Vxm4fSjByRWbiITAAamp2hXGz6FzBrO/view?usp=sharing") ;
            }
        });





    }

    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}