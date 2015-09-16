package com.example.nathan.csatestapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textOut = (TextView)findViewById(R.id.textView);
        School[] schools = {new School("California Institute of Technology",	5),
                new School("Carnegie Mellon University",	4),
                new School("Georgia Institute of Technology",	6),
                new School("Massachusetts Institute of Technology",	1),
                new School("Purdue University—West Lafayette",6),
                new School("University of California—Berkeley",3),
                new School("University of Illinois—Urbana-Champaign",	6),
                new School("University of Michigan—Ann Arbor",	6),
                new School("University of Southern California",	10),
                new School("Stanford University",2)};
        int toprank=0;
        String topschool = "";
        int ties = 0;
        for (School s: schools) {
            textOut.append(s.name + "\n");
            //finds the top rank
            if (s.rank < toprank || toprank == 0) {
                toprank = s.rank;
                topschool = s.name;
            }
            for (School s2 : schools) {
                if (s.rank == s2.rank) {
                    ties++;
                }
            }
        }
        ties = ties/2;
        textOut.append(Integer.toString(toprank));
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