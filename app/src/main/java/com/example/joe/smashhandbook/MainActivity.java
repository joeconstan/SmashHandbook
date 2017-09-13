package com.example.joe.smashhandbook;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity{

    final static String TAG = "test: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdRequest request = new AdRequest.Builder().addTestDevice("4A51EAF0C631CA74D07FC7762D27FCD0")
                .build();

        Boolean ans = request.isTestDevice(this);
        if (ans)
            Log.v(TAG, "all good");


        Toolbar tb = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(tb);

        MobileAds.initialize(this, "4A51EAF0C631CA74D07FC7762D27FCD0");

        AdView adView = (AdView) findViewById(R.id.bannerAd);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }


    public void characterScreen (View v) {
        Intent intent = new Intent(v.getContext(), Characters.class);
        startActivity(intent);
    }
    public void techScreen (View v) {
        Intent intent = new Intent(v.getContext(), Tech.class);
        startActivity(intent);
    }
    public void termsScreen (View v) {
        Intent intent = new Intent(v.getContext(), Terms.class);
        startActivity(intent);
    }
    public void pgrScreen (View v) {
        Intent intent = new Intent(v.getContext(), PGR.class);
        startActivity(intent);
    }
    public void tierScreen (View v) {
        Intent intent = new Intent(v.getContext(), TierList.class);
        startActivity(intent);
    }
    public void stageScreen (View v) {
        Intent intent = new Intent(v.getContext(), Stages.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //this adds the icons to the action bar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //if (item.getItemId()==R.id.toolbar_info_button) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Credit to:\n2gg, VGBootCamp, TimmyTims, Master0fHyrule, BeefySmashDoods, UnrivaledTournaments, MySmashCorner, Locus, Smashboards");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Close",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });


        AlertDialog alert11 = builder1.create();
        alert11.show();
        //}
        return super.onOptionsItemSelected(item);
    }
}
