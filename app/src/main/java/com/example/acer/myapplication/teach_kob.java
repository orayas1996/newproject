package com.example.acer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class teach_kob extends AppCompatActivity {

    TextView title, bb, tx1, tx2, tx3;
    Button iv11, iv12, iv13, iv14, iv15,b1, b2, b3;
    ImageView view1, view2, view3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_kob);

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
        Button iv15 = (Button) findViewById(R.id.iv15);
        final Button b1 = (Button) findViewById(R.id.but1);
        final Button b2 = (Button) findViewById(R.id.but2);
        final Button b3 = (Button) findViewById(R.id.but3);

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("บ.ใบไม้");
                view1.setImageResource(R.drawable.pp_1);
                view2.setImageResource(R.drawable.p_1);
                view3.setImageResource(R.drawable.ppp_1);
                tx1.setText("กราบ");
                tx2.setText("ตะ - เกียบ");
                tx3.setText("กบ");
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
                bb.setText("ป.ปลา");
                view1.setImageResource(R.drawable.pp_2);
                view2.setImageResource(R.drawable.ppp_2);
                view3.setImageResource(R.drawable.P_2);
                tx1.setText("ธูบ");
                tx2.setText("ทะ - วีบ");
                tx3.setText("เทบ");
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
                bb.setText("พ.พาน");
                view1.setImageResource(R.drawable.p_4);
                view2.setImageResource(R.drawable.pp_4);
                view3.setImageResource(R.drawable.b2);
                tx1.setText("อา - ชีบ");
                tx2.setText("ทับ - พี");
                tx3.setText("โทร-ระ-สับ");
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
                bb.setText("ฟ.ฟัน");
                view1.setImageResource(R.drawable.b33);
                view2.setImageResource(R.drawable.b1);
                view3.setImageResource(R.drawable.p_5);
                tx1.setText("ไม-โทร-เวบ");
                tx2.setText("ยี-ร้าบ");
                tx3.setText("กร๊าบ");
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
        iv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ภ.สำเภา");
                view1.setImageResource(R.drawable.bb);
                view2.setImageResource(R.drawable.p_3);
                view3.setImageResource(R.drawable.bb);
                tx1.setText("");
                tx2.setText("ความ - โลบ");
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
