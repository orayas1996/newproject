package com.example.acer.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Data extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    private ListView mlistv;
    private ArrayList<Long> score = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

//
//        long t3 = getIntent().getExtras().getLong("time3");
//        long total_time = t3;

        String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
        DatabaseReference myRef = database.getReference().child(userId).child("sc");
//        myRef.push().setValue(total_time);

        mlistv = (ListView) findViewById(R.id.listview);
        final ArrayAdapter<Long> arrayAdapter = new ArrayAdapter<Long>(this, android.R.layout.simple_list_item_1,score);

        mlistv.setAdapter(arrayAdapter);


        myRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                long value = dataSnapshot.getValue(long.class);
                Log.d("fff","value is "+ value);
                score.add(value);
                arrayAdapter.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("ooo", "Failed to read value.", databaseError.toException());

            }
        });

    }

//    FirebaseDatabase database = FirebaseDatabase.getInstance();
//    private ListView mlistv;
//    private ArrayList<Long> score = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_data);
//
////        long total_time = getIntent().getExtras().getLong("time3");
////        Log.d("sss","time" + total_time);
////
////        String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
////
////
////        DatabaseReference myRef = database.getReference("Users").child(userId).child("score1");
////        myRef.push().setValue(total_time);
//
//
////        //get user id
////        final String id_user = getIntent().getExtras().getString("id");
////        //get name form teacher
////        final String name = getIntent().getExtras().getString("pos");
////
////
////        DatabaseReference myRef2 = database.getReference("Users").child(name);
//
//
//        mlistv = (ListView) findViewById(R.id.listview);
//        final ArrayAdapter<Long> arrayAdapter = new ArrayAdapter<Long>(this, android.R.layout.simple_list_item_1,score);
//
//        mlistv.setAdapter(arrayAdapter);
//
//
////        myRef.addChildEventListener(new ChildEventListener() {
////            @Override
////            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
////                for( DataSnapshot namesnap : dataSnapshot.getChildren()) {
////
////                    long sc = namesnap.child("Info").getValue(Long.class);
//////                    String value = namesnap.child(name).getValue(String.class);
//////                    Log.d("aaa","value =" + value);
//////                    if(value == name){
//////                        long sc = namesnap.child("score1").getValue(long.class);
////                    Log.d("ccc","score = "+ sc);
////                    score.add(sc);
////
////
//////                    }
//////                    String value = dataSnapshot.getValue(String.class);
//////                    Log.d("fff", "value is " + value);
////                    arrayAdapter.notifyDataSetChanged();
////
////                }
//////                long value = dataSnapshot.getValue(long.class);
//////                Log.d("fff","id is "+ id_user);
//////                Log.d("fff","value is "+ value);
//////                score.add(value);
//////                arrayAdapter.notifyDataSetChanged();
////
////            }
////
////            @Override
////            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
////
////            }
////
////            @Override
////            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
////
////            }
////
////            @Override
////            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
////
////            }
////
////            @Override
////            public void onCancelled(@NonNull DatabaseError databaseError) {
////                Log.w("ooo", "Failed to read value.", databaseError.toException());
////
////            }
////        });
//
//    }

}
