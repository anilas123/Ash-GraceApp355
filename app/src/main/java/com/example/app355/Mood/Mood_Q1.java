package com.example.app355.Mood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app355.R;

import java.util.ArrayList;
import java.util.List;

public class Mood_Q1 extends AppCompatActivity {
    private TextView questions;


    private AppCompatButton option1,option2,option3,option4,option5;
    private AppCompatButton nextBtn;

    private final List<QuestionsList> questionsLists = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_q1);


        questions = findViewById(R.id.questions);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        option5 = findViewById(R.id.option5);
        nextBtn = findViewById(R.id.nextBtn);

    }

    private int getPoints(){

        int points = 0;

        for (int i = 0; i < questionsLists.size(); i++){

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getHappy = questionsLists.get(i).getHappy();
            final String getCalm = questionsLists.get(i).getCalm();
            final String getAnnoyed = questionsLists.get(i).getAnnoyed();
            final String getUpset = questionsLists.get(i).getUpset();
            final String getSad = questionsLists.get(i).getSad();

            if (getUserSelectedAnswer.equals(getHappy)){
                points+=5;
            }else if(getUserSelectedAnswer.equals(getCalm)){
                points+=4;
            }else if(getUserSelectedAnswer.equals(getAnnoyed)){
                points+=3;
            }else if(getUserSelectedAnswer.equals(getUpset)){
                points+=2;
            }else if(getUserSelectedAnswer.equals(getSad)){
                points+=1;
            }

        }

        return points;
    }

//        radioGroup = findViewById(R.id.radioGroup);
//
//        textView = findViewById(R.id.Text_view_selected);
//
//        Button buttonNext = findViewById(R.id.button_next);
//        buttonNext.setOnClickListener(new View.OnClickListener() {
//                                          @Override
//                                          public void onClick(View v) {
//                                              int radioId = radioGroup.getCheckedRadioButtonId();
//                                              radioButton = findViewById(radioId);
//
//                                              textView.setText("Your choice: " + radioButton.getText());
//
//                                              openNextPage();
//                                          }
//                                      });
//
//
//
//    }
//
//    public void checkButton(View v){
//        int radioId = radioGroup.getCheckedRadioButtonId();
//        radioButton = findViewById(radioId);
//
//        Toast.makeText(this,"Selected Radio Button: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
//    }
//
//    public void openNextPage() {
//        Intent intent = new Intent(this, Mood_Q2.class);
//        startActivity(intent);
        // }

}