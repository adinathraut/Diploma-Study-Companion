package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ajp extends AppCompatActivity {

    CardView cv_ajpbook;
    CardView cv_ajpnotes;
    CardView cv_lab_mannual;
    CardView cv_solved_mannual;
    CardView cv_ajpquestion_banks;
    CardView cv_modelanswer_paper;
    CardView cv_ajpmicroproject;
    CardView cv_previous_year_questionpapers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajp);


        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" Advanced Java");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);

        cv_ajpbook=findViewById(R.id.cv_books);
        cv_ajpquestion_banks=findViewById(R.id.cv_questionbanks);
        cv_ajpnotes=findViewById(R.id.cv_notes);
        cv_lab_mannual=findViewById(R.id.cv_labmannuals);
        cv_solved_mannual=findViewById(R.id.cv_solvedlabmannual);
        cv_modelanswer_paper=findViewById(R.id.cv_modelanswerpaper);
        cv_previous_year_questionpapers=findViewById(R.id.cv_previousyearquestionpapers);
        cv_ajpmicroproject=findViewById(R.id.cv_microproject);

        cv_ajpbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ajp.this,ajp_book.class);
                startActivity(intent);
            }
        });

        cv_ajpquestion_banks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ajp.this,ajp_questionbank.class);
                startActivity(intent);
            }
        });

        cv_solved_mannual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ajp.this,ajp_solvedmannual.class);
                startActivity(intent);
            }
        });


        cv_lab_mannual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/12NoAgo0Qdr4FocQ4VHOeCswFtdNy-5uW/view?usp=sharing") ;
            }
        });

        cv_previous_year_questionpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ajp.this,ajp_previousyearquestion_papers.class);
                startActivity(intent);
            }
        });

        cv_modelanswer_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ajp.this,ajp_modelanswer_papers.class);
                startActivity(intent);
            }
        });

        cv_ajpnotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1n48nH-E90UQ1Lw7jdP8vtRZMI7pKbHIs?usp=sharing") ;
            }
        });
        cv_ajpmicroproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://docs.google.com/document/d/17MPa642HxDus3Ntqi-3w8mrObpjN8vU_ndPqHiQ2lgU/edit?usp=sharing") ;
            }
        });


    }
    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }

}