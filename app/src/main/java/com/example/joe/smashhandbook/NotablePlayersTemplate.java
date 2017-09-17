package com.example.joe.smashhandbook;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;



public class NotablePlayersTemplate extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notable_players_template);

        Bundle bundle = getIntent().getExtras();
        String charname = bundle.getString("charname");
        DBHelper db = new DBHelper(this);
        SQLiteDatabase sqLiteDatabase = db.getReadableDatabase();
        String tableName = "characters";
        String selection = "name=?";
        String selstr = "charname";
        Cursor results = sqLiteDatabase.query(tableName, null, selection, new String[] {selstr}, null, null, null);
        results.moveToFirst();


    }
}
