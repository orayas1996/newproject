package com.example.acer.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class teach_kod extends AppCompatActivity {


    TextView title, bb, tx1, tx2, tx3;
    Button iv11, iv12, iv13, iv14, iv15, iv16, iv17, iv18, iv21, iv22, iv23, iv24, iv25, iv26, iv27, iv28, b1, b2, b3;
    ImageView view1, view2, view3,img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_kod);

        final ImageView view1 = (ImageView) findViewById(R.id.imageView1);
        final ImageView view2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView view3 = (ImageView) findViewById(R.id.imageView3);
        final ImageView img = (ImageView) findViewById(R.id.imageView);

        final TextView title = (TextView) findViewById(R.id.Title);
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
        Button iv17 = (Button) findViewById(R.id.iv17);
        Button iv18 = (Button) findViewById(R.id.iv18);
        Button iv21 = (Button) findViewById(R.id.iv21);
        Button iv22 = (Button) findViewById(R.id.iv22);
        Button iv23 = (Button) findViewById(R.id.iv23);
        Button iv24 = (Button) findViewById(R.id.iv24);
        Button iv25 = (Button) findViewById(R.id.iv25);
        Button iv26 = (Button) findViewById(R.id.iv26);
        Button iv27 = (Button) findViewById(R.id.iv27);
        Button iv28 = (Button) findViewById(R.id.iv28);
        final Button b1 = (Button) findViewById(R.id.but1);
        final Button b2 = (Button) findViewById(R.id.but2);
        final Button b3 = (Button) findViewById(R.id.but3);

        final MediaPlayer d = MediaPlayer.create(this, R.raw.d_1);
        final MediaPlayer d2 = MediaPlayer.create(this, R.raw.dd_1);
        final MediaPlayer d3 = MediaPlayer.create(this, R.raw.ddd_1);
        final MediaPlayer j = MediaPlayer.create(this, R.raw.d_2);
        final MediaPlayer j2 = MediaPlayer.create(this, R.raw.dd_2);
        final MediaPlayer j3 = MediaPlayer.create(this, R.raw.ddd_2);
        final MediaPlayer ch = MediaPlayer.create(this, R.raw.d_3);
        final MediaPlayer ch2 = MediaPlayer.create(this, R.raw.dd_3);
        final MediaPlayer ch3 = MediaPlayer.create(this, R.raw.ddd_3);
        final MediaPlayer zh = MediaPlayer.create(this, R.raw.d_4);
        final MediaPlayer da = MediaPlayer.create(this, R.raw.d_5);
        final MediaPlayer da2 = MediaPlayer.create(this, R.raw.dd_5);
        final MediaPlayer da3 = MediaPlayer.create(this, R.raw.ddd_5);
        final MediaPlayer tak = MediaPlayer.create(this, R.raw.d_6);
        final MediaPlayer monto = MediaPlayer.create(this, R.raw.d_7);
        final MediaPlayer t = MediaPlayer.create(this, R.raw.d_8);
        final MediaPlayer t2 = MediaPlayer.create(this, R.raw.dd_8);
        final MediaPlayer t3 = MediaPlayer.create(this, R.raw.ddd_8);
        final MediaPlayer tao = MediaPlayer.create(this, R.raw.d_9);
        final MediaPlayer tung = MediaPlayer.create(this, R.raw.d_10);
        final MediaPlayer tahan = MediaPlayer.create(this, R.raw.d_11);
        final MediaPlayer tahan2 = MediaPlayer.create(this, R.raw.dd_11);
        final MediaPlayer tahan3 = MediaPlayer.create(this, R.raw.ddd_11);
        final MediaPlayer tong = MediaPlayer.create(this, R.raw.d_12);
        final MediaPlayer tong2 = MediaPlayer.create(this, R.raw.dd_12);
        final MediaPlayer tong3 = MediaPlayer.create(this, R.raw.ddd_12);
        final MediaPlayer sala = MediaPlayer.create(this, R.raw.d_13);
        final MediaPlayer sala2 = MediaPlayer.create(this, R.raw.dd_13);
        final MediaPlayer sala3 = MediaPlayer.create(this, R.raw.ddd_13);
        final MediaPlayer rsee = MediaPlayer.create(this, R.raw.d_14);
        final MediaPlayer rsee2 = MediaPlayer.create(this, R.raw.dd_14);
        final MediaPlayer rsee3 = MediaPlayer.create(this, R.raw.ddd_14);
        final MediaPlayer s = MediaPlayer.create(this, R.raw.d_15);
        final MediaPlayer s2 = MediaPlayer.create(this, R.raw.dd_15);
        final MediaPlayer s3 = MediaPlayer.create(this, R.raw.ddd_15);
        final MediaPlayer tan = MediaPlayer.create(this, R.raw.d_16);

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ด.เด็ก");
                view1.setImageResource(R.drawable.d_1);
                view2.setImageResource(R.drawable.dd_1);
                view3.setImageResource(R.drawable.ddd_1);
                tx1.setText("ไม้ - กวาด");
                tx2.setText("สะ - หมุด");
                tx3.setText("เตา - รีด");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        d3.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        d2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        d.start();
                    }
                });
            }
        });

        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("จ.จาน");
                view1.setImageResource(R.drawable.d_2);
                view2.setImageResource(R.drawable.dd_2);
                view3.setImageResource(R.drawable.ddd_2);
                tx1.setText("สม - เส็ด");
                tx2.setText("ตำ - หรวด");
                tx3.setText("ตรวด - งาน");

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        j2.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        j.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        j3.start();
                    }
                });


            }
        });
        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ช.ช้าง");
                view1.setImageResource(R.drawable.dd_3);
                view2.setImageResource(R.drawable.d_3);
                view3.setImageResource(R.drawable.ddd_3);
                tx1.setText("พืด");
                tx2.setText("เภ - สัด");
                tx3.setText("บวด");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ch.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ch2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ch3.start();
                    }
                });


            }
        });

        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ซ.โซ่");
                view1.setImageResource(R.drawable.bb);
                view2.setImageResource(R.drawable.d_4);
                view3.setImageResource(R.drawable.bb);
                tx1.setText("");
                tx3.setText("");
                tx2.setText("ก๊าด");
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        zh.start();
                    }
                });
            }
        });
        iv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ฎ.ชฎา");
                view1.setImageResource(R.drawable.d_5);
                view2.setImageResource(R.drawable.ddd_5);
                view3.setImageResource(R.drawable.dd_5);
                tx1.setText("กด - หมาย");
                tx2.setText("รา-สี-กอ-ระ-กด");
                tx3.setText("มง - กุด");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        da.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        da2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        da3.start();
                    }
                });


            }
        });


        iv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ฐ ฐาน");
                view1.setImageResource(R.drawable.bb);
                view2.setImageResource(R.drawable.d_16);
                view3.setImageResource(R.drawable.bb);
                tx1.setText("");
                tx3.setText("");
                tx2.setText("ก้อน - อิด");
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tan.start();
                    }
                });



            }
        });
        iv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ฏ ปักตัก");
                view1.setImageResource(R.drawable.bb);
                view2.setImageResource(R.drawable.d_6);
                view3.setImageResource(R.drawable.bb);
                tx1.setText("");
                tx3.setText("");
                tx2.setText("นาด-ตะ-สิน");
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tak.start();
                    }
                });



            }
        });
        iv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ฑ นางมนโท");
                view1.setImageResource(R.drawable.bb);
                view2.setImageResource(R.drawable.d_7);
                view3.setImageResource(R.drawable.bb);
                tx1.setText("");
                tx3.setText("");
                tx2.setText("ครุด");
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        monto.start();
                    }
                });
                }
        });
        iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ฒ ผู้เฒ่า");
                view1.setImageResource(R.drawable.bb);
                view2.setImageResource(R.drawable.d_9);
                view3.setImageResource(R.drawable.bb);
                tx1.setText("");
                tx3.setText("");
                tx2.setText("อัด-ทะ-จัน");
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tao.start();
                    }
                });
            }
        });
        iv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ต. เต่า");
                view1.setImageResource(R.drawable.dd_8);
                view2.setImageResource(R.drawable.d_8);
                view3.setImageResource(R.drawable.d33);
                tx1.setText("พระ-อา-ทิด");
                tx2.setText("บัน - ทิด");
                tx3.setText("กะ - สัด");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t3.start();
                    }
                });


            }
        });
        iv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ถ. ถุง");
                view1.setImageResource(R.drawable.bb);
                view2.setImageResource(R.drawable.d1);
                view3.setImageResource(R.drawable.bb);
                tx1.setText("");
                tx3.setText("");
                tx2.setText("รด");
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tung.start();
                    }
                });
            }
        });
        iv24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ท. ทหาร");
                view1.setImageResource(R.drawable.dd_11);
                view2.setImageResource(R.drawable.d2);
                view3.setImageResource(R.drawable.d_11);
                tx1.setText("กา-กะ-บาด");
                tx2.setText("แค-หรอด");
                tx3.setText("บอ-ริ-สัด");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tahan.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tahan2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tahan3.start();
                    }
                });


            }
        });
        iv25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ธ. ธง");
                view1.setImageResource(R.drawable.ddd_12);
                view2.setImageResource(R.drawable.d_12);
                view3.setImageResource(R.drawable.dd_12);
                tx1.setText("วัน - พุด");
                tx2.setText("อา - วุด");
                tx3.setText("โกรด");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tong.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tong2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tong3.start();
                    }
                });


            }
        });
        iv26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ศ. คอศาลา");
                view1.setImageResource(R.drawable.d_13);
                view2.setImageResource(R.drawable.ddd_13);
                view3.setImageResource(R.drawable.dd_13);
                tx1.setText("โท-ระ-ทัด");
                tx2.setText("ประ-เทด");
                tx3.setText("อะ-วะ-กาด");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sala.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sala2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sala3.start();
                    }
                });
            }
        });
        iv27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ษ. บอฤษี");
                view1.setImageResource(R.drawable.d3);
                view2.setImageResource(R.drawable.dd_14);
                view3.setImageResource(R.drawable.d_14);
                tx1.setText("กระ - ดาด");
                tx2.setText("ยา - พิด");
                tx3.setText("ขอ - โทด");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rsee.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rsee2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rsee3.start();
                    }
                });
            }
        });
        iv28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("ส. เสือ");
                view1.setImageResource(R.drawable.dd_15);
                view2.setImageResource(R.drawable.d_15);
                view3.setImageResource(R.drawable.ddd_15);
                tx1.setText("ถัง - แก๊ด");
                tx2.setText("สาด-สะ-หนา");
                tx3.setText("ฝะ-หรั่ง-เสด");
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        s.start();
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        s2.start();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        s3.start();
                    }
                });


            }
        });
//                s.stop();
//                s2.stop();
//                s3.stop();
//                d.stop();
//                d2.stop();
//                d3.stop();
//                 j.stop();
//                 j2.stop();
//                j3.stop();
//             ch.stop();
//                ch2.stop();
//                 ch3.stop();
//                zh.stop();
//                 da.stop();
//                da2.stop();
//                 da3.stop();
//                 tak.stop();
//                 monto.stop();
//               t.stop();
//               t2.stop();
//               t3.stop();
//             tao.stop();
//                tung.stop();
//                tahan.stop();
//                tahan2.stop();
//                 tahan3.stop();
//               tong.stop();
//                tong2.stop();
//              tong3.stop();
//                sala.stop();
//               sala2.stop();
//                 sala3.stop();
//               rsee.stop();
//                 rsee2.stop();
//                rsee3.stop();
//                s.stop();
//              s2.stop();
//                s3.stop();
//               tan.stop();
//


    }

    }






