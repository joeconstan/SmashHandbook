package com.example.joe.smashhandbook;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tech extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);

        String[] tech_list = new String[13];
        tech_list[0] = "Perfect Pivot";
        tech_list[1] = "Jab Lock";
        tech_list[2] = "Shield Drop";
        tech_list[3] = "Foxtrot";
        tech_list[4] = "Dash Dance";
        tech_list[5] = "Extended Dash Dancing";
        tech_list[6] = "2 Frame";
        tech_list[7] = "Wall Cling";
        tech_list[8] = "Wall Jump";
        tech_list[9] = "Wavebounce";
        tech_list[10] = "Instant Ledge Get Up";
        tech_list[11] = "DI/SDI";
        tech_list[12] = "Instant ledge wall jump"; //ally does this in locus' analysis stream


        ArrayAdapter<String> tech_listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tech_list);
        ListView listView = (ListView) findViewById(R.id.at_listview);
        listView.setAdapter(tech_listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent zero_intent = new Intent(view.getContext(), PerfectPivot.class);
                        startActivity(zero_intent);
                        break;
                    case 1:
                        Intent one_intent = new Intent(view.getContext(), JabLock.class);
                        startActivity(one_intent);
                    default:
                        break;
                }
            }
        });
    }
}
