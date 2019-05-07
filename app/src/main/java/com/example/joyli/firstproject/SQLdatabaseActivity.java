package com.example.joyli.firstproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.Log;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

//Created by Joy on 2016-12-22

public class SQLdatabaseActivity extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "mylist.db";
    public static final String TABLE_NAME = "mylist_data";
    public static final String DATE = "date";
    public static final String COL_2 = "ITEM1";

    public SQLdatabaseActivity (Context context) {
        super(context, DATABASE_NAME, null, 1);}

    @Override
    public void onCreate(SQLiteDatabase db) { //called when the database is created for the first time. This iswehre the creation of tables and the initial population of the tables should happen

        String createTable = "CREATE TABLE " + TABLE_NAME + "(" +DATE+ " TEXT,"+ COL_2 + " TEXT);";
        db.execSQL(createTable);
        Log.v("Database table", "Table created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);

        onCreate(db);
    }

    public boolean addData (String date, String gpa) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DATE, date);
        contentValues.put(COL_2, gpa);
        long result = db.insert(TABLE_NAME, null, contentValues);
        Log.e("DATABASE", "one row is inserted");
        if (result == -1) {
            return false;
        }
        else {
            return true;
        }
    }

    public Cursor getListContents () {
        SQLiteDatabase db = this.getWritableDatabase(); //create and/ore open a database that will be used for reading and writing
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return data;
    }
}


