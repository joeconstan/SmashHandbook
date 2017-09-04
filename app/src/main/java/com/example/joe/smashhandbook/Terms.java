package com.example.joe.smashhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Terms extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
        Toolbar tb = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(tb);

        String[] terms = new String[37];
        terms[0] = "Air Dodge";
        terms[1] = "Pop-Off";
        terms[2] = "Ban";
        terms[3] = "Blastzone";
        terms[4] = "True Combo";
        terms[5] = "Buff-Nerf";
        terms[6] = "Bread & Butter";
        terms[7] = "Counter";
        terms[8] = "Counterpick";
        terms[9] = "Crews";
        terms[10] = "DSR - Dave's Stupid Rule";
        terms[11] = "Hoo Hah";
        terms[12] = "Intangibility";
        terms[13] = "Invincibility";
        terms[14] = "Super Armor";
        terms[15] = "Heavy Armor";
        terms[16] = "";
        terms[16] = "Ditto - Mirror Match";
        terms[17] = "Cheesed";
        terms[18] = "Gimped";
        terms[19] = "Sheikville, Starterville";
        terms[20] = "Whiff, Flub";
        terms[21] = "Frame";
        terms[22] = "Hitstun";
        terms[23] = "Hitbox";
        terms[24] = "Hurtbox";
        terms[25] = "Ironman";
        terms[26] = "Jank";
        terms[27] = "Misfire";
        terms[28] = "Pummel";
        terms[29] = "Star KO";
        terms[30] = "Sourspot, sweetspot";
        terms[31] = "stage spike";
        terms[32] = "stale-fresh";
        terms[33] = "Frame Trap";
        terms[34] = "Tilt, Smash, Special attacks";
        terms[35] = "Tomahawk";
        terms[36] = "Trade";

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_white, R.id.list_item_white_id, terms);
        ListView lv = (ListView) findViewById(R.id.aterms_listview);
        lv.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //this adds the icons to the action bar
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
