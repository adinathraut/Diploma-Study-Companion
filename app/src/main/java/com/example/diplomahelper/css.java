package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class css extends AppCompatActivity {

    CardView cv_cssbook;
    CardView cv_cssnotes;
    CardView cv_lab_mannual;
    CardView cv_solved_mannual;
    CardView cv_cssquestion_banks;
    CardView cv_modelanswer_paper;
    CardView cv_cssmicroproject;
    CardView cv_previous_year_questionpapers;


    @Override
    protected void onCreate(Bundle savedInstanccssate) {
        super.onCreate(savedInstanccssate);
        setContentView(R.layout.activity_css);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle("Client Side Scripting Language (CSS)");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);

        cv_cssbook=findViewById(R.id.cv_books);
        cv_cssquestion_banks=findViewById(R.id.cv_questionbanks);
        cv_cssnotes=findViewById(R.id.cv_notes);
        cv_lab_mannual=findViewById(R.id.cv_labmannuals);
        cv_solved_mannual=findViewById(R.id.cv_solvedlabmannual);
        cv_modelanswer_paper=findViewById(R.id.cv_modelanswerpaper);
        cv_previous_year_questionpapers=findViewById(R.id.cv_previousyearquestionpapers);
        cv_cssmicroproject=findViewById(R.id.cv_microproject);


        cv_cssbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(css.this,css_book.class);
                startActivity(intent);
            }
        });
        cv_cssquestion_banks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1peQuBXODy-b6ZyKS2oqh2ul5BNORgat0?usp=sharing");
            }
        });

        cv_solved_mannual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1Fvukxdf9sWqZEqcL9W9FAu3X0YRD-mIZ/view?usp=sharing");

            }
        });


        cv_lab_mannual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(css.this, "We don't have this Mannual , If you have it then please Contribute us ", Toast.LENGTH_LONG).show();
            }
        });

        cv_previous_year_questionpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1Ffpvst2ZnsINtPsbN91vpbEAYoVlC9OC?usp=sharing");
            }
        });

        cv_modelanswer_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1FZj1GhYXpnQkGpusRcANXFqzHrGZaVYz?usp=sharing");
            }
        });

        cv_cssnotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1tvS6iJMpyoqZ7MS5VGDuSaukdPltEJa8?usp=sharing") ;
            }
        });



        cv_cssmicroproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1TX4XynzYAVDOIsibhmBCn5jpmSxp9A99?usp=sharing") ;
            }
        });

    }
    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}