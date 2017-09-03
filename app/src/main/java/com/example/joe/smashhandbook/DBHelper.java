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
        db.execSQL(
                "create table characters " +
                        "(id integer primary key, name text, description text, tier text, framedatalink text, type text, weight text, fallspeed text)" //plus picture name or pic somehow
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
        //include ding dong percents in specific techs page of dk. do this for other combos like toot toot, shell shock, etc.
        desc[10] = "Dr Mario is essentially a worse version of mario, with a shorter up special, a weaker projectile, and smaller hitboxes.";
        //fact check doc
        desc[11] = "Duck Hunt is one of the most complex characters. His neutral is very good, and his meta has been developing quickly since Raito and the Japanese Duck Hunts started competing more.";
        desc[12] = "Fox is a very solid character. He is a rushdown, pressure-heavy type, with room for creative combos relying heavily on his uptilt. He can struggle to get kills, though he has more than a few kill confirms. His uptilt is exceptionally good at catching 2-frames.";
        desc[13] = "Falco";
        desc[14] = "Ganondorf is exceptionally slow, and his moves have a lot of lag. However, he has some interesting combos, and his moves hit very hard. His upsmash has deceivingly little end lag, and can catch people off guard.";
        desc[15] = "Greninja";
        desc[16] = "Ike";
        desc[17] = "Jigglypuff";
        desc[18] = "King Dedede";
        desc[19] = "Kirby";
        desc[20] = "Link";
        desc[21] = "Little Mac";
        desc[22] = "Lucario";
        desc[23] = "Lucas";
        desc[24] = "Lucina";
        desc[25] = "Luigi";
        desc[26] = "Mario";
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
        desc[38] = "Palutena";
        desc[39] = "Peach";
        desc[40] = "Pikachu";
        desc[41] = "Pit";
        desc[42] = "ROB";
        desc[43] = "Robin";
        desc[44] = "Rosalina";
        desc[45] = "Roy";
        desc[46] = "Ryu";
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
        desc[0] = "S";
        desc[1] = "C";
        desc[2] = "E";
        desc[3] = "B";
        desc[4] = "E";
        desc[5] = "S";
        desc[6] = "B";
        desc[7] = "C";
        desc[8] = "S";
        desc[9] = "C";
        desc[10] = "E";
        desc[11] = "D";
        desc[12] = "A";
        desc[13] = "E";
        desc[14] = "F";
        desc[15] = "B";
        desc[16] = "D";
        desc[17] = "F";
        desc[18] = "F";
        desc[19] = "E";
        desc[20] = "D";
        desc[21] = "E";
        desc[22] = "B";
        desc[23] = "C";
        desc[24] = "B";
        desc[25] = "C";
        desc[26] = "A";
        desc[27] = "A";
        desc[28] = "B";
        desc[29] = "B";
        desc[30] = "A";
        desc[31] = "F";
        desc[32] = "F";
        desc[33] = "F";
        desc[34] = "D";
        desc[35] = "C";
        desc[36] = "C";
        desc[37] = "E";
        desc[38] = "E";
        desc[39] = "B";
        desc[40] = "B";
        desc[41] = "C";
        desc[42] = "C";
        desc[43] = "C";
        desc[44] = "A";
        desc[45] = "E";
        desc[46] = "A";
        desc[47] = "E";
        desc[48] = "S";
        desc[49] = "D";
        desc[50] = "A";
        desc[51] = "B";
        desc[52] = "B";
        desc[53] = "D";
        desc[54] = "E";
        desc[55] = "C";
        desc[56] = "F";
        desc[57] = "A";



        String[] type = new String[58];
        name[0] = "All Around";
        name[1] = "Grappler";
        name[2] = "Bowser Jr.";
        name[3] = "Read-heavy, pressure";
        name[4] = "Charizard";
        name[5] = "All Around";
        name[6]= "Corrin";
        name[7] = "Dark Pit";
        name[8] = "All Around";
        name[9] = "Grappler";
        name[10] = "Dr Mario";
        name[11] = "Duck Hunt";
        name[12] = "Rushdown, Pressurer";
        name[13] = "Falco";
        name[14] = "Read Heavy";
        name[15] = "Greninja";
        name[16] = "Ike";
        name[17] = "Jigglypuff";
        name[18] = "King Dedede";
        name[19] = "Kirby";
        name[20] = "Zoner";
        name[21] = "Little Mac";
        name[22] = "Lucario";
        name[23] = "Lucas";
        name[24] = "Lucina";
        name[25] = "Luigi";
        name[26] = "Bait & Punish, All Around";
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
        name[46] = "Glass Canon, Pressurer";
        name[47] = "Zoner";
        name[48] = "Rushdown, All Around";
        name[49] = "Shulk";
        name[50] = "Sonic";
        name[51] = "Toon Link";
        name[52] = "Villager";
        name[53] = "Bait & Punish";
        name[54] = "Wii Fit Trainer";
        name[55] = "Rushdown";
        name[56] = "Glass Canon";
        name[57] = "ZSS";


        String[] weight = new String[58];
        name[0] = "Featherweight";
        name[1] = "Super Heavyweight";
        name[2] = "Heavyweight";
        name[3] = "Heavyweight";
        name[4] = "Super Heavyweight";
        name[5] = "Heavyweight";
        name[6]= "Middleweight";
        name[7] = "Middleweight";
        name[8] = "Middleweight";
        name[9] = "Super Heavyweight";
        name[10] = "Middleweight";
        name[11] = "Middleweight";
        name[12] = "Featherweight";
        name[13] = "Featherweight";
        name[14] = "Super Heavyweight";
        name[15] = "Middleweight";
        name[16] = "Heavyweight";
        name[17] = "Balloonweight";
        name[18] = "Super Heavyweight";
        name[19] = "Featherweight";
        name[20] = "Heavyweight";
        name[21] = "Featherweight";
        name[22] = "Heavyweight";
        name[23] = "Middleweight";
        name[24] = "Middleweight";
        name[25] = "Middleweight";
        name[26] = "Middleweight";
        name[27] = "Middleweight";
        name[28] = "Heavyweight";
        name[29] = "Featherweight";
        name[30] = "Balloonweight";
        name[31] = "Heavyweight";
        name[32] = "Heavyweight";
        name[33] = "Heavyweight";
        name[34] = "Featherweight";
        name[35] = "Middleweight";
        name[36] = "Featherweight";
        name[37] = "Middleweight";
        name[38] = "Middleweight";
        name[39] = "Middleweight";
        name[40] = "Featherweight";
        name[41] = "Middleweight";
        name[42] = "Heavyweight";
        name[43] = "Middleweight";
        name[44] = "Featherweight";
        name[45] = "Middleweight";
        name[46] = "Heavyweight";
        name[47] = "Heavyweight";
        name[48] = "Featherweight";
        name[49] = "Heavyweight";
        name[50] = "Middleweight";
        name[51] = "Middleweight";
        name[52] = "Middleweight";
        name[53] = "Heavyweight";
        name[54] = "Middleweight";
        name[55] = "Heavyweight";
        name[56] = "Featherweight";
        name[57] = "Featherweight";


        String[] fallspeed = new String[58];
        name[0] = "Fast";
        name[1] = "Slow";
        name[2] = "Fast";
        name[3] = "Fast";
        name[4] = "Slow";
        name[5] = "Fast";
        name[6]= "Fast";
        name[7] = "Medium";
        name[8] = "Fast";
        name[9] = "Medium";
        name[10] = "Medium";
        name[11] = "Medium";
        name[12] = "Fast";
        name[13] = "Fast";
        name[14] = "Medium";
        name[15] = "Fast";
        name[16] = "Fast";
        name[17] = "Slow";
        name[18] = "Fast";
        name[19] = "Slow";
        name[20] = "Medium";
        name[21] = "Fast";
        name[22] = "Fast";
        name[23] = "Slow";
        name[24] = "Medium";
        name[25] = "Slow";
        name[26] = "Medium";
        name[27] = "Medium";
        name[28] = "Fast";
        name[29] = "Fast";
        name[30] = "Medium";
        name[31] = "Medium";
        name[32] = "Slow";
        name[33] = "Fast";
        name[34] = "Slow";
        name[35] = "Slow";
        name[36] = "Slow";
        name[37] = "Slow";
        name[38] = "Slow";
        name[39] = "Slow";
        name[40] = "Medium";
        name[41] = "Medium";
        name[42] = "Medium";
        name[43] = "Medium";
        name[44] = "Slow";
        name[45] = "Fast";
        name[46] = "Medium";
        name[47] = "Slow";
        name[48] = "Fast";
        name[49] = "Medium";
        name[50] = "Medium";
        name[51] = "Slow";
        name[52] = "Slow";
        name[53] = "Medium";
        name[54] = "Slow";
        name[55] = "Slow";
        name[56] = "Slow";
        name[57] = "Fast";


        String[] framedatalink = new String[58];
        framedatalink[0] = "link";
        framedatalink[1] = "linktwo";

        for (int i=0;i<58;i++) {
            ContentValues values = new ContentValues(6);
            values.put("name", name[i]);
            values.put("description", desc[i]);
            values.put("tier", tier[i]);
            //values.put("framedatalink", framedatalink[i]);
            values.put("weight", weight[i]);
            values.put("type", type[i]);
            values.put("fallspeed", fallspeed[i]);
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
