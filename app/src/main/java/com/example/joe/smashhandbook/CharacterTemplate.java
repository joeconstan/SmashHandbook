package com.example.joe.smashhandbook;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class CharacterTemplate extends AppCompatActivity{

    final static String TAG = "test: ";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        int sel = bundle.getInt("char_select");
        DBHelper db = new DBHelper(this);
        SQLiteDatabase sqLiteDatabase = db.getReadableDatabase();
        //Log.v(TAG, db.getTableAsString(sqLiteDatabase, "characters"));


    }


}
