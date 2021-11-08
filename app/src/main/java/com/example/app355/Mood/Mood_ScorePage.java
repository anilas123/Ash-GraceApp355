package com.example.app355.Mood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.app355.R;

public class Mood_ScorePage extends AppCompatActivity {


    int i = 0;

    private TextView textView;
    private Button button;
    private String string = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_score_page);

        textView = findViewById(R.id.textView9);
        button = findViewById(R.id.button);

        textView.setText(Mood(string));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public String Mood(String string){
        i = Mood_Q1.totalPoints / 7;

        if (i >4 || i <= 5){
            string = "You are happy";
        }
        else if (i >3 || i <= 4){
            string = "You are calm";
        }
        else if (i >2 || i <= 3){
            string = "You are annoyed";
        }
        else if (i >1 || i <= 2){
            string = "You are upset";
        }
        else if (i >0 || i <= 1){
            string = "You are sad";
        }
        return string;
    }
}