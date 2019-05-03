package com.example.acer.myapplication;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class slide extends PagerAdapter{

    Context context;
    LayoutInflater layoutInflater;

    public slide(Context context){
        this.context = context;

    }



    public int[] slideimgs_1 = {
            R.drawable.d1,
            R.drawable.d2,
            R.drawable.d3
    };

    public int[] slideimgs_2 = {
            R.drawable.d1,
            R.drawable.d2,
            R.drawable.d3
    };

    public int[] slideimgs_3 = {
            R.drawable.d1,
            R.drawable.d2,
            R.drawable.d3
    };

    public String[] alphabets = {
            "ด.เด็ก",
            "ถ.ถุง",
            "ษ.บอฤษี"
    };
    public String[] exs_1= {
            "ไม้ - กวาด",
            "รด",
            "กระ - ดาด"
    };
    public String[] exs_2= {
            "ลูก - กวาด",
            "นด",
            "ษ"
    };
    public String[] exs_3= {
            "กระจาด",
            "ถถ",
            "ษษ"
    };
    public String[] word_1= {
            "ไม้กวาด",
            "รถ",
            "กระดาษ"
    };
    public String[] word_2= {
            "ลูกกวาด",
            "นถ",
            "ษษษ"
    };
    public String[] word_3= {
            "กระจาด",
            "ถถ",
            "ษษ"
    };

    @Override
    public int getCount() {
        return alphabets.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem( ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide,container,false);

        ImageView slideimg_1 = (ImageView) view.findViewById(R.id.img1);
        ImageView slideimg_2 = (ImageView) view.findViewById(R.id.img2);
        ImageView slideimg_3 = (ImageView) view.findViewById(R.id.img3);
        TextView alphabet = (TextView) view.findViewById(R.id.aphabet);
        TextView ex1 = (TextView) view.findViewById(R.id.ex1);
        TextView ex2 = (TextView) view.findViewById(R.id.ex2);
        TextView ex3 = (TextView) view.findViewById(R.id.ex3);
        TextView word1 = (TextView) view.findViewById(R.id.word1);
        TextView word2 = (TextView) view.findViewById(R.id.word2);
        TextView word3 = (TextView) view.findViewById(R.id.word3);

        slideimg_1.setImageResource(slideimgs_1[position]);
        slideimg_2.setImageResource(slideimgs_2[position]);
        slideimg_3.setImageResource(slideimgs_3[position]);
        alphabet.setText(alphabets[position]);
        ex1.setText(exs_1[position]);
        ex2.setText(exs_2[position]);
        ex3.setText(exs_3[position]);
        word1.setText(word_1[position]);
        word2.setText(word_2[position]);
        word3.setText(word_3[position]);


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
