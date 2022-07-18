package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleListView;

    String courseList[] ={"Rose","Chrysanthemum","Lily","Lotus","Tulip"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListView=findViewById(R.id.SimpleListView);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MainActivity.this,R.layout.listitem,R.id.itemTextView,courseList);
        simpleListView.setAdapter(arrayAdapter);

    }
}