package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class osy_questionbank extends AppCompatActivity {

    CardView cv_osyquestion_banks_1;
    CardView cv_osyquestion_banks_2;
    CardView cv_osycomplete_question_answer;
    CardView cv_osyimportant_boardquestion_with_answer;
    CardView cv_osyimportant_boardquestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osy_questionbank);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" OSY Question Banks ");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);

        cv_osyquestion_banks_1=findViewById(R.id.cv_questionbank1);
        cv_osyquestion_banks_2=findViewById(R.id.cv_questionbank2);
        cv_osycomplete_question_answer=findViewById(R.id.cv_osycompletequestionanswer);
        cv_osyimportant_boardquestion=findViewById(R.id.cv_osyimportantboardquestion);
        cv_osyimportant_boardquestion_with_answer=findViewById(R.id.cv_osyimportantboardquestionwithanswer);

        cv_osyquestion_banks_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/14PSaXKIsy2sZ3fqzN76JAVrJR-etG5mu/view?usp=sharing") ;
            }
        });

        cv_osyquestion_banks_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/14RQLRU_xKLp3svkkC7zRIXCjQDr6gDZ6/view?usp=sharing") ;
            }
        });
        cv_osycomplete_question_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/15LWJLcwXyUNMagGUVt6QYB72jdvuB1ij/view?usp=sharing") ;
            }
        });

        cv_osyimportant_boardquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1EUMEQ88484B2sv8dt4DyIQDtY_Ep32NX/view?usp=sharing") ;
            }
        });
        cv_osyimportant_boardquestion_with_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/15uqpIi_Fh49Dq99R5KAuSXgf7A4r8rEM/view?usp=sharing") ;
            }
        });
    }
    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}