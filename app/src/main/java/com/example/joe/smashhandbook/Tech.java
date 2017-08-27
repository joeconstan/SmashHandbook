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
        tech_list[0] = "perfect pivot";
        tech_list[1] = "instant ledge wall jump";
        tech_list[2] = "shield drop";
        tech_list[3] = "foxtrot";
        tech_list[4] = "dash dance";
        tech_list[5] = "extended dash dancing";
        tech_list[6] = "2 frame";
        tech_list[7] = "wall cling";
        tech_list[8] = "wall jump";
        tech_list[9] = "wavebounce";
        tech_list[10] = "instant ledge get up";
        tech_list[11] = "DI/SDI";
        tech_list[12] = "jab lock";


        ArrayAdapter<String> tech_listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tech_list);
        ListView listView2 = (ListView) findViewById(R.id.at_listvieww);
        listView2.setAdapter(tech_listAdapter);
    }
}
