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
    /*
     * Declaration of the instance variables most of them are private
     * Counts are static b/c we will pass it to Mood_ScorePage.java
     */

    private TextView questions;

    private AppCompatButton option1, option2, option3, option4, option5;
    private AppCompatButton nextBtn,prevBtn;

    private List<QuestionsList> questionsLists;
    private int currentQuestionPosition = 0;

    private String selectedOptionByUser = "";

    public static int happyCount = 0;
    public static int calmCount = 0;
    public static int annoyedCount = 0;
    public static int upsetCount = 0;
    public static int sadCount = 0;


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
        prevBtn = findViewById(R.id.prevBtn);

        questionsLists = QuestionBank.getQuestionList();

        /*
         * Setting the first question and answer options
         */
        questions.setText(questionsLists.get(0).getQuestion());
        option1.setText(questionsLists.get(0).getOption1());
        option2.setText(questionsLists.get(0).getOption2());
        option3.setText(questionsLists.get(0).getOption3());
        option4.setText(questionsLists.get(0).getOption4());
        option5.setText(questionsLists.get(0).getOption5());

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()) {

                    selectedOptionByUser = option1.getText().toString();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                    option1.setBackgroundColor(1);
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()) {

                    selectedOptionByUser = option2.getText().toString();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                    option2.setBackgroundColor(1);
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()) {

                    selectedOptionByUser = option3.getText().toString();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                    option3.setBackgroundColor(1);
                }
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()) {

                    selectedOptionByUser = option4.getText().toString();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                    option4.setBackgroundColor(1);
                }
            }
        });

        option5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()) {

                    selectedOptionByUser = option5.getText().toString();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                    option5.setBackgroundColor(1);
                }
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()) {
                    Toast.makeText(Mood_Q1.this, "Please select an option", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Mood_Q1.this, "Selected answer: " + selectedOptionByUser, Toast.LENGTH_SHORT).show();
                    getPoints();
                    changeNextQuestion();
                }


            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePrevQuestion();
                deletePoints();
            }
        });
    }

    /*
     * This method will increment the current question position in the questions list
     * And changes the questions and answer options to a new one
     */
    private void changeNextQuestion() {
        currentQuestionPosition++;

        if ((currentQuestionPosition + 1) == questionsLists.size()) {
            nextBtn.setText("Submit");
        }

        if (currentQuestionPosition < questionsLists.size()) {
            selectedOptionByUser = "";

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


        } else {
            Intent intent = new Intent(Mood_Q1.this, Mood_ScorePage.class);
            startActivity(intent);
        }
    }

    /*
     * This method will decrement the current question position by 1
     * And changes question and answer options back to the previous one
     */
    private void changePrevQuestion() {
        currentQuestionPosition--;

        if (currentQuestionPosition < questionsLists.size()) {
            selectedOptionByUser = "";

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


        } else {
            Intent intent = new Intent(Mood_Q1.this, Mood_main.class);
            startActivity(intent);
        }
    }

    /*
     * This method will count how many times each option was selected
     */
    private void getPoints() {

        //Storing the user selected answer and different possible answers
        final String getUserSelectedAnswer = questionsLists.get(currentQuestionPosition).getUserSelectedAnswer();
        final String getHappy = questionsLists.get(currentQuestionPosition).getHappy();
        final String getCalm = questionsLists.get(currentQuestionPosition).getCalm();
        final String getAnnoyed = questionsLists.get(currentQuestionPosition).getAnnoyed();
        final String getUpset = questionsLists.get(currentQuestionPosition).getUpset();
        final String getSad = questionsLists.get(currentQuestionPosition).getSad();

        if (getUserSelectedAnswer.equals(getHappy)) {
            happyCount++;
        } else if (getUserSelectedAnswer.equals(getCalm)) {
            calmCount++;
        } else if (getUserSelectedAnswer.equals(getAnnoyed)) {
            annoyedCount++;
        } else if (getUserSelectedAnswer.equals(getUpset)) {
            upsetCount++;
        } else if (getUserSelectedAnswer.equals(getSad)) {
            sadCount++;
        }


    }

    /*
     * This method is designed for changePrevQuestion()
     * It will delete the counted option when we go back to previous question
     */
    private void deletePoints() {

        final String getUserSelectedAnswer = questionsLists.get(currentQuestionPosition).getUserSelectedAnswer();
        final String getHappy = questionsLists.get(currentQuestionPosition).getHappy();
        final String getCalm = questionsLists.get(currentQuestionPosition).getCalm();
        final String getAnnoyed = questionsLists.get(currentQuestionPosition).getAnnoyed();
        final String getUpset = questionsLists.get(currentQuestionPosition).getUpset();
        final String getSad = questionsLists.get(currentQuestionPosition).getSad();

        if (getUserSelectedAnswer.equals(getHappy)) {
            happyCount--;
        } else if (getUserSelectedAnswer.equals(getCalm)) {
            calmCount--;
        } else if (getUserSelectedAnswer.equals(getAnnoyed)) {
            annoyedCount--;
        } else if (getUserSelectedAnswer.equals(getUpset)) {
            upsetCount--;
        } else if (getUserSelectedAnswer.equals(getSad)) {
            sadCount--;
        }


    }

    /*
     * This method is designed for when the user retakes the quiz
     * it will clean out all the counts
     */
    static void clearCounts(){
        happyCount = 0;
        calmCount = 0;
        annoyedCount = 0;
        upsetCount = 0;
        sadCount = 0;
    }
}


