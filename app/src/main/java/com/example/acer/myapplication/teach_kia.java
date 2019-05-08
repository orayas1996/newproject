package com.example.acer.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class teach_kia extends AppCompatActivity {

    Button b1, b2, b3;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_kia);


        final Button b1 = (Button) findViewById(R.id.but1);
        final Button b2 = (Button) findViewById(R.id.but2);
        final Button b3 = (Button) findViewById(R.id.but3);
        ImageView img = (ImageView) findViewById(R.id.imageView);

        final MediaPlayer y = MediaPlayer.create(this, R.raw.y_1);
        final MediaPlayer y2 = MediaPlayer.create(this, R.raw.y_2);
        final MediaPlayer y3 = MediaPlayer.create(this, R.raw.y_3);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(teach_kia.this,menu.class);
            }
        });



                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        y.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        y2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        y3.start();
                    }
                });


    }
}
