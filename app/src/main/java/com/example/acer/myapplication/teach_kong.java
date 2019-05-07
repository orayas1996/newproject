package com.example.acer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class teach_kong extends AppCompatActivity {
    TextView title, bb, tx1, tx2, tx3;
    Button iv11,b1, b2, b3;
    ImageView view1, view2, view3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_kong);
        final ImageView view1 = (ImageView) findViewById(R.id.imageView1);
        final ImageView view2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView view3 = (ImageView) findViewById(R.id.imageView3);

        final TextView bb = (TextView) findViewById(R.id.bb);
        final TextView tx1 = (TextView) findViewById(R.id.text1);
        final TextView tx2 = (TextView) findViewById(R.id.text2);
        final TextView tx3 = (TextView) findViewById(R.id.text3);
        Button iv11 = (Button) findViewById(R.id.iv11);
        final Button b1 = (Button) findViewById(R.id.but1);
        final Button b2 = (Button) findViewById(R.id.but2);
        final Button b3 = (Button) findViewById(R.id.but3);

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ง.งู");
                view1.setImageResource(R.drawable.ng_3);
                view2.setImageResource(R.drawable.ng_2);
                view3.setImageResource(R.drawable.ng_1);
                tx1.setText("อึ่ง - อ่าง");
                tx2.setText("ยุง");
                tx3.setText("มะ - ม่วง");
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
