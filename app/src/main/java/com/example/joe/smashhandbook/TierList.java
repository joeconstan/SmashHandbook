package com.example.joe.smashhandbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;


public class TierList extends BaseToolbarActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tierlist);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}

