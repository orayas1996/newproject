package com.example.acer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

public class teacher extends AppCompatActivity {

    TextView tv_email;

    FirebaseAuth mAuth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        tv_email = (TextView) findViewById(R.id.tvemail);
        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();

        tv_email.setText(user.getEmail());

    }
}
