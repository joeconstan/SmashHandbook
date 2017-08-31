package com.example.joe.smashhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Characters extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        if (getActionBar()!=null) {
            getActionBar().setDisplayOptions(getActionBar().DISPLAY_SHOW_CUSTOM);
            getActionBar().setCustomView(R.layout.action_bar_characters);
        }
        if (getSupportActionBar()!=null) { // compatible with other versions
            getSupportActionBar().setDisplayOptions(getSupportActionBar().DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(R.layout.action_bar_characters);
        }


        String[] character_list = new String[57];

        character_list[0] = "Bayonetta"; //-> stats (wall cling, speed, gravity, etc), frame data, bayonetta specific tech, picture of bayo, matchup spread?, top bayo players.
        character_list[1] = "Bowser";
        character_list[2] = "Bowser Jr.";
        character_list[3] = "Captain Falcon";
        character_list[4] = "Charizard";
        character_list[5] = "Cloud";
        character_list[6] = "Dark Pit";
        character_list[7] = "Diddy Kong";
        character_list[8] = "Donkey Kong";
        character_list[9] = "Duck Hunt";
        character_list[10] = "Fox";
        character_list[11] = "Falco";
        character_list[12] = "Dr Mario";
        character_list[13] = "Ganondorf";
        character_list[14] = "Greninja";
        character_list[15] = "Ike";
        character_list[16] = "JigglyPuff";
        character_list[17] = "King Dedede";
        character_list[18] = "Kirby";
        character_list[19] = "Link";
        character_list[20] = "Little Mac";
        character_list[21] = "Lucario";
        character_list[22] = "Lucas";
        character_list[23] = "Lucina";
        character_list[24] = "Luigi";
        character_list[25] = "Mario";
        character_list[26] = "Marth";
        character_list[27] = "Mega Man";
        character_list[28] = "Meta Knight";
        character_list[29] = "Mewtwo";
        character_list[30] = "Mii Swordfighter";
        character_list[31] = "Mii Gunner";
        character_list[32] = "Mii Brawler";
        character_list[33] = "Mr. G&W";
        character_list[34] = "Ness";
        character_list[35] = "Olimar";
        character_list[36] = "Pac-Man";
        character_list[37] = "Palutena";
        character_list[38] = "Peach";
        character_list[39] = "Pikachu";
        character_list[40] = "Pit";
        character_list[41] = "ROB";
        character_list[42] = "Robin";
        character_list[43] = "Rosalina";
        character_list[44] = "Roy";
        character_list[45] = "Ryu";
        character_list[46] = "Samus";
        character_list[47] = "Sheik";
        character_list[48] = "Shulk";
        character_list[49] = "Sonic";
        character_list[50] = "Toon Link";
        character_list[51] = "Villager";
        character_list[52] = "Wario";
        character_list[53] = "Wii Fit Trainer";
        character_list[54] = "Yoshi";
        character_list[55] = "Zelda";
        character_list[56] = "ZSS";
        //missing one character
        //double check alphabetic order
        ArrayAdapter<String> character_listAdapter = new ArrayAdapter<String>(this, R.layout.list_item_white,R.id.list_item_white_id, character_list);
        ListView listView = (ListView) findViewById(R.id.ac_listview);
        listView.setAdapter(character_listAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(view.getContext(), CharacterTemplate.class);
                        intent.putExtra("char_select", 0);
                        startActivity(intent);

            }
        });

    }
}
