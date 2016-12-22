package com.example.joyli.firstproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SQLdatabaseActivity extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "GPA Database";
    public static final String TABLE_NAME = "GPA TABLE";
    public static final String COL_1 = "Entry";
    public static final String COL_2 = "GPA";



    public SQLdatabaseActivity (Context context) {
        super(context, DATABASE_NAME, null, 1);}


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMET." + " ITEM1 TEXT)";
        sqLiteDatabase.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS GPA" + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public boolean addData (String item1) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, item1);

        long result = db.insert(TABLE_NAME, null, contentValues);

        //if data is inserted incorrectly it will return a -1

        if (result ==-1) {
            return false;
        }
        else {
            return true;
        }

    }

    public Cursor getListContents (){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM" + TABLE_NAME, null);
        return data;
    }




}


