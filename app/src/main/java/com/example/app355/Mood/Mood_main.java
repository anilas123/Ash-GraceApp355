package com.example.app355.Mood;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.app355.R;

public class Mood_main extends AppCompatActivity {
    /*
     *Declaring the instance variables most of them are private, name has to be static b/c we need to at Mood_scorepage.java
     */
    private Button mood;
    private EditText editText;
    public static String name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_main);

        editText = findViewById(R.id.et_name);

        mood = findViewById(R.id.button_start);
        mood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = editText.getText().toString();//Where the user input their name and we store it

                    openMoodPage();
            }
        });

    }
    public void openMoodPage() {
        Intent intent = new Intent(this, Mood_Q1.class);
        startActivity(intent);
    }

}