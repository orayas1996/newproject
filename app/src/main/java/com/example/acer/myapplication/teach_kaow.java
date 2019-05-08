package com.example.acer.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class teach_kaow extends AppCompatActivity {


    Button b1, b2, b3;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_kaow);


        final Button b1 = (Button) findViewById(R.id.but1);
        final Button b2 = (Button) findViewById(R.id.but2);
        final Button b3 = (Button) findViewById(R.id.but3);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        final MediaPlayer w = MediaPlayer.create(this, R.raw.w_1);
        final MediaPlayer w1 = MediaPlayer.create(this, R.raw.w_2);
        final MediaPlayer w2 = MediaPlayer.create(this, R.raw.w_3);


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(teach_kaow.this,menu.class);
                startActivity(i);
            }
        });


                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        w.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        w1.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        w2.start();

                    }
                });


    }
}
