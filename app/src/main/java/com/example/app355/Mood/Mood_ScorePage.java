package com.example.app355.Mood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.app355.R;

public class Mood_ScorePage extends AppCompatActivity {
    Mood_Q1 moodQ1 = new Mood_Q1();

    int i = 0;

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_score_page);

        textView = findViewById(R.id.textView9);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Your mood is Happy");
            }
        });

//        i = moodQ1.getPoints();
//
//        if (i > 4 && i <= 5){
//            textView.setText("Your mood is happy");
//        }
//        else if (i >3 && i <= 4){
//            textView.setText("Your mood is calm");
//        }
//        else if (i >2 && i <= 3){
//            textView.setText("Your mood is annoyed");
//        }
//        else if (i >1 && i <= 2){
//            textView.setText("Your mood is upset");
//        }
//        else if (i >0 && i <= 1){
//            textView.setText("Your mood is sad");
//        }



    }
}