package com.example.joe.smashhandbook;


import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class CharacterTemplate extends AppCompatActivity{

    final static String TAG = "test: ";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_template);
        Bundle bundle = getIntent().getExtras();
        int sel = bundle.getInt("char_select");
        sel++;
        String selstr = Integer.toString(sel);
        //Log.v(TAG, sel);
        DBHelper db = new DBHelper(this);
        SQLiteDatabase sqLiteDatabase = db.getReadableDatabase();
        //Log.v(TAG, db.getTableAsString(sqLiteDatabase, "characters"));

        String tableName = "characters";
        String selection = "id=?";
        //String[] selectionArgs = new String[1];
        //selectionArgs[0] = sel;
        Cursor results = sqLiteDatabase.query(tableName, null, selection, new String[] {selstr}, null, null, null);
        results.moveToFirst();
        TextView tier = (TextView) findViewById(R.id.character_tier);
        String dataa = results.getString(results.getColumnIndex("tier"));
        tier.setText(dataa);
        results.close();
    }



}
