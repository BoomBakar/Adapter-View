package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> Friends = new ArrayList<String>();
    ListView Lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Friends.add("Adil");
        Friends.add("Anns");
        Friends.add("Usman");
        Friends.add("Ahmad");
        Friends.add("Saad");

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, Friends);
        Lv = findViewById(R.id.listview);
        Lv.setAdapter(adapter);


    }
}