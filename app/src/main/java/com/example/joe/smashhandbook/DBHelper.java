package com.example.joe.smashhandbook;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static com.example.joe.smashhandbook.CharacterTemplate.TAG;

public class DBHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "whatever.db";
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    public void createTerms(SQLiteDatabase db){

    }

    public void createChar(SQLiteDatabase db){
        db.execSQL(
                "create table if not exists characters " +
                        "(id integer primary key, name text, description text, tier text, framedatalink text, type text, weight text, fallspeed text, players text)" //plus picture name or pic somehow
        );


        String[] name = new String[58];
        name[0] = "Bayonetta";
        name[1] = "Bowser";
        name[2] = "Bowser Jr.";
        name[3] = "Captain Falcon";
        name[4] = "Charizard";
        name[5] = "Cloud";
        name[6]= "Corrin";
        name[7] = "Dark Pit";
        name[8] = "Diddy Kong";
        name[9] = "Donkey Kong";
        name[10] = "Dr Mario";
        name[11] = "Duck Hunt";
        name[12] = "Fox";
        name[13] = "Falco";
        name[14] = "Ganondorf";
        name[15] = "Greninja";
        name[16] = "Ike";
        name[17] = "Jigglypuff";
        name[18] = "King Dedede";
        name[19] = "Kirby";
        name[20] = "Link";
        name[21] = "Little Mac";
        name[22] = "Lucario";
        name[23] = "Lucas";
        name[24] = "Lucina";
        name[25] = "Luigi";
        name[26] = "Mario";
        name[27] = "Marth";
        name[28] = "Mega Man";
        name[29] = "Meta Knight";
        name[30] = "Mewtwo";
        name[31] = "Mii Swordfighter";
        name[32] = "Mii Gunner";
        name[33] = "Mii Brawler";
        name[34] = "Mr. G&W";
        name[35] = "Ness";
        name[36] = "Olimar";
        name[37] = "Pac-Man";
        name[38] = "Palutena";
        name[39] = "Peach";
        name[40] = "Pikachu";
        name[41] = "Pit";
        name[42] = "ROB";
        name[43] = "Robin";
        name[44] = "Rosalina";
        name[45] = "Roy";
        name[46] = "Ryu";
        name[47] = "Samus";
        name[48] = "Sheik";
        name[49] = "Shulk";
        name[50] = "Sonic";
        name[51] = "Toon Link";
        name[52] = "Villager";
        name[53] = "Wario";
        name[54] = "Wii Fit Trainer";
        name[55] = "Yoshi";
        name[56] = "Zelda";
        name[57] = "ZSS";

        String[] desc = new String[58];
        desc[0] = "Bayonetta is easily the most controversial character in smash, and has seen a rise lately with players like salem, mistake, and captain zack doing exceptionally well. Her combos depend on reading SDI, but are some of the best, and it is easy to be creative with her combos. She has some specific mecahnics that no other character has.";
        //bat within and witch time in specific techs page
        desc[1] = "Bowser is a grappler, very similar to DK. At certain low percents, a grab with bowser means death for your opponent.";
        //tough guy properties, shell shock percentages.
        desc[2] = "Bowser Jr. is not a very common character, but high level play with him can be very fun to watch, and fun to pull off as well. idk man i dont know much abt this character";
        desc[3] = "Captain Falcon is one of the most exciting characters to watch- he has flashy combos and often relies on airdodge reads. However, his recovery is very linear and easy to interrupt.";
        desc[4] = "Charizard sucks.";
        desc[5] = "Cloud is clearly the best character in doubles, and top 3 in singles. He has amazing aerials, amazing movement options, and great mixups. His only staggering weakness is his short and linear recovery.";
        //snapping to ledge with upb - no vertical momentum
        desc[6]= "Corrin";
        desc[7] = "Dark Pit";
        desc[8] = "Diddy is a great all around character who can be played aggressively or defensively. His meta has been pushed farther than many characters, though there are still many useful techniques not being used by diddy mains. His play centers around his banana, giving him great stage control and easy kill confirms. Watch ZeRo play to learn the basic bread and butter combos, and watch zinoto to see some unique combos and set ups.";
        desc[9] = "Donkey Kong has been on the rise lately, with HIKARU and Konga doing well, as well as Tweek and Larry using him as a secondary. He is a grappler through and through, and can kill most characters at extremely low percents. He does struggle at landing, though.";
        //include ding dong percents in specific techs page of dk. do this for other combos like toot toot, shell shock, etc. four spikes.
        desc[10] = "Dr Mario is essentially a worse version of mario, with a shorter up special, a weaker projectile, and smaller hitboxes.";
        //fact check doc
        desc[11] = "Duck Hunt is one of the most complex characters. His neutral is very good, and his meta has been developing quickly since Raito and the Japanese Duck Hunts started competing more.";
        desc[12] = "Fox is a very solid character. He is a rushdown, pressure-heavy type, with room for creative combos relying heavily on his uptilt. He can struggle to get kills, though he has more than a few kill confirms. His uptilt is exceptionally good at catching 2-frames.";
        desc[13] = "Falco";
        desc[14] = "Ganondorf is exceptionally slow, and his moves have a lot of lag. However, he has some interesting combos, and his moves hit very hard. His upsmash has deceivingly little end lag, and can catch people off guard.";
        desc[15] = "Greninja";
        desc[16] = "Ike";
        desc[17] = "Jigglypuff is one of the worst in the game, though some don't think she belongs there. Puff has some redeeming qualities in her aerial movement, good air attacks, and highest number of jumps in the game (6). However, her ground attacks leave some to be desired. She does have true rest setups though, many of which are underused.";
        desc[18] = "King Dedede";
        desc[19] = "Kirby is a low tier(?) character with a good amount of winning matchups. Kirby has high combo ability on fast fallers, such as fox.";
        desc[20] = "Link";
        desc[21] = "Little Mac is definitely one of the most fun characters to play. His ground game is one of the best, and his frame data is ridiculous. He struggles, though, in the air and when recovering. For these reasons he currently has more than a few losing matchups.";
        desc[22] = "Lucario";
        //aura percents, doubles strat
        desc[23] = "Lucas";
        desc[24] = "Lucina is very similar to marth, with a few exceptions. Lucina has a slightly shorter reach, not because of the length of the sword, but because of the reach of her arm. Her sword has no tipper effect, and the entire length of it does the same amount of damage. So this makes spacing easier,but results in her not having moves as strong as marth's tippers.";
        desc[25] = "Luigi is represented at the highest level by only a single player. He has very low friction, and therefore relies heavily on power shielding for counterattacks. He has endless combos out of down throw";
        desc[26] = "Mario has some of the most exciting combos in the game. Most of them start with a down throw, though certain characters are able to break out of the typical combo chains. Therefore mario mains must mix up their combo strategies. He has decent kill power, but not a lot of true kill combos at any percent.";
        desc[27] = "Marth";
        desc[28] = "Mega Man";
        desc[29] = "Meta Knight";
        desc[30] = "Mewtwo";
        desc[31] = "Mii Swordfighter";
        desc[32] = "Mii Gunner";
        desc[33] = "Mii Brawler";
        desc[34] = "Mr. G&W";
        desc[35] = "Ness";
        desc[36] = "Olimar";
        desc[37] = "Pac-Man";
        desc[38] = "Palutena"; //moves with invincibility
        desc[39] = "Peach";
        desc[40] = "Pikachu";
        desc[41] = "Pit";
        desc[42] = "ROB";
        desc[43] = "Robin";
        desc[44] = "Rosalina";
        desc[45] = "Roy is traditionally a lower tier character but";
        desc[46] = "Ryu is one of the most exciting characters to use. He has long combo strings on most characters, some of which can lead to death. His dtilt and utilt lead to shoryu, and his nair combos into itself and into dair."; //street fighter inputs
        desc[47] = "Samus";
        desc[48] = "Sheik";
        desc[49] = "Shulk";
        desc[50] = "Sonic";
        desc[51] = "Toon Link";
        desc[52] = "Villager";
        desc[53] = "Wario";
        desc[54] = "Wii Fit Trainer";
        desc[55] = "Yoshi";
        desc[56] = "Zelda";
        desc[57] = "ZSS";

        String[] tier = new String[58];
        tier[0] = "S";
        tier[1] = "C";
        tier[2] = "E";
        tier[3] = "B";
        tier[4] = "E";
        tier[5] = "S";
        tier[6] = "B";
        tier[7] = "C";
        tier[8] = "S";
        tier[9] = "C";
        tier[10] = "E";
        tier[11] = "D";
        tier[12] = "A";
        tier[13] = "E";
        tier[14] = "F";
        tier[15] = "B";
        tier[16] = "D";
        tier[17] = "F";
        tier[18] = "F";
        tier[19] = "E";
        tier[20] = "D";
        tier[21] = "E";
        tier[22] = "B";
        tier[23] = "C";
        tier[24] = "B";
        tier[25] = "C";
        tier[26] = "A";
        tier[27] = "A";
        tier[28] = "B";
        tier[29] = "B";
        tier[30] = "A";
        tier[31] = "F";
        tier[32] = "F";
        tier[33] = "F";
        tier[34] = "D";
        tier[35] = "C";
        tier[36] = "C";
        tier[37] = "E";
        tier[38] = "E";
        tier[39] = "B";
        tier[40] = "B";
        tier[41] = "C";
        tier[42] = "C";
        tier[43] = "C";
        tier[44] = "A";
        tier[45] = "E";
        tier[46] = "A";
        tier[47] = "E";
        tier[48] = "S";
        tier[49] = "D";
        tier[50] = "A";
        tier[51] = "B";
        tier[52] = "B";
        tier[53] = "D";
        tier[54] = "E";
        tier[55] = "C";
        tier[56] = "F";
        tier[57] = "A";



        String[] type = new String[58];
        type[0] = "All Around";
        type[1] = "Grappler";
        type[2] = "Bowser Jr.";
        type[3] = "Read-heavy, pressure";
        type[4] = "Charizard";
        type[5] = "All Around";
        type[6]= "Corrin";
        type[7] = "Dark Pit";
        type[8] = "All Around";
        type[9] = "Grappler";
        type[10] = "Dr Mario";
        type[11] = "Duck Hunt";
        type[12] = "Rushdown, Pressurer";
        type[13] = "Falco";
        type[14] = "Read Heavy";
        type[15] = "Greninja";
        type[16] = "Ike";
        type[17] = "Jigglypuff";
        type[18] = "King Dedede";
        type[19] = "Kirby";
        type[20] = "Zoner";
        type[21] = "Little Mac";
        type[22] = "Lucario";
        type[23] = "Lucas";
        type[24] = "Lucina";
        type[25] = "Luigi";
        type[26] = "Bait & Punish, All Around";
        type[27] = "Marth";
        type[28] = "Mega Man";
        type[29] = "Meta Knight";
        type[30] = "Mewtwo";
        type[31] = "Mii Swordfighter";
        type[32] = "Mii Gunner";
        type[33] = "Mii Brawler";
        type[34] = "Mr. G&W";
        type[35] = "Ness";
        type[36] = "Olimar";
        type[37] = "Pac-Man";
        type[38] = "Palutena";
        type[39] = "Peach";
        type[40] = "Pikachu";
        type[41] = "Pit";
        type[42] = "ROB";
        type[43] = "Robin";
        type[44] = "Rosalina";
        type[45] = "Roy";
        type[46] = "Glass Canon, Pressurer";
        type[47] = "Zoner";
        type[48] = "Rushdown, All Around";
        type[49] = "Shulk";
        type[50] = "Sonic";
        type[51] = "Toon Link";
        type[52] = "Villager";
        type[53] = "Bait & Punish";
        type[54] = "Wii Fit Trainer";
        type[55] = "Rushdown";
        type[56] = "Glass Canon";
        type[57] = "ZSS";


        String[] weight = new String[58];
        weight[0] = "Featherweight";
        weight[1] = "Super Heavyweight";
        weight[2] = "Heavyweight";
        weight[3] = "Heavyweight";
        weight[4] = "Super Heavyweight";
        weight[5] = "Heavyweight";
        weight[6]= "Middleweight";
        weight[7] = "Middleweight";
        weight[8] = "Middleweight";
        weight[9] = "Super Heavyweight";
        weight[10] = "Middleweight";
        weight[11] = "Middleweight";
        weight[12] = "Featherweight";
        weight[13] = "Featherweight";
        weight[14] = "Super Heavyweight";
        weight[15] = "Middleweight";
        weight[16] = "Heavyweight";
        weight[17] = "Balloonweight";
        weight[18] = "Super Heavyweight";
        weight[19] = "Featherweight";
        weight[20] = "Heavyweight";
        weight[21] = "Featherweight";
        weight[22] = "Heavyweight";
        weight[23] = "Middleweight";
        weight[24] = "Middleweight";
        weight[25] = "Middleweight";
        weight[26] = "Middleweight";
        weight[27] = "Middleweight";
        weight[28] = "Heavyweight";
        weight[29] = "Featherweight";
        weight[30] = "Balloonweight";
        weight[31] = "Heavyweight";
        weight[32] = "Heavyweight";
        weight[33] = "Heavyweight";
        weight[34] = "Featherweight";
        weight[35] = "Middleweight";
        weight[36] = "Featherweight";
        weight[37] = "Middleweight";
        weight[38] = "Middleweight";
        weight[39] = "Middleweight";
        weight[40] = "Featherweight";
        weight[41] = "Middleweight";
        weight[42] = "Heavyweight";
        weight[43] = "Middleweight";
        weight[44] = "Featherweight";
        weight[45] = "Middleweight";
        weight[46] = "Heavyweight";
        weight[47] = "Heavyweight";
        weight[48] = "Featherweight";
        weight[49] = "Heavyweight";
        weight[50] = "Middleweight";
        weight[51] = "Middleweight";
        weight[52] = "Middleweight";
        weight[53] = "Heavyweight";
        weight[54] = "Middleweight";
        weight[55] = "Heavyweight";
        weight[56] = "Featherweight";
        weight[57] = "Featherweight";


        String[] fallspeed = new String[58];
        fallspeed[0] = "Fast";
        fallspeed[1] = "Slow";
        fallspeed[2] = "Fast";
        fallspeed[3] = "Fast";
        fallspeed[4] = "Slow";
        fallspeed[5] = "Fast";
        fallspeed[6]= "Fast";
        fallspeed[7] = "Medium";
        fallspeed[8] = "Fast";
        fallspeed[9] = "Medium";
        fallspeed[10] = "Medium";
        fallspeed[11] = "Medium";
        fallspeed[12] = "Fast";
        fallspeed[13] = "Fast";
        fallspeed[14] = "Medium";
        fallspeed[15] = "Fast";
        fallspeed[16] = "Fast";
        fallspeed[17] = "Slow";
        fallspeed[18] = "Fast";
        fallspeed[19] = "Slow";
        fallspeed[20] = "Medium";
        fallspeed[21] = "Fast";
        fallspeed[22] = "Fast";
        fallspeed[23] = "Slow";
        fallspeed[24] = "Medium";
        fallspeed[25] = "Slow";
        fallspeed[26] = "Medium";
        fallspeed[27] = "Medium";
        fallspeed[28] = "Fast";
        fallspeed[29] = "Fast";
        fallspeed[30] = "Medium";
        fallspeed[31] = "Medium";
        fallspeed[32] = "Slow";
        fallspeed[33] = "Fast";
        fallspeed[34] = "Slow";
        fallspeed[35] = "Slow";
        fallspeed[36] = "Slow";
        fallspeed[37] = "Slow";
        fallspeed[38] = "Slow";
        fallspeed[39] = "Slow";
        fallspeed[40] = "Medium";
        fallspeed[41] = "Medium";
        fallspeed[42] = "Medium";
        fallspeed[43] = "Medium";
        fallspeed[44] = "Slow";
        fallspeed[45] = "Fast";
        fallspeed[46] = "Medium";
        fallspeed[47] = "Slow";
        fallspeed[48] = "Fast";
        fallspeed[49] = "Medium";
        fallspeed[50] = "Medium";
        fallspeed[51] = "Slow";
        fallspeed[52] = "Slow";
        fallspeed[53] = "Medium";
        fallspeed[54] = "Slow";
        fallspeed[55] = "Slow";
        fallspeed[56] = "Slow";
        fallspeed[57] = "Fast";


        String[] players = new String[58];
        players[0] = "Salem, Captain Zack, Mistake, 9B, Pink Fresh";
        players[1] = "Nairo, DeluxeMenu, LordMix";
        players[2] = "Tweek, ?";
        players[3] = "Fatality, ?";
        players[4] = "MkLeo, Sharpyzard, ?";
        players[5] = "MkLeo, Tweek, Komorikiri, ?";
        players[6]= "Ryuga, Cosmos, MkLeo";
        players[7] = "Earth, ?";
        players[8] = "Zero, MVD, Zinoto, Edge, Nietono, ?";
        players[9] = "Tweek, Larry Lurr, Konga, HIKARU, ?";
        players[10] = "Dr Mario";
        players[11] = "Raito, You3, Brood, ?";
        players[12] = "Larry Lurr, XZAX, ZD, Light, NAKAT, ?";
        players[13] = "Keitaro, AC";
        players[14] = "8 Inches, Rickles, Bizarro Flame, ?";
        players[15] = "phazezero guy, ";
        players[16] = "Ryuga, Ryo, Izaw, ?";
        players[17] = "Leet, Puffmaster (? the one from mexico), ?";
        players[18] = "Girthquake, Big D, ?";
        players[19] = "Kirby";
        players[20] = "T, ?";
        players[21] = "CagT, Sol, way more";
        players[22] = "Marss, MkLeo, Tsu- or ~, ?, Goma";
        players[23] = "Mekos, Taiheita (sp?), ?";
        players[24] = "Mr. E, Zero, Nairo, Pugwest, ?";
        players[25] = "Elegant, Mr. ConCon, ?";
        players[26] = "Anti, Zenyou, Ally";
        players[27] = "Mr. E, MkLeo, Pugwest, ";
        players[28] = "Kameme, scAtt, ?";
        players[29] = "Abadango, MkLeo, ?";
        players[30] = "Abadango, Rich Brown, WaDi, ?";
        players[31] = "Mii Swordfighter";
        players[32] = "Mii Gunner";
        players[33] = "Mii Brawler";
        players[34] = "Kossismoss, Game7a1, GIMR, ?";
        players[35] = "FOW, ?";
        players[36] = "DaBuz, Shuton, ?";
        players[37] = "Pac-Man";
        players[38] = "TLTC, Prince Ramen, ?";
        players[39] = "Peach";
        players[40] = "ESAM, Captain L I think or maybe Q, Rideau, ?";
        players[41] = "Earth, ?";
        players[42] = "Raffi-X, 8Bitman, ?";
        players[43] = "Dath, Nairo, ?";
        players[44] = "DaBuz, Kirihara, falln, ?";
        players[45] = "Hyper, ?";
        players[46] = "Locus, Trela :(, Venom, Takera, 1 more";
        players[47] = "ESAM, IcyMist, 1 more";
        players[48] = "Mr. R, v0id (sp?), Nietono, Kameme, lots more";
        players[49] = "Nicko, kome, ?";
        players[50] = "Komorikiri, KEN, wrath, ?";
        players[51] = "Hyuga, MkLeo maybe, Zan, missin one";
        players[52] = "Ranai (sp?), JGH or whatever, ?";
        players[53] = "Gluttony, ?";
        players[54] = "John Numbers, Captain Zack, ?";
        players[55] = "Sky, Raptor, ?";
        players[56] = "Purple Guy, one more";
        players[57] = "Nairo, Marss, quik, choco, ?";


       /* String[] framedatalink = new String[58];
        framedatalink[0] = "link";
        framedatalink[1] = "linktwo";*/

        for (int i=0;i<58;i++) {
            ContentValues values = new ContentValues(7);
            values.put("name", name[i]);
            values.put("description", desc[i]);
            values.put("tier", tier[i]);
            //values.put("framedatalink", framedatalink[i]);
            values.put("weight", weight[i]);
            values.put("type", type[i]);
            values.put("fallspeed", fallspeed[i]);
            values.put("players", players[i]);
            db.insert("characters", null, values);
        }


    }

    /*public String getTableAsString(SQLiteDatabase db, String tableName) {
        String tableString = String.format("Table %s:\n", tableName);
        Cursor allRows = db.rawQuery("SELECT * FROM " + tableName, null);
        if (allRows.moveToFirst()) {
            String[] columnNames = allRows.getColumnNames();
            do {
                for (String name : columnNames) {
                    tableString += String.format("%s: %s\n", name,
                            allRows.getString(allRows.getColumnIndex(name)));
                }
                tableString += "\n";

            } while (allRows.moveToNext());
        }

        return tableString;
    }*/

    public DBHelper(Context context){
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



}
