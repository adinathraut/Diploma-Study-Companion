package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ajp_previousyearquestion_papers extends AppCompatActivity {

    CardView ajp_question_bank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajp_previousyearquestion_papers);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" AJP Previous Year Question Papers");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);


        ajp_question_bank=findViewById(R.id.cv_ajpquestionbank);


        ajp_question_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ajp_previousyearquestion_papers.this,ajp_questionbank.class);
                startActivity(i);
            }
        });


    }
    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}