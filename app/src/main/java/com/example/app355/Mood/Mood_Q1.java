package com.example.app355.Mood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
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
    private TextView textView;


    private AppCompatButton option1,option2,option3,option4,option5;
    private AppCompatButton nextBtn;

    private List<QuestionsList> questionsLists;
    private int currentQuestionPosition = 0;

    private String selectedOptionByUser = "";



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

        textView = findViewById(R.id.Text_view_selected);

        questionsLists = QuestionBank.getQuestionList();

        questions.setText(questionsLists.get(0).getQuestion());
        option1.setText(questionsLists.get(0).getOption1());
        option2.setText(questionsLists.get(0).getOption2());
        option3.setText(questionsLists.get(0).getOption3());
        option4.setText(questionsLists.get(0).getOption4());
        option5.setText(questionsLists.get(0).getOption5());

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option1.getText().toString();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option2.getText().toString();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option3.getText().toString();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);


                }
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option4.getText().toString();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);


                }
            }
        });

        option5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option5.getText().toString();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);


                }
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()){
                    Toast.makeText(Mood_Q1.this, "Please select an option", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Mood_Q1.this, "Selected answer: " + selectedOptionByUser, Toast.LENGTH_SHORT).show();
                    changeNextQuestion();
                }

            }
        });
    }


    private void changeNextQuestion(){
        currentQuestionPosition++;

        if ((currentQuestionPosition+1) == questionsLists.size()){
            nextBtn.setText("Submit");
        }

        if (currentQuestionPosition < questionsLists.size()){
            selectedOptionByUser="";

            option1.setBackgroundResource(R.drawable.round_button_color);
            option1.setTextColor(Color.parseColor("#000000"));

            option2.setBackgroundResource(R.drawable.round_button_color);
            option2.setTextColor(Color.parseColor("#000000"));

            option3.setBackgroundResource(R.drawable.round_button_color);
            option3.setTextColor(Color.parseColor("#000000"));

            option4.setBackgroundResource(R.drawable.round_button_color);
            option4.setTextColor(Color.parseColor("#000000"));

            option5.setBackgroundResource(R.drawable.round_button_color);
            option5.setTextColor(Color.parseColor("#000000"));

            questions.setText(questionsLists.get(currentQuestionPosition).getQuestion());
            option1.setText(questionsLists.get(currentQuestionPosition).getOption1());
            option2.setText(questionsLists.get(currentQuestionPosition).getOption2());
            option3.setText(questionsLists.get(currentQuestionPosition).getOption3());
            option4.setText(questionsLists.get(currentQuestionPosition).getOption4());
            option5.setText(questionsLists.get(currentQuestionPosition).getOption5());

        }
        else{
            Intent intent = new Intent(Mood_Q1.this,Mood_ScorePage.class);
            startActivity(intent);
        }
    }



    public int getPoints(){

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