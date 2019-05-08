package com.example.acer.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class teach_kon extends AppCompatActivity {
    TextView title, bb, tx1, tx2, tx3;
    Button iv11, iv12, iv13, iv14, iv15,iv16,b1, b2, b3;
    ImageView view1, view2, view3,img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_kon);

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
        Button iv15 = (Button) findViewById(R.id.iv15);
        Button iv16 = (Button) findViewById(R.id.iv16);
        final Button b1 = (Button) findViewById(R.id.but1);
        final Button b2 = (Button) findViewById(R.id.but2);
        final Button b3 = (Button) findViewById(R.id.but3);

        final MediaPlayer nu = MediaPlayer.create(this, R.raw.n_1);
        final MediaPlayer nu2 = MediaPlayer.create(this, R.raw.nn_1);
        final MediaPlayer nu3 = MediaPlayer.create(this, R.raw.nnn_1);
        final MediaPlayer yi = MediaPlayer.create(this, R.raw.n_2);
        final MediaPlayer yi2 = MediaPlayer.create(this, R.raw.nn_2);
        final MediaPlayer yi3 = MediaPlayer.create(this, R.raw.nnn_2);
        final MediaPlayer ne = MediaPlayer.create(this, R.raw.n_3);
        final MediaPlayer ne2 = MediaPlayer.create(this, R.raw.nn_3);
        final MediaPlayer ne3 = MediaPlayer.create(this, R.raw.nnn_3);
        final MediaPlayer r = MediaPlayer.create(this, R.raw.n_4);
        final MediaPlayer r2 = MediaPlayer.create(this, R.raw.nn_4);
        final MediaPlayer r3 = MediaPlayer.create(this, R.raw.nnn_4);
        final MediaPlayer l = MediaPlayer.create(this, R.raw.n_5);
        final MediaPlayer l2 = MediaPlayer.create(this, R.raw.nn_5);
        final MediaPlayer l3 = MediaPlayer.create(this, R.raw.nnn_5);
        final MediaPlayer la = MediaPlayer.create(this, R.raw.n_6);


        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("น.หนู");
                view1.setImageResource(R.drawable.nn_1);
                view2.setImageResource(R.drawable.n_1);
                view3.setImageResource(R.drawable.nnn_1);
                tx1.setText("(อ่าน)");
                tx2.setText("(ปะ-ติ-ทิน)");
                tx3.setText("(ยา-สี-ฟัน)");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        nu.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        nu2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        nu3.start();
                    }
                });
            }
        });
        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ญ.ผู้หญิง");
                view1.setImageResource(R.drawable.n_2);
                view2.setImageResource(R.drawable.nn_2);
                view3.setImageResource(R.drawable.nnn_2);
                tx1.setText("(ของ - ขวัน)");
                tx2.setText("(เหรียน)");
                tx3.setText("(ทำ - บุน)");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        yi.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        yi2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        yi3.start();
                    }
                });
            }
        });
        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ณ.เณร");
                view1.setImageResource(R.drawable.n_3);
                view2.setImageResource(R.drawable.nn_3);
                view3.setImageResource(R.drawable.nnn_3);
                tx1.setText("(คูน)");
                tx2.setText("(คุน - ครู)");
                tx3.setText("(วิน - ยาน)");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ne.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ne2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ne3.start();
                    }
                });
            }
        });
        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ร.เรือ");
                view1.setImageResource(R.drawable.n_4);
                view2.setImageResource(R.drawable.n1);
                view3.setImageResource(R.drawable.n2);
                tx1.setText("(อา - หาน)");
                tx2.setText("(ทะ - หาน)");
                tx3.setText("(ทะ-นา-คาน)");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        r.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        r2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        r3.start();
                    }
                });
            }
        });
        iv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ล.ลิง");
                view1.setImageResource(R.drawable.n33);
                view2.setImageResource(R.drawable.n_5);
                view3.setImageResource(R.drawable.nn_5);
                tx1.setText("(ผน-ละ-ไม้)");
                tx2.setText("(พะ-ยา-บาน)");
                tx3.setText("(น้ำ-ตาน)");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l3.start();
                    }
                });
            }
        });
        iv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ฬ.จุฬา");
                view1.setImageResource(R.drawable.bb);
                view2.setImageResource(R.drawable.n3);
                view3.setImageResource(R.drawable.bb);
                tx1.setText("");
                tx2.setText("(ปลา - วาน)");
                tx3.setText("");

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        la.start();
                    }
                });

            }
        });

    }
}
