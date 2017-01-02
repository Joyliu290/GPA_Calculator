package com.example.joyli.firstproject;

/**
 * Created by Joyli on 2017-01-02.
 */

public class User {

    private String ID;
    private String GPA2;

    public User (String Entry, String GPA) {

        ID = Entry;
        GPA2 = GPA;

    }

    public String getEntry(){
        return ID;

    }

    public void setEntry (String Entry2){
        ID = Entry2;
    }

    public String getGPA2() {
        return GPA2;
    }

    public void setGPA2 (String GPA3 ){

        GPA2 = GPA3;
    }
}
