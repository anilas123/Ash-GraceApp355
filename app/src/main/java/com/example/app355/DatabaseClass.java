package com.example.app355;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DatabaseClass extends SQLiteOpenHelper {

    Context context;
    private static final String DatabaseName = "MyNotes";
    private static final int DatabaseVersion = 1;

    private static final String TableName = "mynotes";
    private static final String ColumnId = "id";
    private static final String ColumnTitle = "title";
    private static final String ColumnDescription = "description";


    public DatabaseClass(@Nullable Context context) {
        super(context, DatabaseName, null, DatabaseVersion);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TableName +
                "   (" + ColumnId + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ColumnTitle + " TEXT, " +
                ColumnDescription + " TEXT);";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TableName);

        onCreate(db);
    }

    void addNotes(String title, String description) {
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues cv=new ContentValues();

        cv.put(ColumnTitle, title);
        cv.put(ColumnDescription, description);

        long resultValue = db.insert(TableName, null, cv);

        if(resultValue == -1) {
            Toast.makeText(context, "Data Not Added", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(context, "Data Added Successfully", Toast.LENGTH_SHORT).show();
        }
    }

    Cursor readAllData() {
        String query = "SELECT * FROM " + TableName;
        SQLiteDatabase database = this.getReadableDatabase();

        Cursor cursor=null;

        if(database != null) {
            cursor = database.rawQuery(query, null);
        }
        return cursor;

    }

    void deleteAllNotes() {
        SQLiteDatabase database = this.getReadableDatabase();
        String query = "DELETE FROM " + TableName;

        database.execSQL(query);
    }
}
