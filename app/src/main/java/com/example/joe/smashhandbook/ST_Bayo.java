package com.example.joe.smashhandbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ST_Bayo extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spectech_template);
        String[] techlist = new String[2];
        techlist[0] = "Bat Within";
        techlist[1] = "Witch Time";

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_white,R.id.list_item_white_id, techlist);
        ListView listView = (ListView) findViewById(R.id.st_list);
        listView.setAdapter(adapter);


    }
}
