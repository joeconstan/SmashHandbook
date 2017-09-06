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
        terms[5] = "Counter";
        terms[6] = "Counterpick";
        terms[7] = "Crews";
        terms[8] = "Ditto - Mirror Match";
        terms[9] = "DSR - Dave's Stupid Rule";
        terms[10] = "Frame";
        terms[11] = "Frame Trap";
        terms[12] = "Gimped";
        terms[13] = "Heavy Armor";
        terms[14] = "Hitbox";
        terms[15] = "Hitstun";
        terms[16] = "Hoo Hah";
        terms[17] = "Hurtbox";
        terms[18] = "Intangibility";
        terms[19] = "Invincibility";
        terms[20] = "Ironman";
        terms[21] = "Jank";
        terms[22] = "Misfire";
        terms[23] = "Pop-Off";
        terms[24] = "Pummel";
        terms[25] = "Rage";
        terms[26] = "Read";
        terms[27] = "Sheikville, Starterville";
        terms[28] = "Sourspot, sweetspot";
        terms[29] = "Stage Spike";
        terms[30] = "Stale-Fresh";
        terms[31] = "Star KO";
        terms[32] = "Super Armor";
        terms[33] = "Tilt, Smash, Special attacks";
        terms[34] = "Tomahawk";
        terms[35] = "Trade";
        terms[36] = "True Combo";
        terms[37] = "Whiff, Flub";
        terms[38] = "Whispy";

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
