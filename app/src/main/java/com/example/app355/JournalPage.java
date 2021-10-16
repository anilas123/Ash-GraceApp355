package com.example.app355;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JournalPage extends AppCompatActivity {

    private Button prompts;
    private Button free_write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal_page);

        prompts = findViewById(R.id.prompts);
        prompts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPromptsPage();
            }
        });

        free_write = findViewById(R.id.free_write);
        free_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFreeWritePage();
            }
        });
    }

    public void openPromptsPage() {
        Intent intent = new Intent(this, PromptsActivity.class);
        startActivity(intent);
    }

    public void openFreeWritePage() {
        Intent intent = new Intent(this, FreewriteActivity.class);
        startActivity(intent);
    }
}