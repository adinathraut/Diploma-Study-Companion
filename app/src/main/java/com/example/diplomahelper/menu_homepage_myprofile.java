package com.example.diplomahelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class menu_homepage_myprofile extends AppCompatActivity {

    EditText myprofileemail,myprofilemo,myprofilecollege,myprofileaddress;
    TextView myprofilename;
    Button myprofile_save;
    AutoCompleteTextView branch;

    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    public  menu_homepage_myprofile(){
        //Required empty constructor
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_homepage_myprofile);

        firebaseAuth = FirebaseAuth.getInstance();

        //getting current user data

        firebaseUser = firebaseAuth.getCurrentUser();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Users");


        myprofileemail=findViewById(R.id.myprofile_email);
        myprofilename=findViewById(R.id.myprofile_name);
        branch=findViewById(R.id.myprofile_branch);
        myprofile_save=findViewById(R.id.myprofile_save);
        myprofilemo=findViewById(R.id.myprofile_mo);
        myprofilecollege=findViewById(R.id.myprofile_college);
        myprofileaddress=findViewById(R.id.myprofile_address);


        Query query = databaseReference.orderByChild("email").equalTo(firebaseUser.getEmail());

        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot snapshot1 : snapshot.getChildren()) {

                    //Retrieving data from firebase

                    String name2 = "" + snapshot1.child("name").getValue();
                    String email2 = "" + snapshot1.child("email").getValue();
                    String branch2 = "" + snapshot1.child("branch").getValue();

                    //setting data to our text view

                    myprofilename.setText(name2);
                    myprofileemail.setText(email2);
                    branch.setText(branch2);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




        myprofile_save.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String text=myprofile_save.getText().toString();
                 if (text.equals("Save"))
                 {

                     if(myprofilemo.getText().toString().isEmpty())
                     {
                         myprofilemo.setError("Please enter mobile no");
                     }
                    else if(myprofilemo.getText().toString().length()!=10)
                     {
                         myprofilemo.setError("Please enter valid mobile no");
                     }
                    else if(myprofilemo.getText().toString().equals("1234567890"))
                     {
                         myprofilemo.setError("Please enter valid mobile no");
                     }
                     else if (myprofilecollege.getText().toString().isEmpty())
                     {
                         myprofilecollege.setError("Please enter your college name");
                     }
                     else if (myprofilecollege.getText().toString().length()<3)
                     {
                         myprofilecollege.setError("Please enter valid college name");
                     }
                     else if(myprofileaddress.getText().toString().isEmpty())
                     {
                         myprofileaddress.setError("Please enter your address");
                     }
                     else if(myprofileaddress.getText().toString().length()<3)
                     {
                         myprofileaddress.setError("Please enter valid address");
                     }
                     else
                     {
                         myprofile_save.setText("Edit");
                         myprofile_save.setBackgroundResource(R.drawable.button_bg_edit);
                         myprofile_save.setTextColor(Color.BLACK);
                         myprofilemo.setEnabled(false);
                         myprofilecollege.setEnabled(false);
                         myprofileaddress.setEnabled(false);
                         Toast.makeText(menu_homepage_myprofile.this, "Successfully updated!", Toast.LENGTH_SHORT).show();
                     }

                 }
                 else
                 {
                     myprofile_save.setText("Save");
                     myprofile_save.setBackgroundResource(R.drawable.button_bg);
                     myprofile_save.setTextColor(Color.WHITE);
                     myprofilemo.setEnabled(true);
                     myprofilecollege.setEnabled(true);
                     myprofileaddress.setEnabled(true);
                 }

             }
         });

    }

}