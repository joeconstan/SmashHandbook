package com.example.joe.smashhandbook;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


public abstract class BaseToolbarActivity extends AppCompatActivity {


    protected final void onCreate(Bundle savedInstanceState, int layoutId)
    {
        super.onCreate(savedInstanceState);
        setContentView(layoutId);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(myToolbar);
    }


    public void infoClick(View view){
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Credit to:\n2gg, VGBootCamp, TimmyTims, Master0fHyrule, BeefySmashDoods, SSBWiki, UnrivaledTournaments, MySmashCorner, Locus, Smashboards").setCancelable(true).setPositiveButton(
                "Close",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        builder1.create().show();
    }

    public void settingsClick(View view){startActivity(new Intent(view.getContext(), AppSettings.class));}
}
