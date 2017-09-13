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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class Characters extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        Toolbar tb = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(tb);

        MobileAds.initialize(this, "4A51EAF0C631CA74D07FC7762D27FCD0");
        AdView adView = (AdView) findViewById(R.id.charactersAd);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        String[] character_list = new String[58];

        character_list[0] = "Bayonetta";
        character_list[1] = "Bowser";
        character_list[2] = "Bowser Jr.";
        character_list[3] = "Captain Falcon";
        character_list[4] = "Charizard";
        character_list[5] = "Cloud";
        character_list[6]= "Corrin";
        character_list[7] = "Dark Pit";
        character_list[8] = "Diddy Kong";
        character_list[9] = "Donkey Kong";
        character_list[10] = "Dr Mario";
        character_list[11] = "Duck Hunt";
        character_list[12] = "Fox";
        character_list[13] = "Falco";
        character_list[14] = "Ganondorf";
        character_list[15] = "Greninja";
        character_list[16] = "Ike";
        character_list[17] = "Jigglypuff";
        character_list[18] = "King Dedede";
        character_list[19] = "Kirby";
        character_list[20] = "Link";
        character_list[21] = "Little Mac";
        character_list[22] = "Lucario";
        character_list[23] = "Lucas";
        character_list[24] = "Lucina";
        character_list[25] = "Luigi";
        character_list[26] = "Mario";
        character_list[27] = "Marth";
        character_list[28] = "Mega Man";
        character_list[29] = "Meta Knight";
        character_list[30] = "Mewtwo";
        character_list[31] = "Mii Swordfighter";
        character_list[32] = "Mii Gunner";
        character_list[33] = "Mii Brawler";
        character_list[34] = "Mr. G&W";
        character_list[35] = "Ness";
        character_list[36] = "Olimar";
        character_list[37] = "Pac-Man";
        character_list[38] = "Palutena";
        character_list[39] = "Peach";
        character_list[40] = "Pikachu";
        character_list[41] = "Pit";
        character_list[42] = "ROB";
        character_list[43] = "Robin";
        character_list[44] = "Rosalina";
        character_list[45] = "Roy";
        character_list[46] = "Ryu";
        character_list[47] = "Samus";
        character_list[48] = "Sheik";
        character_list[49] = "Shulk";
        character_list[50] = "Sonic";
        character_list[51] = "Toon Link";
        character_list[52] = "Villager";
        character_list[53] = "Wario";
        character_list[54] = "Wii Fit Trainer";
        character_list[55] = "Yoshi";
        character_list[56] = "Zelda";
        character_list[57] = "ZSS";

        ArrayAdapter<String> character_listAdapter = new ArrayAdapter<String>(this, R.layout.list_item_white,R.id.list_item_white_id, character_list);
        ListView listView = (ListView) findViewById(R.id.ac_listview);
        listView.setAdapter(character_listAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(), CharacterTemplate.class);
                intent.putExtra("char_select", position);
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