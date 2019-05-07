package com.example.joyli.firstproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.joyli.firstproject.R.id.pressme;

public class WelcomeScreen extends Activity {

    private static Button pressme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        OnClickButtonListener();

    }

    public void OnClickButtonListener() {
        pressme = (Button) findViewById(R.id.pressme);
        pressme.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick (View v) {
                      Intent intent = new Intent ("com.example.joyli.firstproject.MainActivity");
                    startActivity(intent);

                    }

                }
        );

    }


}
