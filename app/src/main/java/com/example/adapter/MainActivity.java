package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> Friends = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Friends.add("Adil");
        Friends.add("Anns");
        Friends.add("Usman");
        Friends.add("Ahmad");
        Friends.add("Saad");





    }
}