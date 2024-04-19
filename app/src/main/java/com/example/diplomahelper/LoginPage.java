package com.example.diplomahelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;
import java.util.jar.Attributes;
import java.util.regex.Pattern;

public class LoginPage extends AppCompatActivity {
    TextView newuser;
    TextView welcomeback, nicetoseeyouagain, forgotpassword;
    TextInputEditText enteremail, enterpassword;
    Button login;
    FirebaseAuth auth;
    String pass;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        newuser = findViewById(R.id.newuser);
        login = findViewById(R.id.login);
        welcomeback = findViewById(R.id.welcomeback);
        nicetoseeyouagain = findViewById(R.id.nicetoseeyouagain);
        enteremail = findViewById(R.id.login_enteremail);
        enterpassword = findViewById(R.id.login_enterpassword);
        forgotpassword = findViewById(R.id.forgotpassword);

        pass = enterpassword.getText().toString();

        //store logged in status
        sp = getSharedPreferences("login", MODE_PRIVATE);
        if (sp.getBoolean("logged", false)) {
            goToMainActivity();
        }

        Intent intent = getIntent();
        String name_user = intent.getStringExtra("abc");

        auth = FirebaseAuth.getInstance();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();


        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email3 = enteremail.getText().toString().trim();


                String email1 = enteremail.getText().toString();
                String password1 = enterpassword.getText().toString();
                if (TextUtils.isEmpty(email1)) {
                    Toast.makeText(LoginPage.this, "Please Enter Your Email", Toast.LENGTH_LONG).show();
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email1).matches()) {
                    Toast.makeText(LoginPage.this, "Invalid Email", Toast.LENGTH_LONG).show();
                } else {


                    auth.sendPasswordResetEmail(email3).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(LoginPage.this, "Password reset link has been sent on your Email ID , Please check your Email", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(LoginPage.this, "Something went wrong !", Toast.LENGTH_LONG).show();
                            }
                        }
                    });

                    Toast.makeText(LoginPage.this, "Password Reset Link Has Been Sent to Your Email ID , Please check MAilBox", Toast.LENGTH_LONG).show();
                }
            }
        });


        newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginPage.this, RegistrationPage.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email1 = enteremail.getText().toString();
                String password1 = enterpassword.getText().toString();
                if (TextUtils.isEmpty(email1) || TextUtils.isEmpty(password1)) {
                    Toast.makeText(LoginPage.this, "Please Enter Your Details", Toast.LENGTH_LONG).show();
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email1).matches()) {
                    Toast.makeText(LoginPage.this, "Invalid Email", Toast.LENGTH_LONG).show();
                } else if (password1.length() < 6) {
                    Toast.makeText(LoginPage.this, "Password must greater than 6", Toast.LENGTH_LONG).show();
                } else if (password1.contains(" ")) {
                    Toast.makeText(LoginPage.this, "Spaces not allowed!", Toast.LENGTH_SHORT).show();
                } else {

                    auth.signInWithEmailAndPassword(email1, password1).addOnSuccessListener(LoginPage.this, new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {

                            Toast.makeText(LoginPage.this, "Welcome " + name_user, Toast.LENGTH_LONG).show();
                            goToMainActivity();

                            sp.edit().putBoolean("logged", true).apply();
                        }
                    });

                    auth.signInWithEmailAndPassword(email1, password1).addOnFailureListener(LoginPage.this, new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(LoginPage.this, "Couldn't find an account with the email you entered. Please Sign up", Toast.LENGTH_LONG).show();
                        }
                    });

                }

            }
        });


    }

    public void goToMainActivity() {
        Intent i = new Intent(LoginPage.this, HomePage.class);
        startActivity(i);
    }

}