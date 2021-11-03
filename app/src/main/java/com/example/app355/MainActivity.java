package com.example.app355;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.app355.Mood.Mood_main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {

    private Button journal;
    private Button calendar;
    private Button mood;

    //Calendar variables
    private TextView monthYearText;
    private RecyclerView calendarRecyclerView;
    private LocalDate selectedDate;

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

        initWidgets();
        selectedDate = LocalDate.now();
        setMonthView();
    }

    //Calendar code starts

    private void setMonthView() {
        monthYearText.setText(monthYearFromDate(selectedDate));
    }

    private String monthYearFromDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        return date.format(formatter);
    }

    private void initWidgets() {
        calendarRecyclerView = findViewById(R.id.calendarRecyclerView);
        monthYearText = findViewById(R.id.monthYearView);

    }

    public void previousMonthAction(View view) {
    }

    public void nextMonthAction(View view) {
    }
    //Calendar code ends

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