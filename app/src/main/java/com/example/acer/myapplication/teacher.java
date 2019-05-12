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
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Map;

public class teacher extends AppCompatActivity {

    private ListView sclist;
    TextView namev,scoreld;
    private ArrayList<Long> score1 = new ArrayList<>();
    DatabaseReference databaseReference,db2;
    FirebaseAuth mAuth;
    FirebaseUser user;
    String uid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        namev = (TextView) findViewById(R.id.nameview);
        scoreld = (TextView) findViewById(R.id.scoreLD);
        sclist = (ListView) findViewById(R.id.name_list);

        user = FirebaseAuth.getInstance().getCurrentUser();
        uid = user.getUid();
        databaseReference = FirebaseDatabase.getInstance().getReference("Users");
        db2 = FirebaseDatabase.getInstance().getReference("Users").child(uid).child("sc");



        final ArrayAdapter<Long> arrayAdapter = new ArrayAdapter<Long>(this, android.R.layout.simple_list_item_1,score1);

        sclist.setAdapter(arrayAdapter);

//        final String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
        Log.d("uuu","u "+ uid);

//        DatabaseReference myRef = database.getReference("Users").child(userId).child("name");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    String names = dataSnapshot.child(uid).child("name").getValue(String.class);
                    namev.setText(names);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
         db2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot childSnapshot : dataSnapshot.getChildren()) {
                    long value = childSnapshot.getValue(long.class);
                    Log.d("fff", "value is " + value);
                    score1.add(value);
                    arrayAdapter.notifyDataSetChanged();
                }
                long score_ld =  score1.get(0);
                Log.d("ddd","sc " + score_ld);
                scoreld.setText(String.valueOf(score_ld));
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
