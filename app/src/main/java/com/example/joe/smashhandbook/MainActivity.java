package com.example.joe.smashhandbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = new String[6];
        items[0] = "Characters";
        items[1] = "General Tech";
        items[2] = "Terms";
        items[3] = "Current PGR";
        items[4] = "Tier List";
        items[5] = "Frame Data Stats";
        ArrayAdapter<String> mainScreenAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

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




}
