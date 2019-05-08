package com.example.acer.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class teach_kong extends AppCompatActivity {

    Button b1, b2, b3;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_kong);

        final ImageView img = (ImageView) findViewById(R.id.imageView);

        final Button b1 = (Button) findViewById(R.id.but1);
        final Button b2 = (Button) findViewById(R.id.but2);
        final Button b3 = (Button) findViewById(R.id.but3);

        final MediaPlayer ng = MediaPlayer.create(this, R.raw.ng_1);
        final MediaPlayer ng2 = MediaPlayer.create(this, R.raw.ng_2);
        final MediaPlayer ng3 = MediaPlayer.create(this, R.raw.ng_3);


                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ng.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ng2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ng3.start();
                    }
                });


    }
}
