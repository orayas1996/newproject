package com.example.acer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Score extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    TextView time;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TextView time = (TextView) findViewById(R.id.ttime);
        Button back = (Button) findViewById(R.id.back);

        long t3 = getIntent().getExtras().getLong("time3");
        final long total_time = t3;
        Log.d("aaa","time " + total_time);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //add time on db
        String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();


        DatabaseReference myRef = database.getReference("Users").child(userId).child("score1");
        myRef.push().setValue(total_time);



    }
}
