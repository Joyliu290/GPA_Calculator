package com.example.joyli.firstproject;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


import android.support.v7.app.AppCompatActivity;

import org.w3c.dom.Text;


/**
 * Created by Joyli on 2016-12-21.
 */

public class ViewList extends AppCompatActivity {

   SQLdatabaseActivity myDB;
    ArrayList<User> userList;
    User user;

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);

        ListView listview = (ListView) findViewById(R.id.listview);
        myDB = new SQLdatabaseActivity(this);

        //Header for ListView
        TextView textView = new TextView(this);
        textView.setText("\n"+"     Date of Entry                    Calculated GPA"); //sets the header
        textView.setTypeface(null, Typeface.BOLD);
        listview.addHeaderView(textView); //adds the header

        //populate an ArrayList<String> from the database and then view it
        userList = new ArrayList<>();
        Cursor data = myDB.getListContents();
        int numRows = data.getCount();
        if (numRows==0) {
            Toast.makeText(this, "There are no contents in this list!", Toast.LENGTH_LONG).show();
        }
        else {
            int i =0;
            while (data.moveToNext()) { //returns a boolean value
                user = new User(data.getString(0), data.getString(1));
                userList.add(i, user);
                System.out.println(data.getString(0)+ "" + data.getString(1));
                System.out.println(userList.get(i).getEntry());
                i++;
            }

            TwoColumn_ListAdapter adapter = new TwoColumn_ListAdapter(this,R.layout.activity_array_list_columns,userList);
             listview.setAdapter(adapter);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        setIconInMenu(menu, R.id.action_home, R.string.action_home, R.mipmap.home);
        setIconInMenu(menu, R.id.action_database, R.string.action_database, R.mipmap.diskette);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_home) {
            Intent home = new Intent (getApplicationContext(),MainActivity.class);
            startActivity(home);
            return true;
        }

        else if (id == R.id.action_database){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void setIconInMenu(Menu menu, int menuItemId, int labelId, int iconId){
        MenuItem item = menu.findItem(menuItemId);
        SpannableStringBuilder builder = new SpannableStringBuilder(" "+getResources().getString(labelId));
        builder.setSpan(new ImageSpan(this, iconId), 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        item.setTitle(builder);
    }
}
