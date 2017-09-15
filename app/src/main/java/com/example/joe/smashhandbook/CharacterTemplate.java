package com.example.joe.smashhandbook;


import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CharacterTemplate extends AppCompatActivity{

    final static String TAG = "test: ";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_template);
        Toolbar tb = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(tb);
        getSupportActionBar().setTitle(" ");
        Bundle bundle = getIntent().getExtras();
        int sel = bundle.getInt("char_select");
        sel++;
        String selstr = Integer.toString(sel);
        DBHelper db = new DBHelper(this);

        SQLiteDatabase sqLiteDatabase = db.getWritableDatabase();

        db.createChar(sqLiteDatabase);
        String tableName = "characters";
        String selection = "id=?";
        Cursor results = sqLiteDatabase.query(tableName, null, selection, new String[] {selstr}, null, null, null);
        results.moveToFirst();
        TextView tier = (TextView) findViewById(R.id.character_tier);
        // TextView character_name = (TextView) findViewById(R.id.character_name);
        TextView desc_plays = (TextView) findViewById(R.id.character_desc_playstyle);
        ImageView char_pic = (ImageView) findViewById(R.id.character_image);
        Button spec_tech_button = (Button) findViewById(R.id.character_spec_tech);

        String descStr = "Playstyle: "+ results.getString(results.getColumnIndex("type")) + " \nWeight: " + results.getString(results.getColumnIndex("weight")) + "\nFallspeed: " + results.getString(results.getColumnIndex("fallspeed")) + "\n\n";
        String tierData = results.getString(results.getColumnIndex("tier"));
        String nameData = results.getString(results.getColumnIndex("name"));
        String descData = results.getString(results.getColumnIndex("description"));

        //char_pic.setImageResource(R.drawable.charizard);
        getSupportActionBar().setTitle(nameData);
        tier.setText("Tier:" + tierData);
        desc_plays.setText(descStr + descData);
        spec_tech_button.setText(nameData + " Specific Tech");

        //get the name of picture and set it as drawable resource
        Context context = char_pic.getContext();
        String picname = "@drawable/" + results.getString(results.getColumnIndex("picture"));
        Log.v(TAG, picname);
        int id = context.getResources().getIdentifier(picname, "drawable", context.getPackageName());
        char_pic.setImageResource(id);
        results.close();

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, Tech.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}