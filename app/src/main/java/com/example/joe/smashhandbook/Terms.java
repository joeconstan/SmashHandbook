package com.example.joe.smashhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Terms extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
        Toolbar tb = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(tb);

        String[] terms = new String[38];
        terms[0] = "Air Dodge";
        terms[1] = "Ban";
        terms[2] = "Blastzone";
        terms[3] = "Bread & Butter";
        terms[4] = "Buff-Nerf";
        terms[5] = "Cheesed";
        terms[6] = "Counter";
        terms[7] = "Counterpick";
        terms[8] = "Crews";
        terms[9] = "Ditto - Mirror Match";
        terms[10] = "DSR - Dave's Stupid Rule";
        terms[11] = "Frame";
        terms[12] = "Frame Trap";
        terms[13] = "Gimped";
        terms[14] = "Heavy Armor";
        terms[15] = "Hitbox";
        terms[16] = "Hitstun";
        terms[17] = "Hoo Hah";
        terms[18] = "Hurtbox";
        terms[19] = "Intangibility";
        terms[20] = "Invincibility";
        terms[21] = "Ironman";
        terms[22] = "Jank";
        terms[23] = "Misfire";
        terms[24] = "Pop-Off";
        terms[25] = "Pummel";
        terms[26] = "Sheikville, Starterville";
        terms[27] = "Sourspot, sweetspot";
        terms[28] = "Stage Spike";
        terms[29] = "Stale-Fresh";
        terms[30] = "Star KO";
        terms[31] = "Super Armor";
        terms[32] = "Tilt, Smash, Special attacks";
        terms[33] = "Tomahawk";
        terms[34] = "Trade";
        terms[35] = "True Combo";
        terms[36] = "Whiff, Flub";
        terms[37] = "Whispy";

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_white, R.id.list_item_white_id, terms);
        ListView lv = (ListView) findViewById(R.id.aterms_listview);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(), TermsTemplate.class);
                intent.putExtra("term_select", position); //should this be after startactivity?
                startActivity(intent);
            }
        });
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
