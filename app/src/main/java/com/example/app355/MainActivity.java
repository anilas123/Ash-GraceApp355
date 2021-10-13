package com.example.app355;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button journal;


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
    }

    public void openJournalPage() {
        Intent intent = new Intent(this, JournalPage.class);
        startActivity(intent);
    }
}