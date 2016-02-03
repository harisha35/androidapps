package com.example.test.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button_spotify_streamer = (Button) findViewById(R.id.button_spotify_streamer);
        button_spotify_streamer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my spotify streamer!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button_scores_app = (Button) findViewById(R.id.button_scores_app);
        button_scores_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my scores app!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button_library_app = (Button) findViewById(R.id.button_library_app);
        button_library_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my library app!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button_build_it_bigger = (Button) findViewById(R.id.button_build_it_bigger);
        button_build_it_bigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Build it Bigger app!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button_xyz_reader = (Button) findViewById(R.id.button_xyz_reader);
        button_xyz_reader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my XYZ Reader app!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button_capstone = (Button) findViewById(R.id.button_capstone);
        button_capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Capstone: My own app!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
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
