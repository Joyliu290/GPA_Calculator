package com.example.joyli.firstproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }


}


