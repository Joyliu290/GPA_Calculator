package com.example.joyli.firstproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

//Created by Joy on 2016-12-22

public class SQLdatabaseActivity extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "mylist.db";
    public static final String TABLE_NAME = "mylist_data";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "ITEM1";



    public SQLdatabaseActivity (Context context) {
        super(context, DATABASE_NAME, null, 1);}


    @Override
    public void onCreate(SQLiteDatabase db) {

        String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " + " ITEM1 TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addData (String item1) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, item1);

        long result = db.insert(TABLE_NAME, null, contentValues);

        //if data is inserted incorrectly it will return a -1

        if (result == -1) {
            return false;
        }
        else {
            return true;
        }

    }

    public Cursor getListContents (){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return data;
    }




}


