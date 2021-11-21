package com.example.app355;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app355.Mood.Mood_main;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

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


    //Main screen methods
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