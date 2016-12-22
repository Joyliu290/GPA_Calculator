package com.example.joyli.firstproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import android.support.v7.app.AppCompatActivity;


/**
 * Created by Joyli on 2016-12-21.
 */

public class ViewList {

    private long id;
    private String comment;

    public long getId() {
        return id;
    }

    public void setId (long id){
        this.id = id;
    }

    public String getComment(){
        return comment;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    @Override
    public String toString() {
        return comment;
    }







}
