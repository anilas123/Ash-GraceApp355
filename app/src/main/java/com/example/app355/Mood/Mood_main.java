package com.example.app355.Mood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app355.R;

public class Mood_main extends AppCompatActivity {
    private Button mood;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_main);



        mood = findViewById(R.id.button_start);
        mood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMoodPage();
            }
        });

    }
    public void openMoodPage() {
        Intent intent = new Intent(this, Mood_Q1.class);
        startActivity(intent);
    }
}