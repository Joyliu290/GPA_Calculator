package com.example.joyli.firstproject;

import android.content.Intent;
/*import android.database.sqlite.SQLiteDatabase;

 */
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    SQLdatabaseActivity myDB;
    Button button_database, button_view;

    private static Button button_no;


    TextView totalview;
    EditText courseweighttxt;
    EditText coursepercentagetxt;
    EditText courseweighttxt2;
    EditText coursepercentagetxt2;
    EditText courseweighttxt3;
    EditText coursepercentagetxt3;
    EditText courseweighttxt4;
    EditText coursepercentagetxt4;
    EditText courseweighttxt5;
    EditText coursepercentagetxt5;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonListener();

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        totalview = (TextView) findViewById(R.id.totalview);

        courseweighttxt = (EditText) findViewById(R.id.courseweighttxt);
        coursepercentagetxt = (EditText) findViewById(R.id.coursepercentagetxt);
        courseweighttxt2 = (EditText) findViewById(R.id.courseweighttxt2);
        coursepercentagetxt2 = (EditText) findViewById(R.id.coursepercentagetxt2);
        courseweighttxt3 = (EditText) findViewById(R.id.courseweighttxt3);
        coursepercentagetxt3 = (EditText) findViewById(R.id.coursepercentagetxt3);
        courseweighttxt4 = (EditText) findViewById(R.id.courseweighttxt4);
        coursepercentagetxt4 = (EditText) findViewById(R.id.coursepercentagetxt4);
        courseweighttxt5 = (EditText) findViewById(R.id.courseweighttxt5);
        coursepercentagetxt5 = (EditText) findViewById(R.id.coursepercentagetxt5);

        final Button calbtn = (Button) findViewById(R.id.calbtn);
        calbtn.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {

                                          float gpv;
                                          float coursepercentage = Float.parseFloat(coursepercentagetxt.getText().toString());

                                          if (coursepercentage >= 50 && coursepercentage <= 52) {

                                              gpv = 7;
                                          } else if (coursepercentage > 52 && coursepercentage <= 56) {
                                              gpv = 10;
                                          } else if (coursepercentage > 56 && coursepercentage <= 59) {
                                              gpv = 13;
                                          } else if (coursepercentage > 59 && coursepercentage <= 62) {
                                              gpv = 17;
                                          } else if (coursepercentage > 62 && coursepercentage <= 66) {
                                              gpv = 20;
                                          } else if (coursepercentage > 66 && coursepercentage <= 69) {
                                              gpv = 23;
                                          } else if (coursepercentage > 69 && coursepercentage <= 72) {
                                              gpv = 27;
                                          } else if (coursepercentage > 72 && coursepercentage <= 76) {
                                              gpv = 30;
                                          } else if (coursepercentage > 76 && coursepercentage <= 79) {
                                              gpv = 33;
                                          } else if (coursepercentage > 79 && coursepercentage <= 84) {
                                              gpv = 37;
                                          } else {
                                              gpv = 40;
                                          }

                                          float courseweight = Float.parseFloat(courseweighttxt.getText().toString());
                                          float total = courseweight * gpv / 10;

                                          float coursepercentage2 = Float.parseFloat(coursepercentagetxt2.getText().toString());

                                          if (coursepercentage2 >= 50 && coursepercentage2 <= 52) {

                                              gpv = 7;
                                          } else if (coursepercentage2 > 52 && coursepercentage2 <= 56) {
                                              gpv = 10;
                                          } else if (coursepercentage2 > 56 && coursepercentage2 <= 59) {
                                              gpv = 13;
                                          } else if (coursepercentage2 > 59 && coursepercentage2 <= 62) {
                                              gpv = 17;
                                          } else if (coursepercentage2 > 62 && coursepercentage2 <= 66) {
                                              gpv = 20;
                                          } else if (coursepercentage2 > 66 && coursepercentage2 <= 69) {
                                              gpv = 23;
                                          } else if (coursepercentage2 > 69 && coursepercentage2 <= 72) {
                                              gpv = 27;
                                          } else if (coursepercentage2 > 72 && coursepercentage2 <= 76) {
                                              gpv = 30;
                                          } else if (coursepercentage2 > 76 && coursepercentage2 <= 79) {
                                              gpv = 33;
                                          } else if (coursepercentage2 > 79 && coursepercentage2 <= 84) {
                                              gpv = 37;
                                          } else {
                                              gpv = 40;
                                          }

                                          float courseweight2 = Float.parseFloat(courseweighttxt2.getText().toString());
                                          float total2 = courseweight2 * gpv / 10;


                                          float coursepercentage3 = Float.parseFloat(coursepercentagetxt3.getText().toString());

                                          if (coursepercentage3 >= 50 && coursepercentage3 <= 52) {

                                              gpv = 7;
                                          } else if (coursepercentage3 > 52 && coursepercentage3 <= 56) {
                                              gpv = 10;
                                          } else if (coursepercentage3 > 56 && coursepercentage3 <= 59) {
                                              gpv = 13;
                                          } else if (coursepercentage3 > 59 && coursepercentage3 <= 62) {
                                              gpv = 17;
                                          } else if (coursepercentage3 > 62 && coursepercentage3 <= 66) {
                                              gpv = 20;
                                          } else if (coursepercentage3 > 66 && coursepercentage3 <= 69) {
                                              gpv = 23;
                                          } else if (coursepercentage3 > 69 && coursepercentage3 <= 72) {
                                              gpv = 27;
                                          } else if (coursepercentage3 > 72 && coursepercentage3 <= 76) {
                                              gpv = 30;
                                          } else if (coursepercentage3 > 76 && coursepercentage3 <= 79) {
                                              gpv = 33;
                                          } else if (coursepercentage3 > 79 && coursepercentage3 <= 84) {
                                              gpv = 37;
                                          } else {
                                              gpv = 40;
                                          }

                                          float courseweight3 = Float.parseFloat(courseweighttxt3.getText().toString());
                                          float total3 = courseweight3 * gpv / 10;


                                          float coursepercentage4 = Float.parseFloat(coursepercentagetxt4.getText().toString());

                                          if (coursepercentage4 >= 50 && coursepercentage4 <= 52) {

                                              gpv = 7;
                                          } else if (coursepercentage4 > 52 && coursepercentage4 <= 56) {
                                              gpv = 10;
                                          } else if (coursepercentage4 > 56 && coursepercentage4 <= 59) {
                                              gpv = 13;
                                          } else if (coursepercentage4 > 59 && coursepercentage4 <= 62) {
                                              gpv = 17;
                                          } else if (coursepercentage4 > 62 && coursepercentage4 <= 66) {
                                              gpv = 20;
                                          } else if (coursepercentage4 > 66 && coursepercentage4 <= 69) {
                                              gpv = 23;
                                          } else if (coursepercentage4 > 69 && coursepercentage4 <= 72) {
                                              gpv = 27;
                                          } else if (coursepercentage4 > 72 && coursepercentage4 <= 76) {
                                              gpv = 30;
                                          } else if (coursepercentage4 > 76 && coursepercentage4 <= 79) {
                                              gpv = 33;
                                          } else if (coursepercentage4 > 79 && coursepercentage4 <= 84) {
                                              gpv = 37;
                                          } else {
                                              gpv = 40;
                                          }

                                          float courseweight4 = Float.parseFloat(courseweighttxt4.getText().toString());
                                          float total4 = courseweight4 * gpv / 10;


                                          float coursepercentage5 = Float.parseFloat(coursepercentagetxt5.getText().toString());

                                          if (coursepercentage5 >= 50 && coursepercentage5 <= 52) {

                                              gpv = 7;
                                          } else if (coursepercentage5 > 52 && coursepercentage5 <= 56) {
                                              gpv = 10;
                                          } else if (coursepercentage5 > 56 && coursepercentage5 <= 59) {
                                              gpv = 13;
                                          } else if (coursepercentage5 > 59 && coursepercentage5 <= 62) {
                                              gpv = 17;
                                          } else if (coursepercentage5 > 62 && coursepercentage5 <= 66) {
                                              gpv = 20;
                                          } else if (coursepercentage5 > 66 && coursepercentage5 <= 69) {
                                              gpv = 23;
                                          } else if (coursepercentage5 > 69 && coursepercentage5 <= 72) {
                                              gpv = 27;
                                          } else if (coursepercentage5 > 72 && coursepercentage5 <= 76) {
                                              gpv = 30;
                                          } else if (coursepercentage5 > 76 && coursepercentage5 <= 79) {
                                              gpv = 33;
                                          } else if (coursepercentage5 > 79 && coursepercentage5 <= 84) {
                                              gpv = 37;
                                          } else {
                                              gpv = 40;
                                          }

                                          float courseweight5 = Float.parseFloat(courseweighttxt5.getText().toString());
                                          float total5 = courseweight5 * gpv / 10;

                                          float totalweight = courseweight + courseweight2 + courseweight3 + courseweight4 + courseweight5;
                                          float sum = (total + total2 + total3 + total4 + total5) / totalweight;

                                          totalview.setText(Float.toString(sum));
                                      }



                                  }
        );


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        //"this" is the reference to current object
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    public void onClickButtonListener() {

        myDB = new SQLdatabaseActivity(this);

        button_database = (Button) findViewById(R.id.button_database);

        button_database.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newEntry = totalview.getText().toString();
                if (totalview.length() != 0) {
                    AddData(newEntry);
                    totalview.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "CALCULATION ERROR!", Toast.LENGTH_LONG).show();
                }


            }});


        button_view = (Button) findViewById(R.id.button_view);
        button_view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent viewlist = new Intent ("com.example.joyli.firstproject.ViewList");
                        startActivity(viewlist);
                    }
                }
        );

        button_no = (Button) findViewById(R.id.button_no);
        button_no.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick (View v) {
                        Intent exit_screen = new Intent ("com.example.joyli.firstproject.Exitscreen");
                        startActivity(exit_screen);
                    }
                }
        );
    }

    public void AddData (String newEntry) {
        boolean insertData = myDB.addData(newEntry);

        if (insertData ==true) {

            Toast.makeText(this, "Data Successfully Inserted!", Toast.LENGTH_LONG).show();
        }
            else {

                Toast.makeText(this, "Something went wrong",Toast.LENGTH_LONG).show();
            }

        }
    }




