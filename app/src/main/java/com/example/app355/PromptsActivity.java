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
        promptList.add("prompt 1");
        promptList.add("prompt 2");
        promptList.add("prompt 3");
        promptList.add("prompt 4");
        promptList.add("prompt 5");
        promptList.add("prompt 6");
        promptList.add("prompt 7");
        promptList.add("prompt 8");

        ArrayAdapter promptAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, promptList);
        listView.setAdapter(promptAdapter);
    }
}