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
        Button fButton2 = (Button) findViewById(R.id.fbutton);
        final MediaPlayer mpE = MediaPlayer.create(this, R.raw.scalee);
        final MediaPlayer mpF = MediaPlayer.create(this, R.raw.scalef);
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
        Button button1 = (Button) findViewById(R.id.button);
        final MediaPlayer A = MediaPlayer.create(this, R.raw.scalea);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A.seekTo(0);
                Log.e("Main Activity", "A Button clicked");
                A.start();
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        final MediaPlayer B = MediaPlayer.create(this, R.raw.scaleb);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B.seekTo(0);
                Log.e("Main Activity", "B Button clicked");
                B.start();
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        final MediaPlayer Bb = MediaPlayer.create(this, R.raw.scalebb);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bb.seekTo(0);
                Log.e("Main Activity", "Bb Button clicked");
                Bb.start();
            }
        });
        Button button14 = (Button) findViewById(R.id.button14);
        final MediaPlayer C = MediaPlayer.create(this, R.raw.scalec);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C.seekTo(0);
                Log.e("Main Activity", "C Button clicked");
                C.start();
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        final MediaPlayer Cs = MediaPlayer.create(this, R.raw.scalecs);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cs.seekTo(0);
                Log.e("Main Activity", "C# Button clicked");
                Cs.start();
            }
        });
        Button button5 = (Button) findViewById(R.id.button5);
        final MediaPlayer D = MediaPlayer.create(this, R.raw.scaled);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D.seekTo(0);
                Log.e("Main Activity", "D Button clicked");
                D.start();
            }
        });
        Button button6 = (Button) findViewById(R.id.button6);
        final MediaPlayer Ds = MediaPlayer.create(this, R.raw.scaleds);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ds.seekTo(0);
                Log.e("Main Activity", "D# Button clicked");
                Ds.start();
            }
        });
        Button button7 = (Button) findViewById(R.id.button7);
        final MediaPlayer Fs = MediaPlayer.create(this, R.raw.scalefs);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fs.seekTo(0);
                Log.e("Main Activity", "F# Button clicked");
                Fs.start();
            }
        });
        Button button8 = (Button) findViewById(R.id.button8);
        final MediaPlayer G = MediaPlayer.create(this, R.raw.scaleg);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G.seekTo(0);
                Log.e("Main Activity", "G Button clicked");
                G.start();
            }
        });
        Button button9 = (Button) findViewById(R.id.button9);
        final MediaPlayer Gs = MediaPlayer.create(this, R.raw.scalegs);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gs.seekTo(0);
                Log.e("Main Activity", "G# Button clicked");
                Gs.start();
            }
        });
        Button button10 = (Button) findViewById(R.id.button10);
        final MediaPlayer Highe = MediaPlayer.create(this, R.raw.scalehighe);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Highe.seekTo(0);
                Log.e("Main Activity", "High E Button clicked");
                Highe.start();
            }
        });
        Button button11 = (Button) findViewById(R.id.button11);
        final MediaPlayer Highf = MediaPlayer.create(this, R.raw.scalehighf);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Highf.seekTo(0);
                Log.e("Main Activity", "High F Button clicked");
                Highf.start();
            }
        });
        Button button12 = (Button) findViewById(R.id.button12);
        final MediaPlayer Highfs = MediaPlayer.create(this, R.raw.scalehighfs);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Highfs.seekTo(0);
                Log.e("Main Activity", "High F# Button clicked");
                Highfs.start();
            }
        });
        Button button13 = (Button) findViewById(R.id.button13);
        final MediaPlayer Highg = MediaPlayer.create(this, R.raw.scalehighg);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Highg.seekTo(0);
                Log.e("Main Activity", "High G Button clicked");
                Highg.start();
            }
        });

        Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Main Activity", "Scale button clicked");
                try {
                    mpE.seekTo(0);
                    mpE.start();
                    Pause(500);
                    Fs.start();
                    Pause(500);
                    Gs.start();
                    Pause(500);
                    A.start();
                    Pause(500);
                    B.start();
                    Pause(500);
                    Cs.start();
                    Pause(500);
                    Ds.start();
                    Pause(500);
                    Highe.start();
                    Pause(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void Pause(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("Main Activity", "Error pausing");
        }
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