package com.example.acer.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class User extends AppCompatActivity {

    EditText edname,older;
    Button save;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);

        edname = (EditText) findViewById(R.id.name);
        older = (EditText) findViewById(R.id.old);
        save = (Button) findViewById(R.id.button2);
        mAuth = FirebaseAuth.getInstance();

        loadUserinfo();

//        save.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                saveinformation();
//                Intent i = new Intent(User.this,menu.class);
//                startActivity(i);
//            }
//        });

        }
    @Override
    protected void onStart() {
        super.onStart();
        if(mAuth.getCurrentUser() == null){
            finish();
            startActivity(new Intent(this,login.class));
        }
    }

        private void loadUserinfo(){
            FirebaseUser user = mAuth.getCurrentUser();
            if(user != null){
                if(user.getDisplayName() != null){
                    edname.setText(user.getDisplayName());
                    older.setText(user.getPhoneNumber());
                }

            }


        }
//        private void saveinformation(){
//            String ed_name = edname.getText().toString();
//            String old = older.getText().toString();
//
//            if(ed_name.isEmpty()){
//                edname.setError("กรุณากรอกชื่อ");
//                edname.requestFocus();
//                return;
//            }
//
//            if(old.isEmpty()){
//                older.setError("กรุณากรอกอายุ");
//                older.requestFocus();
//                return;
//            }
//
//            FirebaseUser user = mAuth.getCurrentUser();
//
//            if(user != null){
//                UserProfileChangeRequest profile = new UserProfileChangeRequest.Builder()
//                        .setDisplayName(ed_name)
//                        .build();
//                user.updateProfile(profile)
//                        .addOnCompleteListener(new OnCompleteListener<Void>() {
//                            @Override
//                            public void onComplete(@NonNull Task<Void> task) {
//                                if(task.isSuccessful()){
//                                    Toast.makeText(User.this,"บันทึกสำเร็จ",Toast.LENGTH_SHORT).show();
//                                }
//                            }
//                        });
//
//
//            }

//        }


}
