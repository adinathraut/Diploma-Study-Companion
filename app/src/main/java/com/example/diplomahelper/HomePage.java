package com.example.diplomahelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.polyak.iconswitch.IconSwitch;

public class HomePage extends AppCompatActivity {

    boolean doubletap=false;

    CardView cv_homepage_semesterone;
    CardView cv_homepage_semestertwo;
    CardView cv_homepage_semesterthree;
    CardView cv_homepage_semesterfour;
    CardView cv_homepage_semesterfive;
    CardView cv_homepage_semestersix;
    CardView cv_msbtewebsite;
    CardView cv_msbteresult;

    private IconSwitch iconSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setIcon(R.mipmap.msbte_icon_round);
       // actionBar.setIcon(R.mipmap.msbtelogoremovedbackground);



        actionBar.setTitle("Diploma Helper");

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        setContentView(R.layout.activity_home_page);

        cv_homepage_semesterone=findViewById(R.id.cv_home_semester_one);
        cv_homepage_semestertwo=findViewById(R.id.cv_home_semester_two);
        cv_homepage_semesterthree=findViewById(R.id.cv_home_semester_three);
        cv_homepage_semesterfour=findViewById(R.id.cv_home_semester_four);
        cv_homepage_semesterfive=findViewById(R.id.cv_home_semester_five);
        cv_homepage_semestersix =findViewById(R.id.cv_home_semester_six);
        cv_msbtewebsite=findViewById(R.id.cv_msbte_website);
        cv_msbteresult=findViewById(R.id.cv_msbte_resulte);




        iconSwitch = (IconSwitch) findViewById(R.id.iconSwitch);

        // IconSwitch  Checked Change Listener
        iconSwitch.setCheckedChangeListener(new IconSwitch.CheckedChangeListener() {@Override
        public void onCheckChanged(IconSwitch.Checked current) {
            //simple witch case
            switch (current) {

                case LEFT:
                    //showing simple toast message to the user
                    Toast.makeText(HomePage.this, "Light Mode", Toast.LENGTH_SHORT).show();
                    setTheme(R.style.Theme_DiplomaHelper);
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    break;

                case RIGHT:
                    //showing simple toast message to the user
                    Toast.makeText(HomePage.this, "Dark Mode", Toast.LENGTH_SHORT).show();
                    setTheme(R.style.Theme_Dark);
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    break;
            }
        }
        });






        cv_homepage_semesterone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,Semester_1.class);
                startActivity(intent);
            }
        });

        cv_homepage_semestertwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,Semester_2.class);
                startActivity(intent);
            }
        });

        cv_homepage_semesterthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,Semester_3.class);
                startActivity(intent);
            }
        });

        cv_homepage_semesterfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,Semester_4.class);
                startActivity(intent);
            }
        });

        cv_homepage_semesterfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,Semester_5.class);
                startActivity(intent);
            }
        });

        cv_homepage_semestersix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,Semester_6.class);
                startActivity(intent);
            }
        });

        cv_msbtewebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,MSBTE_official_website.class);
                startActivity(intent);
            }
        });
        cv_msbteresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://msbte.org.in/DISRESLIVE2021CRSLDSEP/frmALYSUM21PBDisplay.aspx") ;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();//call the menu and get it.
        inflater.inflate(R.menu.menu_homepage,menu);
        //menu create on java class.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_home_myprofile:
                Intent i5=new Intent(HomePage.this,menu_homepage_myprofile.class);
                startActivity(i5);

                return true;
            case R.id.menu_home_notification:
                Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_home_contribute:
                Toast.makeText(this, "Contributes", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HomePage.this,menu_homepage_contribute.class);
                startActivity(intent);
                return true;
            case R.id.menu_home_contact_us:
                Toast.makeText(this, "Contact US", Toast.LENGTH_SHORT).show();
                Intent intent2=new Intent(HomePage.this,menu_homepage_contactus.class);
                startActivity(intent2);
                return true;

            case R.id.menu_home_developer_contacts:
                Toast.makeText(this, "Developers Contacts", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_home_share_app:
                Toast.makeText(this, "Share App", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_home_msbte_contacts:
                Toast.makeText(this, "MSBTE Contacts", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(HomePage.this,menu_homepage_msbtecontacts.class);
                startActivity(i);
                return true;
            case R.id.menu_home_feedback:
                Toast.makeText(this, "FeedBack", Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(HomePage.this,menu_homepage_feedback.class);
                startActivity(intent1);
                return true;
            case R.id.menu_home_logout:
                //logout();
                FirebaseAuth.getInstance().signOut();
                //Intent intent3 = new Intent(HomePage.this, LoginPage.class);
                startActivity(new Intent(HomePage.this,LoginPage.class));
                finish();
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    /*
    private void logout(){

        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setTitle("Logout");
        ad.setMessage("Are you sure to logout?");
        ad.setPositiveButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();

            }
        });
        ad.setNegativeButton("Logout", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(HomePage.this, LoginPage.class);
                startActivity(intent);
               finish();
            }

        }).create().show();
    }*/

    @Override
    public void onBackPressed() {
        if(doubletap)
        {
            super.onBackPressed();
        }//this method is used to exit the application.
        else
        {
            Toast.makeText(this, "Please press again to exit the app", Toast.LENGTH_SHORT).show();
            doubletap=true;
            Handler handler=new Handler();//used to handle if user clicked once then .
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubletap=false;
                }
            },2000);
        }

    }
    private void gotoUrl( String s) {
        Uri u = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,u));
    }
}