package com.example.joe.smashhandbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar tb = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(tb);


        //set background of action bar to a graphic
        //add MU's?
//change
        String[] items = new String[5];
        items[0] = "Characters";
        items[1] = "General Tech";
        items[2] = "Terms";
        items[3] = "Current PGR";
        items[4] = "Tier List";

        //items[5] = "Frame Data Stats"; -- add in later. its a lot of work. listview with like: gravity, airspeed, etc. click on each and it gives ranking of characters with value for each.
        ArrayAdapter<String> mainScreenAdapter = new ArrayAdapter<String>(this, R.layout.list_item_white, R.id.list_item_white_id, items);



        }


    public void characterScreen (View v) {
        Intent intent = new Intent(v.getContext(), Characters.class);
        startActivity(intent);
    }
    public void techScreen (View v) {
        Intent intent = new Intent(v.getContext(), Tech.class);
        startActivity(intent);
    }
    public void termsScreen (View v) {
        Intent intent = new Intent(v.getContext(), Characters.class);
        startActivity(intent);
    }
    public void pgrScreen (View v) {
        Intent intent = new Intent(v.getContext(), PGR.class);
        startActivity(intent);
    }
    public void tierScreen (View v) {
        Intent intent = new Intent(v.getContext(), Characters.class);
        startActivity(intent);
    }
    public void stageScreen (View v) {
        Intent intent = new Intent(v.getContext(), Characters.class);
        startActivity(intent);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent = new Intent(this, Tech.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
