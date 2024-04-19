package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ajp_book extends AppCompatActivity {

    CardView cv_book_ajp_technical;
    CardView cv_book_ajp_nirali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajp_book);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" AJP Books");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);

        cv_book_ajp_technical=findViewById(R.id.cv_books_ajptechnical);
        cv_book_ajp_nirali=findViewById(R.id.cv_books_ajpnirali);

        cv_book_ajp_technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1GMGC70gKEBgj4cz66RJmv4KS4IT9vhqj/view?usp=sharing") ;
            }
        });
        cv_book_ajp_nirali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1y1B8KiKLbwApoYivcfnm22kQUkf6FYQD/view?usp=sharing") ;
            }
        });



    }

    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }

}