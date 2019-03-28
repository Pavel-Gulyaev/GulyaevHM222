package com.example.gulyaevhm2_2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu_main, menu);
       return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {

            Intent intentNotes = new Intent(this, NotesActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.action_money) {

            Intent intentNotes = new Intent(this, MoneyActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.action_countries) {

            Intent intentNotes = new Intent(this, CountriesActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.action_dates) {

            Intent intentNotes = new Intent(this, DatesActivity.class);
            startActivity(intentNotes);
            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
