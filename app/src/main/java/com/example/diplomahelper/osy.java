package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class osy extends AppCompatActivity {
    CardView cv_osybook;
    CardView cv_osynotes;
    CardView cv_osymicroproject;
    CardView cv_osyquestion_banks;
    CardView cv_solved_mannual;
    CardView cv_lab_mannual;
    CardView cv_modelanswer_paper;
    CardView cv_previous_year_questionpapers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osy);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" Operating System");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);


        cv_osybook=findViewById(R.id.cv_books);
        cv_osynotes=findViewById(R.id.cv_notes);
        cv_osyquestion_banks=findViewById(R.id.cv_questionbanks);
        cv_lab_mannual=findViewById(R.id.cv_labmannuals);
        cv_solved_mannual=findViewById(R.id.cv_solvedlabmannual);

        cv_modelanswer_paper=findViewById(R.id.cv_modelanswerpaper);
        cv_osymicroproject=findViewById(R.id.cv_microproject);

        cv_previous_year_questionpapers=findViewById(R.id.cv_previousyearquestionpapers);


        cv_solved_mannual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(osy.this,osy_solvedmannual.class);
                startActivity(intent);
            }
        });



        cv_osybook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(osy.this,osy_book.class);
                startActivity(intent);
            }
        });

        cv_osyquestion_banks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(osy.this,osy_questionbank.class);
                startActivity(intent);
            }
        });

        cv_modelanswer_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(osy.this,osy_modelanswer_papers.class);
                startActivity(intent);
            }
        });

        cv_previous_year_questionpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(osy.this,osy_previousyearquestion_papers.class);
                startActivity(intent);
            }
        });


        cv_osynotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/14pmgeC0m647wx-C_8yMZKomQtbeTffrT?usp=sharing") ;
            }
        });

        cv_lab_mannual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1meFSp3Gl6edCtf4mANcWd6jIJfFvl_hg/view?usp=sharing") ;
            }
        });

        cv_osymicroproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://docs.google.com/document/d/1ImX0ugJfscim75jI-2sLN2BIpqjpH45-tF7TYV79TnE/edit?usp=sharing") ;
            }
        });

    }

    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }


}