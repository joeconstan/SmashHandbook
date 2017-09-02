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
                        "(id integer primary key, name text, description text, tier text, framedatalink text)" //plus picture name or pic somehow
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
        String desc_template_1 = "Playstyle: ";
        String desc_template_2 = "Weight: "; //put these in db instead
        String desc_template_3 = "Fall Speed: ";
        desc[0] = "Playstyle: Weight: Fall Speed:  bayo is broken";
        desc[1] = "bowser is fat";
        desc[2] = "Bowser Jr.";
        desc[3] = "Captain Falcon";
        desc[4] = "Charizard";
        desc[5] = "Cloud";
        desc[6]= "Corrin";
        desc[7] = "Dark Pit";
        desc[8] = "Diddy is a great all around character who can be played aggressively or defensively. His meta has been pushed farther than many characters, though there are still many useful techniques not being used by diddy mains. His play centers around his banana, giving him great stage control and easy kill confirms. Watch ZeRo play to learn the basic bread and butter combos, and watch zinoto to see some unique combos and set ups.";
        desc[9] = "Donkey Kong has been on the rise lately, with HIKARU and Konga doing well, as well as Tweek and Larry using him as a secondary. He is a grappler through and through, and can kill most characters at extremely low percents. He does struggle at landing, though.";
        //include ding dong percents
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

        String[] framedatalink = new String[58];
        framedatalink[0] = "link";
        framedatalink[1] = "linktwo";

        for (int i=0;i<2;i++) {
            ContentValues values = new ContentValues(4);
            values.put("name", name[i]);
            values.put("description", desc[i]);
            values.put("tier", tier[i]);
            values.put("framedatalink", framedatalink[i]);
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
