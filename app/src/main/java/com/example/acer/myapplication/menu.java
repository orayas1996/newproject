package com.example.acer.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class menu extends AppCompatActivity {

    private Button but,login,singout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        but = (Button) findViewById(R.id.button);
        Button teach = (Button) findViewById(R.id.teach);
        singout = (Button) findViewById(R.id.signout);



        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu.this,match_one.class);
                startActivity(i);
            }
        });

                teach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu.this,teacher.class);
                startActivity(i);
            }
        });
           singout.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   FirebaseAuth.getInstance().signOut();
                   finish();
                   Intent i = new Intent(menu.this,login.class);
                   startActivity(i);
               }
           });


    }
}
