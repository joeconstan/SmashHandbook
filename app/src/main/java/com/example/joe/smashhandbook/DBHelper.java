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


        String[] name = new String[2];
        name[0] = "bayonetta";
        name[1] = "bowser";
        String[] desc = new String[2];
        desc[0] = "bayo is broken";
        desc[1] = "bowser is fat";
        String[] tier = new String[2];
        tier[0] = "SS";
        tier[1] = "C";
        String[] framedatalink = new String[2];
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

    public String getTableAsString(SQLiteDatabase db, String tableName) {
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
    }

    public DBHelper(Context context){
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



}
