package com.example.acer.myapplication;

import android.content.Intent;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Map;

public class teacher extends AppCompatActivity {

    private ListView namelist;
    private ArrayList<String> name = new ArrayList<>();
    FirebaseDatabase database = FirebaseDatabase.getInstance();


    FirebaseAuth mAuth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        namelist = (ListView) findViewById(R.id.name_list);

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,name);

        namelist.setAdapter(arrayAdapter);

        final String userId = FirebaseAuth.getInstance().getUid();

        DatabaseReference myRef = database.getReference("Users");

        myRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Map<String, Object> map = (Map<String, Object>) dataSnapshot.getValue();
                Log.d("sss" ,"Value is: " + map);
                name.add(String.valueOf(map));

//                for (DataSnapshot childSnapshot: dataSnapshot.getChildren()) {
//                    String nnn = childSnapshot.getKey();
//                    Log.d("mmm", "name " + nnn);
//                    String names = childSnapshot.getValue(String.class);
//                    name.add(names);
//
//                }

//                for( DataSnapshot namesnap : dataSnapshot.getChildren()) {
//                    Log.v("mmm",""+ namesnap.getKey()); //displays the key for the node
//                    String value = namesnap.getValue(String.class);
//                    Log.d("nnn",""+ value);
////                    if(value != null){
////                    name.add(value);
////                  }
////                    String value = dataSnapshot.getValue(String.class);
////                    Log.d("fff", "value is " + value);
                    arrayAdapter.notifyDataSetChanged();

//                }
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

            }
        });


//        namelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String pos = parent.getItemAtPosition(position).toString();
//                Log.d("ss","pos ="+ pos);
//                Intent i = new Intent(teacher.this,Data.class);
//                i.putExtra("pos",pos);
//                startActivity(i);
//
//
//            }
//        });

    }
}
