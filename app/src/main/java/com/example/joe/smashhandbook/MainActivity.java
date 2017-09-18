package com.example.joe.smashhandbook;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends BaseToolbarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new AdRequest.Builder().addTestDevice("4A51EAF0C631CA74D07FC7762D27FCD0").build();

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

}
