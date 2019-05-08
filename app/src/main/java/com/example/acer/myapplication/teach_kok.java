package com.example.acer.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class teach_kok extends AppCompatActivity {

    TextView title, bb, tx1, tx2, tx3;
    Button iv11, iv12, iv13, iv14,b1, b2, b3;
    ImageView view1, view2, view3,img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_kok);

        final ImageView view1 = (ImageView) findViewById(R.id.imageView1);
        final ImageView view2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView view3 = (ImageView) findViewById(R.id.imageView3);
        final ImageView img = (ImageView) findViewById(R.id.imageView);

        final TextView bb = (TextView) findViewById(R.id.bb);
        final TextView tx1 = (TextView) findViewById(R.id.text1);
        final TextView tx2 = (TextView) findViewById(R.id.text2);
        final TextView tx3 = (TextView) findViewById(R.id.text3);
        Button iv11 = (Button) findViewById(R.id.iv11);
        Button iv12 = (Button) findViewById(R.id.iv12);
        Button iv13 = (Button) findViewById(R.id.iv13);
        Button iv14 = (Button) findViewById(R.id.iv14);
        final Button b1 = (Button) findViewById(R.id.but1);
        final Button b2 = (Button) findViewById(R.id.but2);
        final Button b3 = (Button) findViewById(R.id.but3);

        final MediaPlayer k = MediaPlayer.create(this, R.raw.k_1);
        final MediaPlayer k2 = MediaPlayer.create(this, R.raw.kk_1);
        final MediaPlayer k3 = MediaPlayer.create(this, R.raw.kkk_1);
        final MediaPlayer kor = MediaPlayer.create(this, R.raw.k_2);
        final MediaPlayer kor2 = MediaPlayer.create(this, R.raw.kk_2);
        final MediaPlayer kor3 = MediaPlayer.create(this, R.raw.kkk_2);
        final MediaPlayer ko = MediaPlayer.create(this, R.raw.k_3);
        final MediaPlayer ko2 = MediaPlayer.create(this, R.raw.kk_3);
        final MediaPlayer ko3 = MediaPlayer.create(this, R.raw.kkk_3);
        final MediaPlayer kang = MediaPlayer.create(this, R.raw.k_4);

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ก.ไก่");
                view1.setImageResource(R.drawable.k_1);
                view2.setImageResource(R.drawable.kk_1);
                view3.setImageResource(R.drawable.kkk_1);
                tx1.setText("(ปาก - กา)");
                tx2.setText("(กระ - รอก)");
                tx3.setText("(นก)");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        k.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        k2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        k3.start();
                    }
                });
            }
        });
        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ข.ไข่");
                view1.setImageResource(R.drawable.k2);
                view2.setImageResource(R.drawable.k_2);
                view3.setImageResource(R.drawable.kk_2);
                tx1.setText("(สุ - นัก)");
                tx2.setText("(ตัว - เลก)");
                tx3.setText("(ความ - สุข)");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        kor.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        kor2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        kor3.start();
                    }
                });
            }
        });
        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ค.ควาย");
                view1.setImageResource(R.drawable.kkk_3);
                view2.setImageResource(R.drawable.k_3);
                view3.setImageResource(R.drawable.kk_3);
                tx1.setText("(วิ - หก)");
                tx2.setText("(วัก - ซีน)");
                tx3.setText("(เชื้อ - โรก)");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ko.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ko2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ko3.start();
                    }
                });
            }
        });
        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ฆ.ระฆัง");
                view1.setImageResource(R.drawable.bb);
                view2.setImageResource(R.drawable.k_4);
                view3.setImageResource(R.drawable.bb);
                tx1.setText("");
                tx2.setText("(ก้อน - เมก)");
                tx3.setText("");
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        kang.start();
                    }
                });

            }
        });
    }
}
