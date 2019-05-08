package com.example.acer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Score.this, Data.class);
//                    Intent in = new Intent(match_t.this,Data.class);
                i.putExtra("time3",total_time);
                Intent in = new Intent(Score.this,menu.class);
                startActivity(in);
            }
        });


    }
}
