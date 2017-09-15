package com.example.joe.smashhandbook;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class TermsTemplate extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_template);

        Bundle bundle = getIntent().getExtras();
        int sel = (bundle.getInt("term_select"))+1;
        String selstr = Integer.toString(sel);
        Toolbar tb = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(tb);

        DBHelper db = new DBHelper(this);
        SQLiteDatabase sqLiteDatabase = db.getWritableDatabase();
        db.createTerms(sqLiteDatabase);

        TextView tvtitle = (TextView) findViewById(R.id.termstemplatetitle);
        TextView tvdesc = (TextView) findViewById(R.id.termstemplatedescription);
        String tableName = "terms";
        String selection = "id=?";
        Cursor results = sqLiteDatabase.query(tableName, null, selection, new String[] {selstr}, null, null, null);
        results.moveToFirst();

        tvtitle.setText(results.getString(results.getColumnIndex("termname")));
        tvdesc.setText(results.getString(results.getColumnIndex("termdescription")));

        results.close();

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, Tech.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
