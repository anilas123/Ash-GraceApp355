package com.example.app355.Mood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app355.Calendar;
import com.example.app355.JournalPage;
import com.example.app355.MainActivity;
import com.example.app355.R;

public class Mood_ScorePage extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    private AppCompatButton saveBtn,retakeBtn,backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_score_page);

        textView = findViewById(R.id.textView9);
        saveBtn = findViewById(R.id.save);
        retakeBtn = findViewById(R.id.retakeButton);
        backBtn = findViewById(R.id.backButton);
        imageView = (ImageView) findViewById(R.id.image_view);

        /*
         * For different moods system will show user different pictures
         */
        if (Mood().equalsIgnoreCase(" you are happy")){
            imageView.setImageResource(R.drawable.img_2);
            textView.setText("Hey! " + Mood_main.name + Mood());
        }
        else if(Mood().equalsIgnoreCase(" you are calm")){
            imageView.setImageResource(R.drawable.img_3);
            textView.setText("Hey! " + Mood_main.name + Mood());
        }
        else if(Mood().equalsIgnoreCase(" you are annoyed")){
            imageView.setImageResource(R.drawable.imag4);
            textView.setText("Hey! " + Mood_main.name + Mood());
        }
        else if(Mood().equalsIgnoreCase(" you are upset")){
            imageView.setImageResource(R.drawable.imag4);
            textView.setText("Hey! " + Mood_main.name + Mood());
        }
        else if(Mood().equalsIgnoreCase(" you are sad")){
            imageView.setImageResource(R.drawable.img_4);
            textView.setText("Hey! " + Mood_main.name + Mood());
        }
            textView.setText("Hey! " + Mood_main.name + Mood());


        retakeBtn.setOnClickListener(new View.OnClickListener() { //Button that takes user to the Mood_main page
            @Override
            public void onClick(View v) {
                openMood_mainPage();
                Mood_Q1.clearCounts();

            }
        });

        saveBtn.setOnClickListener(new View.OnClickListener() { //Button that takes user to the calendar page
            @Override
            public void onClick(View v) {
                openCalendarPage();
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {  //Button that takes user to the main page
            @Override
            public void onClick(View v) {
                openMainPage();
            }
        });

    }

    /*
     * Method which calculates the user's mood by counting how many times they selected each options
     */
    public String Mood(){

        int[] array = {Mood_Q1.happyCount,Mood_Q1.calmCount,Mood_Q1.annoyedCount,Mood_Q1.upsetCount,Mood_Q1.sadCount};
        int large = 0;

        for (int i = 0; i < 5; i++){
            if (array[i] > large){
                large = array[i];
            }
        }
        if (large == Mood_Q1.happyCount){
            return " You are happy";
        }
        else if(large == Mood_Q1.calmCount){
            return " You are calm";
        }
        else if(large == Mood_Q1.annoyedCount){
            return " You are Annoyed";
        }
        else if(large == Mood_Q1.upsetCount){
            return " You are Upset";
        }
        else if(large == Mood_Q1.sadCount){
            return " You are sad";
        }
        else
            return "";

    }

    public void openMood_mainPage() {
        Intent intent = new Intent(this, Mood_main.class);
        startActivity(intent);
    }

    public void openMainPage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openCalendarPage() {
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }


}