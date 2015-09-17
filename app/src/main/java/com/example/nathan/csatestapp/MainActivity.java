package com.example.nathan.csatestapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button eButton1 = (Button)findViewById(R.id.ebutton);
        Button fButton2 = (Button) findViewById(R.id.ebutton);
        final MediaPlayer mpE = MediaPlayer.create(this, raw.scalee);
        final MediaPlayer mpF = MediaPlayer.create(this, raw.scalef);
        eButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpE.seekTo(0);
                Log.e("Main Activity", "E Button clicked");
                mpE.start();
            }
        });
        fButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpF.seekTo(0);
                Log.e("Main Activity", "F Button clicked");
                mpF.start();
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
}