package com.example.acer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class teach_kok extends AppCompatActivity {

    TextView title, bb, tx1, tx2, tx3;
    Button iv11, iv12, iv13, iv14,b1, b2, b3;
    ImageView view1, view2, view3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_kok);

        final ImageView view1 = (ImageView) findViewById(R.id.imageView1);
        final ImageView view2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView view3 = (ImageView) findViewById(R.id.imageView3);

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

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ก.ไก่");
                view1.setImageResource(R.drawable.k_1);
                view2.setImageResource(R.drawable.kk_1);
                view3.setImageResource(R.drawable.kkk_1);
                tx1.setText("ปาก - กา");
                tx2.setText("กระ - รอก");
                tx3.setText("นก");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

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
                tx1.setText("สุ - นัก");
                tx2.setText("ตัว - เลก");
                tx3.setText("ความ - สุข");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

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
                tx1.setText("วิ - หก");
                tx2.setText("วัก - ซีน");
                tx3.setText("เชื้อ - โรก");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

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
                tx2.setText("ก้อน - เมก");
                tx3.setText("");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
        });
    }
}
