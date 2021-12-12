package com.example.app355;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class FreewriteActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton fab;
    FreewriteAdapter adapter;
    List<NotesModel> notesList;
    DatabaseClass databaseClass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freewrite);

        recyclerView = findViewById(R.id.fwRecyclerView);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FreewriteActivity.this, AddNotesActivity.class);
                startActivity(intent);

            }
        });

        notesList = new ArrayList<>();

        databaseClass = new DatabaseClass(this);
        fetchNotes();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new FreewriteAdapter(this, FreewriteActivity.this, notesList);
        recyclerView.setAdapter(adapter);

    }

    void fetchNotes() {
        Cursor cursor = databaseClass.readAllData();

        if (cursor.getCount() == 0) {
            Toast.makeText(this, "No Data To Display", Toast.LENGTH_SHORT).show();
        }
        else {
            while (cursor.moveToNext()) {
                notesList.add(new NotesModel(cursor.getString(0), cursor.getString(1), cursor.getString(2)));
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.options_menu,menu);

        MenuItem searchItem=menu.findItem(R.id.searchbar);
        SearchView searchView= (SearchView) searchItem.getActionView();
        searchView.setQueryHint("Search Notes Here");

        SearchView.OnQueryTextListener listener=new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return true;
            }
        };

        searchView.setOnQueryTextListener(listener);

        return super.onCreateOptionsMenu(menu);
    }
}