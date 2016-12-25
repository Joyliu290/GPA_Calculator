package com.example.joyli.firstproject;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


import android.support.v7.app.AppCompatActivity;


/**
 * Created by Joyli on 2016-12-21.
 */

public class ViewList extends AppCompatActivity {

   SQLdatabaseActivity myDB;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqldatabase);

        ListView listview = (ListView) findViewById(R.id.listview);
        myDB = new SQLdatabaseActivity(this);

        //populate an ArrayList<String> from the database and then view it
        ArrayList<String>theList = new ArrayList<>();
        Cursor data = myDB.getListContents();
        if (data.getCount()==0) {
            Toast.makeText(this, "There are no contents in this list!", Toast.LENGTH_LONG).show();

        }
        else {
            while (data.moveToNext()) {
                theList.add(data.getString(1));
                ListAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, theList);
                listview.setAdapter(listAdapter);
            }
        }
    }







}
