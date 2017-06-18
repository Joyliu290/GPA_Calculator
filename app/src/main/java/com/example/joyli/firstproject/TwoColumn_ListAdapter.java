package com.example.joyli.firstproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TwoColumn_ListAdapter extends ArrayAdapter<User> {

    private LayoutInflater mInflater;
    private ArrayList<User> users; //the objects to represent in the ListView
    private int mViewResrouceId;


    public TwoColumn_ListAdapter(Context context, int resource, ArrayList<User> users) {
        super(context, resource, users);
        this.users = users;
        mInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResrouceId = resource;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        convertView = mInflater.inflate(mViewResrouceId, null);

        User user = users.get(position);

        if (user!=null){
            TextView Entry4 = (TextView) convertView.findViewById(R.id.textEntry);
            TextView GPA5 = (TextView) convertView.findViewById(R.id.textGPA);

            if (Entry4 !=null) {
                Entry4.setText(user.getEntry());
            }

            if (GPA5!= null) {
                GPA5.setText(user.getGPA2()); //sets the text to be displayed
            }

        }

        return convertView;
    }

}