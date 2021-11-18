package com.example.app355.Mood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.app355.JournalPage;
import com.example.app355.R;

public class Mood_ScorePage extends AppCompatActivity {




    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_score_page);

        textView = findViewById(R.id.textView9);
        button = findViewById(R.id.button);

        textView.setText(Mood());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMood_mainPage();
                Mood_Q1.clearCounts();

            }
        });

    }

    public String Mood(){

        int[] array = {Mood_Q1.happyCount,Mood_Q1.calmCount,Mood_Q1.annoyedCount,Mood_Q1.upsetCount,Mood_Q1.sadCount};
        int large = 0;

        for (int i = 0; i < 5; i++){
            if (array[i] > large){
                large = array[i];
            }
        }
        if (large == Mood_Q1.happyCount){
            return  "You are happy";
        }
        else if(large == Mood_Q1.calmCount){
            return "You are calm";
        }
        else if(large == Mood_Q1.annoyedCount){
            return "You are Annoyed";
        }
        else if(large == Mood_Q1.upsetCount){
            return "You are Upset";
        }
        else if(large == Mood_Q1.sadCount){
            return "You are sad";
        }
        else
            return "";

    }

    public void openMood_mainPage() {
        Intent intent = new Intent(this, Mood_main.class);
        startActivity(intent);
    }


}