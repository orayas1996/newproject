package com.example.acer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class teach_kod extends AppCompatActivity {


    TextView title,bb,ex,iv11,iv12,iv13,iv14,iv15,iv16,iv17,iv18,iv21,iv22,iv23,iv24,iv25,iv26,iv27,iv28;
    ImageView view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_kod);

        final ImageView view1 = (ImageView) findViewById(R.id.imageView1);

        final TextView title = (TextView) findViewById(R.id.Title);
        final TextView bb = (TextView) findViewById(R.id.bb);
        TextView ex = (TextView) findViewById(R.id.ex);
        TextView iv11 = (TextView) findViewById(R.id.iv11);
        TextView iv12 = (TextView) findViewById(R.id.iv12);
        TextView iv13 = (TextView) findViewById(R.id.iv13);
        TextView iv14 = (TextView) findViewById(R.id.iv14);
        TextView iv15 = (TextView) findViewById(R.id.iv15);
        TextView iv16 = (TextView) findViewById(R.id.iv16);
        TextView iv17 = (TextView) findViewById(R.id.iv17);
        TextView iv18 = (TextView) findViewById(R.id.iv18);
        TextView iv21 = (TextView) findViewById(R.id.iv21);
        TextView iv22 = (TextView) findViewById(R.id.iv22);
        TextView iv23 = (TextView) findViewById(R.id.iv23);
        TextView iv24 = (TextView) findViewById(R.id.iv24);
        TextView iv25 = (TextView) findViewById(R.id.iv25);
        TextView iv26 = (TextView) findViewById(R.id.iv26);
        TextView iv27 = (TextView) findViewById(R.id.iv27);
        TextView iv28 = (TextView) findViewById(R.id.iv28);


        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ด.เด็ก");
                view1.setImageResource(R.drawable.b1);


            }
        });

        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("จ.จาน");
                view1.setImageResource(R.drawable.b2);

            }
        });
        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ช.ช้าง");
                view1.setImageResource(R.drawable.b3);

            }
        });

        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ซ.โซ่");
                view1.setImageResource(R.drawable.b33);

            }
        });
        iv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ฎ.ชฎา");
                view1.setImageResource(R.drawable.bb);

            }
        });



    }
}
