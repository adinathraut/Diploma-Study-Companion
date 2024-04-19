package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class menu_homepage_contactus extends AppCompatActivity {
    TextView instagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_homepage_contactus);


        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" Contact Us ");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);

        instagram=findViewById(R.id.tv_diploma_helper);

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://instagram.com/diploma_helper?utm_medium=copy_link") ;

            }
        });


    }

    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}