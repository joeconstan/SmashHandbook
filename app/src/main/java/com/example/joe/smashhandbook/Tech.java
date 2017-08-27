package com.example.joe.smashhandbook;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tech extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);

        String[] tech_list = new String[13];
        tech_list[0] = "Perfect Pivot";
        tech_list[1] = "instant ledge wall jump";
        tech_list[2] = "Shield Drop";
        tech_list[3] = "Foxtrot";
        tech_list[4] = "Dash Dance";
        tech_list[5] = "Extended Dash Dancing";
        tech_list[6] = "2 Drame";
        tech_list[7] = "Wall Cling";
        tech_list[8] = "Wall Jump";
        tech_list[9] = "Wavebounce";
        tech_list[10] = "Instant Ledge Get Up";
        tech_list[11] = "DI/SDI";
        tech_list[12] = "Jab Lock";


        ArrayAdapter<String> tech_listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tech_list);
        ListView listView2 = (ListView) findViewById(R.id.at_listvieww);
        listView2.setAdapter(tech_listAdapter);
    }
}
