package com.example.acer.myapplication;

import android.media.MediaPlayer;
import android.nfc.Tag;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager slideview;
    private slide sliderAdapter;
    private Button next,prev,sounds;
    private int current;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slideview = (ViewPager) findViewById(R.id.slideview);
        sliderAdapter = new slide(this);
        slideview.setAdapter(sliderAdapter);





        Button next = (Button) findViewById(R.id.btn_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideview.setCurrentItem(slideview.getCurrentItem() + 1);
            }
        });

        Button prev = (Button) findViewById(R.id.btn_prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideview.setCurrentItem(slideview.getCurrentItem());
            }
        });

//        if(position == 0) {
//            Button sounds = (Button) findViewById(R.id.sound);
//            final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.time);
//            sounds.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    mp.start();
//                }
//            });
//            Log.d("Tag", "my position is : " + position);
//        }



        slideview.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                current = position;
//                if(position== 0){
//                    Button sounds = (Button) findViewById(R.id.sound);
//                    sounds.setEnabled(false);
//                    sounds.setVisibility(View.INVISIBLE);
//                    Log.d("tag", "my position is : " + position);
//                }else if(position == 1){
//
//                    sounds.setVisibility(View.VISIBLE);
//                    Log.d("tag", "my position is nn: " + position);
//                }else{
//
//                    sounds.setVisibility(View.VISIBLE);
//                    Log.d("tag", "my position is nnnnn: " + position);
//                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }



}
