package com.example.joe.smashhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Stages extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stages);

        Toolbar tb = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(tb);

        Button sv = (Button) findViewById(R.id.smashvilleButton);
        Button fd = (Button) findViewById(R.id.fdButton);
        Button lc = (Button) findViewById(R.id.lylatButton);
        Button dl = (Button) findViewById(R.id.dreamlandButton);
        Button tnc = (Button) findViewById(R.id.towncityButton);
        ImageButton bf = (ImageButton) findViewById(R.id.battlefieldButton);

        sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmashVille.class);
                startActivity(intent);
            }
        });

        fd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), FinalDestination.class);
                startActivity(intent);
            }
        });

        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Battlefield.class);
                startActivity(intent);
            }
        });

        tnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TownCity.class);
                startActivity(intent);
            }
        });

        dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Dreamland.class);
                startActivity(intent);
            }
        });
        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LylatCruise.class);
                startActivity(intent);
            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //this adds the icons to the action bar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, Tech.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
