package com.example.joe.smashhandbook;


import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class CharacterTemplate extends BaseToolbarActivity{

    final static String TAG = "test: ";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_template);


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

        //getting all the data and setting it to the textviews etc
        TextView tier = (TextView) findViewById(R.id.character_tier);
        TextView desc_plays = (TextView) findViewById(R.id.character_desc_playstyle);
        TextView guides = (TextView) findViewById(R.id.character_guides);
        TextView guides2 = (TextView) findViewById(R.id.character_guides2);
        ImageView char_pic = (ImageView) findViewById(R.id.character_image);
        Button spec_tech_button = (Button) findViewById(R.id.character_spec_tech);
        TextView not_play = (TextView)  findViewById(R.id.char_notableplayers);
        String extradescData = "Playstyle: "+ results.getString(results.getColumnIndex("type")) + " \nWeight: " + results.getString(results.getColumnIndex("weight")) + "\nFallspeed: " + results.getString(results.getColumnIndex("fallspeed")) + "\n\n";
        String tierData = results.getString(results.getColumnIndex("tier"));
        String nameData = results.getString(results.getColumnIndex("name"));
        String descData = results.getString(results.getColumnIndex("description"));
        String not_playdata = results.getString(results.getColumnIndex("players"));
        //combining the two diff guide links
        String guidesData = results.getString(results.getColumnIndex("guides"));
        String guidesData2 = results.getString(results.getColumnIndex("guides2"));
        tier.setText("Tier:" + tierData);
        desc_plays.setText(extradescData + descData + "\n\nGuides:");
        spec_tech_button.setText(nameData + " Specific Tech");
        not_play.setText("Notable Players: " + not_playdata);
        guides.setText(guidesData);
        guides2.setText(guidesData2);
        //make guide links clickable - not sure if this is needed or not.
        guides.setMovementMethod(LinkMovementMethod.getInstance());
        guides2.setMovementMethod(LinkMovementMethod.getInstance());

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