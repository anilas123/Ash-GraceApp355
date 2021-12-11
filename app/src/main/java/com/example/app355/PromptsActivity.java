package com.example.app355;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PromptsActivity extends AppCompatActivity {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompts);
        listView = findViewById(R.id.listview);

        ArrayList<String> promptList = new ArrayList<>();
        promptList.add("What are three things you are grateful for, and why?");
        promptList.add("Write a letter to your greatest fear, tell it how you feel.");
        promptList.add("Get in touch with your surroundings! Find a spot to sit for five minutes, write what you see, hear, and/or feel.");
        promptList.add("Write a list of short term goals for yourself. Make them realistic.");
        promptList.add("Write an apology to yourself. Forgive yourself for being human.");
        promptList.add("Where do you want to be in 10 years? How will you get there?");
        promptList.add("List some of your favorite things in life. How do these things make you feel?");
        promptList.add("prompt 8");

        ArrayAdapter promptAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, promptList);
        listView.setAdapter(promptAdapter);
    }
}