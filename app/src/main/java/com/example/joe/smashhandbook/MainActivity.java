package com.example.joe.smashhandbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tb = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(tb);


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
