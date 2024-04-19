package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ste extends AppCompatActivity {
    CardView cv_stebook;
    CardView cv_stenotes;
    CardView cv_lab_mannual;
    CardView cv_solved_mannual;
    CardView cv_stequestion_banks;
    CardView cv_modelanswer_paper;
    CardView cv_stemicroproject;
    CardView cv_previous_year_questionpapers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ste);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" Software Testing");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);

        cv_stebook=findViewById(R.id.cv_books);
        cv_stequestion_banks=findViewById(R.id.cv_questionbanks);
        cv_stenotes=findViewById(R.id.cv_notes);
        cv_lab_mannual=findViewById(R.id.cv_labmannuals);
        cv_solved_mannual=findViewById(R.id.cv_solvedlabmannual);
        cv_modelanswer_paper=findViewById(R.id.cv_modelanswerpaper);
        cv_previous_year_questionpapers=findViewById(R.id.cv_previousyearquestionpapers);
        cv_stemicroproject=findViewById(R.id.cv_microproject);


        cv_stebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ste.this,ste_book.class);
                startActivity(intent);
            }
        });

        cv_stequestion_banks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1Y5xsTn0-dKTxOdcfksaw8k_KQ3wvEPVj?usp=sharing");
            }
        });

        cv_solved_mannual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/16EONsDFavAfxpCUknq47exUDF_F-vGSQ?usp=sharing");

            }
        });


        cv_lab_mannual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1pcXjlwJgjddse02EHEn_GXZMLKIo_01l/view?usp=sharing") ;
            }
        });

        cv_previous_year_questionpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1I2l0KA9AKWwvwPzKKS3-cjahjf4Fu_r9?usp=sharing") ;

            }
        });

        cv_modelanswer_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1r-f-sYt1chGPbKqAqXuXu2UDH6Du4ALy?usp=sharing") ;

            }
        });

        cv_stenotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1ipWx8ix-WTEK_hxFVvZ1Ar4YzbsFEqPL?usp=sharing") ;
            }
        });
        cv_stemicroproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/17ZlHPJaupquGGek-3TEzn9Haj-shBKE9?usp=sharing") ;
            }
        });

    }
    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}