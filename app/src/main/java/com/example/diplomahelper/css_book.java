package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class css_book extends AppCompatActivity {

    CardView cv_book_css_technical;
    CardView cv_book_css_nirali;
    
    @Override
    protected void onCreate(Bundle savedInstanccssate) {
        super.onCreate(savedInstanccssate);
        setContentView(R.layout.activity_css_book);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" CSS Books");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);


        cv_book_css_technical=findViewById(R.id.cv_books_csstechnical);
        cv_book_css_nirali=findViewById(R.id.cv_books_cssnirali);


        cv_book_css_technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1KUopuP_syJZdEs1HLFzC8Iu8tHhya1wA/view?usp=sharing") ;
            }
        });
        cv_book_css_nirali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/17JkkivUvZzgtkGHGzba3DC0Byti1c0SN/view?usp=sharing") ;
            }
        });
    }
    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}