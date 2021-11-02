package com.example.app355.Mood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app355.R;

public class Mood_Q7 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_q7);

        radioGroup = findViewById(R.id.radioGroup);

        textView = findViewById(R.id.Text_view_selected);

        Button buttonNext = findViewById(R.id.button_next);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);

                textView.setText("Your choice: " + radioButton.getText());

                openNextPage();
            }
        });



    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        Toast.makeText(this,"Selected Radio Button: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

    public void openNextPage() {
        Intent intent = new Intent(this, Mood_Q8.class);
        startActivity(intent);
    }
}