package com.example.joe.smashhandbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Characters extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        String[] character_list = new String[58];
        character_list[0] = "mario";
        character_list[1] = "luigi";
        character_list[2] = "peach";
        character_list[3] = "bowser";
        character_list[4] = "link";
        character_list[5] = "zelda";
        character_list[6] = "sheik";
        character_list[7] = "ganondorf";
        character_list[8] = "meta knight";
        character_list[9] = "king dedede";
        character_list[10] = "fox";
        character_list[11] = "falco";
        character_list[12] = "lucas";
        character_list[13] = "ness";
        character_list[14] = "captain falcon";
        character_list[15] = "lucario";
        character_list[16] = "pit";
        character_list[17] = "wario";
        character_list[18] = "olimar";
        character_list[19] = "Rosalina";
        character_list[20] = "Bowser Jr.";
        character_list[21] = "Greninja";
        character_list[22] = "Robin";
        character_list[23] = "Villager";
        character_list[24] = "Little Mac";
        character_list[25] = "Wii Fit Trainer";
        character_list[26] = "Shulk";
        character_list[27] = "Cloud";
        character_list[28] = "Bayonetta";
        character_list[29] = "Mii Brawler";
        character_list[30] = "Dr Mario";
        character_list[31] = "Yoshi";
        character_list[32] = "Donkey Kong";
        character_list[33] = "Diddy Kong";
        character_list[34] = "Kirby";
        character_list[35] = "Charizard";
        character_list[36] = "Mewtwo";
        character_list[37] = "JigglyPuff";
        character_list[38] = "Pikachu";
        character_list[39] = "Toon Link";
        character_list[40] = "Samus";
        character_list[41] = "Ike";
        character_list[42] = "Marth";
        character_list[43] = "Lucina";
        character_list[44] = "Mr. G&W";
        character_list[45] = "Mega Man";
        character_list[46] = "Corrin";
        character_list[47] = "ROB";
        character_list[48] = "Sonic";
        character_list[49] = "Roy";
        character_list[50] = "ZSS";
        character_list[51] = "Palutena";
        character_list[52] = "Dark Pit";
        character_list[53] = "Ryu";
        character_list[54] = "Pac-Man";
        character_list[55] = "Duck Hunt";
        character_list[56] = "Mii Swordfighter";
        character_list[57] = "Mii Gunner";

        ArrayAdapter<String> character_listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, character_list);
        ListView listView = (ListView) findViewById(R.id.ac_listview);
        listView.setAdapter(character_listAdapter);
    }
}
