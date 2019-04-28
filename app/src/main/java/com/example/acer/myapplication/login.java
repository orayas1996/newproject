package com.example.acer.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class login extends AppCompatActivity {

    FirebaseAuth mAuth;
    EditText user,pass;
    TextView butsignup;
    Button login,teach;
//    private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        final Button login = (Button) findViewById(R.id.loginn);
        Button teach = (Button) findViewById(R.id.teach);
        TextView butsignup = (TextView) findViewById(R.id.signup);
        user = (EditText) findViewById(R.id.Username);
        pass = (EditText) findViewById(R.id.password);
//        mDatabase = FirebaseDatabase.getInstance().getReference();

        butsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent i = new Intent(login.this,Reg.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Userlogin();
            }
        });

        teach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(login.this,teacher.class);
                startActivity(i);
            }
        });



    }

//    private  void Writeuser(String Userid, String username, String pass){
//        User user = new User(username,pass);
//
//        mDatabase.child("users").child(Userid).setValue(user);
//        mDatabase.child("users").child(Userid).child("username").setValue(username);
//        mDatabase.child("users").child(Userid).child("password").setValue(pass);
//
//
//    }
    private void Userlogin(){

        String email = user.getText().toString().trim();
        String passw = pass.getText().toString().trim();

        if(email.isEmpty()){
            user.setError("กรุณาใส่อีเมลล์");
            user.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            user.setError("กรุณาใส่อีเมลล์ที่ถูกต้อง");
            user.requestFocus();
            return;
        }

        if(passw.isEmpty()){
            pass.setError("กรุณาใส่รหัสผ่าน");
            pass.requestFocus();
            return;
        }

        if(passw.length()<6){
            pass.setError("รหัสต้องมากกว่า 6 ");
            pass.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(email,passw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){

                    Intent i = new Intent(login.this,menu.class);
                    startActivity(i);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                }else{
                    Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        if(mAuth.getCurrentUser() == null){
//            startActivity(new Intent(this,User.class));
//        }
//    }
}
