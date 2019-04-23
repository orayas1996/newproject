package com.example.acer.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Data extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);


        long t3 = getIntent().getExtras().getLong("time3");
        long total_time = t3;
        Toast.makeText(Data.this, " seconds: " + total_time,
                Toast.LENGTH_SHORT).show();
        Log.d("ddd","ttime "+ total_time);
        String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
        DatabaseReference myRef = database.getReference(userId).child("score1");
        myRef.push().setValue(total_time);


    }

}
