package com.example.android.myappportfolio1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //get ButtonId from xml and class showMsg method
        Button idButton = (Button) findViewById(R.id.bSpotyfyStreamer);
        idButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMsg(v);
            }
        });
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
    public void showMsg(View gBottonID){
        Context context = getApplicationContext();
        CharSequence text = null;

        //Display Toast as per button click_event

        switch (gBottonID.getId()){
            case R.id.bSpotyfyStreamer:
                text = "This button will lauch SPORTYFY STEAMER!";
                break;
            case R.id.bScoresApp:
                text = "This button will lauch SCORES APP!";
                break;
            case R.id.bLibraryApp:
                text = "This button will lauch LIBRARY APP!";
                break;
            case R.id.bBuiltItBiger:
                text = "This button will lauch BUILT IT BIGGER!";
                break;
            case R.id.bXyzReader:
                text = "This button will lauch XYZ READER!";
                break;
            case R.id.bCapstone:
                text = "This button will lauch CAPSTONE APP!";
                break;
        }
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
  }
