package com.example.app355;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.app355.Mood.Mood_main;

public class MainActivity extends AppCompatActivity {

    private Button journal;
    private Button calendar;
    private Button mood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        journal = findViewById(R.id.journal);
        journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJournalPage();
            }
        });

        calendar = findViewById(R.id.calendar);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalendarPage();
            }
        });

        mood = findViewById(R.id.mood);
        mood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMoodPage();
            }
        });
    }

    public void openJournalPage() {
        Intent intent = new Intent(this, JournalPage.class);
        startActivity(intent);
    }

    public void openCalendarPage() {
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }

    public void openMoodPage() {
        Intent intent = new Intent(this, Mood_main.class);
        startActivity(intent);
    }
}