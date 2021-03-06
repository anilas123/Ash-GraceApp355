package com.example.app355.Mood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.Random;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.app355.Calendar;
import com.example.app355.MainActivity;
import com.example.app355.R;

import java.util.List;

public class Mood_ScorePage extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    private AppCompatButton saveBtn,retakeBtn,backBtn,clickMeBtn,shareBtn;
    private List<MotivationList> happyLines,calmLines,annoyedLines,upsetLines,sadLines;

    Random rand = new Random();
    final int MAX = 5;
    private int currentPosition = rand.nextInt(MAX);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_score_page);

        textView = findViewById(R.id.textView9);
        saveBtn = findViewById(R.id.save);
        retakeBtn = findViewById(R.id.retakeButton);
        backBtn = findViewById(R.id.backButton);
        clickMeBtn = findViewById(R.id.clickMe);
        shareBtn = findViewById(R.id.shareButton);

        imageView = (ImageView) findViewById(R.id.image_view);

        happyLines = MotivationBank.getHappyLines();
        calmLines = MotivationBank.getCalmLines();
        annoyedLines = MotivationBank.getAnnoyedLines();
        upsetLines = MotivationBank.getUpsetLines();
        sadLines = MotivationBank.getSadLines();

        showMoodResult();

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

        clickMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMotivationLines();
            }
        });

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareResult();
            }
        });

    }

    /*
     * For different moods system will show user different pictures
     */
    private void showMoodResult() {
        if (Mood().equalsIgnoreCase(" glad to see you are happy!")){
            imageView.setImageResource(R.drawable.happy);
            textView.setText("Hey! " + Mood_main.name + Mood());
        }
        else if(Mood().equalsIgnoreCase(" I'm glad you are calm!")){
            imageView.setImageResource(R.drawable.calm);
            textView.setText("Hey! " + Mood_main.name + Mood());
        }
        else if(Mood().equalsIgnoreCase(" you might be a little annoyed!")){
            imageView.setImageResource(R.drawable.imag4);
            textView.setText("Hey! " + Mood_main.name + Mood());
        }
        else if(Mood().equalsIgnoreCase(" calm down, you are kinda upset!")){
            imageView.setImageResource(R.drawable.imag4);
            textView.setText("Hey! " + Mood_main.name + Mood());
        }
        else if(Mood().equalsIgnoreCase(" you might be sad!")){
            imageView.setImageResource(R.drawable.rsz_1rsz_11sad);
            textView.setText("I'm sorry " + Mood_main.name + Mood());
        }
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
            return " glad to see you are happy!";
        }
        else if(large == Mood_Q1.calmCount){
            return " I'm glad you are calm!";
        }
        else if(large == Mood_Q1.annoyedCount){
            return " you might be a little annoyed!";
        }
        else if(large == Mood_Q1.upsetCount){
            return " calm down, you are kinda upset!";
        }
        else if(large == Mood_Q1.sadCount){
            return " you might be sad!";
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

    private void setMotivationLines(){

        if (Mood().equalsIgnoreCase(" you might be sad!")){
            textView.setText(sadLines.get(currentPosition).getLines());
            textView.setTextColor(Color.parseColor("#f8b703"));

        }else if(Mood().equalsIgnoreCase(" calm down, you are kinda upset!")){
            textView.setText(upsetLines.get(currentPosition).getLines());
            textView.setTextColor(Color.parseColor("#f8b703"));

        }else if(Mood().equalsIgnoreCase(" you might be a little annoyed!")){
            textView.setText(annoyedLines.get(currentPosition).getLines());
            textView.setTextColor(Color.parseColor("#f8b703"));

        }else if(Mood().equalsIgnoreCase(" I'm glad you are calm!")){
            textView.setText(calmLines.get(currentPosition).getLines());
            textView.setTextColor(Color.parseColor("#f8b703"));

        }else{
            textView.setText(happyLines.get(currentPosition).getLines());
            textView.setTextColor(Color.parseColor("#f8b703"));

        }
    }

    private void shareResult()
    {
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Hey! I just did my MoodCheck. " + "\nCome check it out and find your mood for today!";
        String shareSub = "Your Subject here";
        myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));
    }


}