package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class osy_book extends AppCompatActivity {

    CardView cv_book_osy_technical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osy_book);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" OSY Books ");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);


        cv_book_osy_technical=findViewById(R.id.cv_books_osytechnical);

        cv_book_osy_technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/10J3hrYI8RwI8jHTMub3EKjZd5g3hV95Y/view?usp=sharing") ;
            }
        });

    }

    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }


}