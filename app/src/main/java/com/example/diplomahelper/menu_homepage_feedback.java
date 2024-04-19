package com.example.diplomahelper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class menu_homepage_feedback extends AppCompatActivity {

    EditText yourfeedback,your_email;
    Button sendfeedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_homepage_feedback);


        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle(" FeedBack");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_back_purple);

        yourfeedback=findViewById(R.id.feedback);
        your_email=findViewById(R.id.youremail);
        sendfeedback=findViewById(R.id.send);


        //storing feedback into firebase realtime database.
        sendfeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (your_email.getText().toString().isEmpty()||yourfeedback.getText().toString().isEmpty()){
                    Toast.makeText(menu_homepage_feedback.this, "Please Enter Your Feedback And Email", Toast.LENGTH_LONG).show();
                }
                else {

                    HashMap<String, Object> map = new HashMap<>();
                    map.put("Email", your_email.getText().toString());
                    map.put("Feedback", yourfeedback.getText().toString());


                    FirebaseDatabase.getInstance().getReference().child("FeedBack")
                            .push()
                            .setValue(map);

                    Toast.makeText(menu_homepage_feedback.this, "FeedBack Sent , Thank You 🙏", Toast.LENGTH_LONG).show();
                    yourfeedback.getText().clear();
                    your_email.getText().clear();

                }

            }
        });
    }
}