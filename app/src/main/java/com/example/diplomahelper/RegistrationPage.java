package com.example.diplomahelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Objects;

public class RegistrationPage extends AppCompatActivity {
    TextView alreadyuser;
    Button signup;
    TextView createaccount;
    EditText enteremail,enterpassword,name;
    AutoCompleteTextView enterbranch;
    String[] branch={"Computer Engineering"};
    ArrayAdapter<String> adapteritems;

    FirebaseAuth auth;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        createaccount=findViewById(R.id.createaccount);
        enteremail=findViewById(R.id.enteremail);
        enterpassword=findViewById(R.id.enterpassword);
        name=findViewById(R.id.entername);
        signup=findViewById(R.id.signup);
        alreadyuser=findViewById(R.id.alreadyuser);

        enterbranch=findViewById(R.id.enterbranch);
        adapteritems=new ArrayAdapter<String>(this,R.layout.list_item,branch);
        enterbranch.setAdapter(adapteritems);
        enterbranch.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            }
        });

        auth = FirebaseAuth.getInstance();


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();


        alreadyuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(RegistrationPage.this,LoginPage.class);
                startActivity(intent);
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Email=enteremail.getText().toString();
                String Password=enterpassword.getText().toString();
                String Name=name.getText().toString();
                String Branch=enterbranch.getText().toString();

                if(name.getText().toString().isEmpty())
                {
                    name.setError("Please enter your name");
                }
                else if (name.getText().toString().length()<3)
                {
                    name.setError("Invalid Name");
                }

                else if (TextUtils.isEmpty(Email)||TextUtils.isEmpty(Password)||TextUtils.isEmpty(Name)){
                    Toast.makeText(RegistrationPage.this, "Please Enter Your All Details", Toast.LENGTH_LONG).show();
                }
                else if (!Patterns.EMAIL_ADDRESS.matcher(Email).matches()){
                    Toast.makeText(RegistrationPage.this, "Invalid Email", Toast.LENGTH_LONG).show();
                }
                else if (Password.length()<6){
                    Toast.makeText(RegistrationPage.this, "Password must greater than 6", Toast.LENGTH_LONG).show();
                }
                else if (Password.contains(" "))
                {
                    Toast.makeText(RegistrationPage.this, "Spaces not allowed!", Toast.LENGTH_SHORT).show();
                }
                else if (enterbranch.getText().toString().isEmpty())
                {
                    enterbranch.setError("Please enter your branch");
                }
                else
                {
                    auth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(RegistrationPage.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(RegistrationPage.this, "Successfully registered", Toast.LENGTH_LONG).show();
                                Intent intent= new Intent(RegistrationPage.this,LoginPage.class);

                                intent.putExtra("abc",name.getText().toString());
                                startActivity(intent);

                            }
                            else{

                                Toast.makeText(RegistrationPage.this, "Error Occured", Toast.LENGTH_LONG).show();
                            }

                        }
                    });

/*
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("Name",name.getText().toString());
                    FirebaseDatabase.getInstance().getReference().child("Name")
                            .push()
                            .setValue(map);

                    HashMap<String, Object> map1 = new HashMap<>();
                    map1.put("Email",enteremail.getText().toString());
                    FirebaseDatabase.getInstance().getReference().child("Email")
                            .push()
                            .setValue(map1);

                    HashMap<String, Object> map2 = new HashMap<>();
                    map2.put("Branch",enterbranch.getText().toString());
                    FirebaseDatabase.getInstance().getReference().child("Branch")
                            .push()
                           .setValue(map2);

*/

                    rootNode=FirebaseDatabase.getInstance();
                    reference=rootNode.getReference("Users");
                    UserHelperClass helperClass = new UserHelperClass(Name,Email,Password,Branch);
                    reference.child(Name).setValue(helperClass);

                }
            }

        });

    }
}