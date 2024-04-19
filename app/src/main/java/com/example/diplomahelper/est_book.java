package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class est_book extends AppCompatActivity {

    CardView cv_book_est_technical;
    CardView cv_book_est_nirali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_est_book);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" EST Books");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);


        cv_book_est_technical=findViewById(R.id.cv_books_esttechnical);
        cv_book_est_nirali=findViewById(R.id.cv_books_estnirali);


        cv_book_est_technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/17Enkp_FvTYxrjE4ut6grMtl6ZRh9Zh6C/view?usp=sharing") ;
            }
        });
        cv_book_est_nirali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/17IHTZC-eMiQO36BKok6kzleXdvVAmGQH/view?usp=sharing") ;
            }
        });

    }
    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}