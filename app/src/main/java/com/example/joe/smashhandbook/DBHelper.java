package com.example.joe.smashhandbook;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "whatever.db";
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table characters " +
                        "(id integer primary key, name text, description text, tier text, framedatalink text)" //plus picture name or pic somehow
        );
        ContentValues values = new ContentValues(4);
        values.put("name", "Bayonetta");
        values.put("description", "bayo is broken");
        values.put("tier", "SS");
        values.put("framedatalink", "link");
        db.insert("characters", null, values);
    }
    public DBHelper(Context context){
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



}
