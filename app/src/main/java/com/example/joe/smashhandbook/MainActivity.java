package com.example.joe.smashhandbook;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getActionBar()!=null) {
            android.app.ActionBar actionBar = getActionBar();
            actionBar.setDisplayOptions(getActionBar().DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.action_bar_custom);
            actionBar.setIcon(R.drawable.ic_info_action);
        }
        if (getSupportActionBar()!=null) { // compatible with other versions -- my phone uses this one
            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayOptions(getSupportActionBar().DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.action_bar_custom);
            actionBar.setDisplayShowHomeEnabled(true);
           // actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);

            //actionBar.setIcon(R.drawable.ic_info_outline);
        }
        //set background of action bar to a graphic
        //add MU's?

        String[] items = new String[5];
        items[0] = "Characters";
        items[1] = "General Tech";
        items[2] = "Terms";
        items[3] = "Current PGR";
        items[4] = "Tier List";
        //items[5] = "Frame Data Stats"; -- add in later. its a lot of work. listview with like: gravity, airspeed, etc. click on each and it gives ranking of characters with value for each.
        ArrayAdapter<String> mainScreenAdapter = new ArrayAdapter<String>(this, R.layout.list_item_white, R.id.list_item_white_id, items);

        ListView listview = (ListView) findViewById(R.id.am_listview);
        listview.setAdapter(mainScreenAdapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent ch_intent = new Intent(view.getContext(), Characters.class);
                    startActivity(ch_intent);
                }
                else if (position == 1) {
                    Intent tech_intent = new Intent(view.getContext(), Tech.class);
                    startActivity(tech_intent);
                }

                else if (position == 3){
                    Intent PGR_intent = new Intent(view.getContext(), PGR.class);
                    startActivity(PGR_intent);
                }


            }
        });

    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.actionbar_info_button){
            Intent intent = new Intent(this, Tech.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, Tech.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }



}
