package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class est extends AppCompatActivity {


    CardView cv_estbook;
    CardView cv_estnotes;
    CardView cv_lab_mannual;
    CardView cv_solved_mannual;
    CardView cv_estquestion_banks;
    CardView cv_modelanswer_paper;
    CardView cv_estmicroproject;
    CardView cv_previous_year_questionpapers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_est);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" Envirnomental Studies");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);

        cv_estbook=findViewById(R.id.cv_books);
        cv_estquestion_banks=findViewById(R.id.cv_questionbanks);
        cv_estnotes=findViewById(R.id.cv_notes);
        cv_lab_mannual=findViewById(R.id.cv_labmannuals);
        cv_solved_mannual=findViewById(R.id.cv_solvedlabmannual);
        cv_modelanswer_paper=findViewById(R.id.cv_modelanswerpaper);
        cv_previous_year_questionpapers=findViewById(R.id.cv_previousyearquestionpapers);
        cv_estmicroproject=findViewById(R.id.cv_microproject);


        cv_estbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(est.this,est_book.class);
                startActivity(intent);
            }
        });
        cv_estquestion_banks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1eBjd0tGEJmSKDmUNaoTXrbk8jPdm4SsO?usp=sharing");
            }
        });

        cv_solved_mannual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(est.this, "This Subject Has No LAB MANNUAL !", Toast.LENGTH_LONG).show();

            }
        });


        cv_lab_mannual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(est.this, "This Subject Has No LAB MANNUAL !", Toast.LENGTH_LONG).show();
            }
        });

        cv_previous_year_questionpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(est.this, "Envirnomental Studies Paper is Conducted Online by MSBTE , For Referance Check Question Bank Section.", Toast.LENGTH_LONG).show();
            }
        });

        cv_modelanswer_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(est.this, "Envirnomental Studies Paper is Conducted Online by MSBTE , For Referance Check Question Bank Section.", Toast.LENGTH_LONG).show();

            }
        });

        cv_estnotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1ghTvred2a3fQXBmYs3Xw4LaiuFa6cR1G?usp=sharing") ;
            }
        });


        
        cv_estmicroproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1Dks4eTVJf6yRep07hzPuO3cnvwwtMzfp?usp=sharing") ;
            }
        });

    }
    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}