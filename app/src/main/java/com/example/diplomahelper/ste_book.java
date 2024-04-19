package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ste_book extends AppCompatActivity {

    CardView cv_book_ste_technical;
    CardView cv_book_ste_nirali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ste_book);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" STE Books");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);

        cv_book_ste_technical=findViewById(R.id.cv_books_stetechnical);
        cv_book_ste_nirali=findViewById(R.id.cv_books_stenirali);

        cv_book_ste_technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/174Fn-X8ZdthIQM_IItPGdv6ewyITgphT/view?usp=sharing") ;
            }
        });
        cv_book_ste_nirali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/18JLRJ_Ob-SaV3DqsJN5c9akBPZp1yixV/view?usp=sharing") ;
            }
        });

    }

    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}