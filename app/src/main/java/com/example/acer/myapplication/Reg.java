package com.example.acer.myapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class Reg extends AppCompatActivity {

    EditText user,pass,name;
    Button reg;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        mAuth = FirebaseAuth.getInstance();

        name = (EditText) findViewById(R.id.username);
        user = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.password);

        Button reg = (Button) findViewById(R.id.reg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regisUser();
            }
        });

    }
    private  void regisUser(){
        String names = name.getText().toString().trim();
        String email = user.getText().toString().trim();
        String passw = pass.getText().toString().trim();
        boolean valid = true;

        if (names.isEmpty() || names.length() < 5) {
            name.setError("at least 3 characters");
            valid = false;
        } else {
            name.setError(null);
        }

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

        if(passw.length()<4){
            pass.setError("รหัสผ่านต้องมากกว่าหรือเท่ากับ 4 ตัวเลข ");
            pass.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email,passw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){

                    Intent i = new Intent(Reg.this,login.class);
                    startActivity(i);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    final ProgressDialog progressDialog = new ProgressDialog(Reg.this,
                            R.style.Theme_AppCompat_DayNight_Dialog);
                    progressDialog.setIndeterminate(true);
                    progressDialog.setMessage("สร้างบัญชีผู้ใช้");
                    progressDialog.show();
                    Toast.makeText(getApplicationContext(),"บันทึก",Toast.LENGTH_SHORT).show();


                }else{
                    if(task.getException() instanceof FirebaseAuthUserCollisionException){
                        Toast.makeText(getApplicationContext(),"คุณทำการสมัครไปแล้ว",Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


}
