package com.example.joe.smashhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;



public class PGR extends BaseToolbarActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgr);


        MobileAds.initialize(this, "4A51EAF0C631CA74D07FC7762D27FCD0");
        AdView adView = (AdView) findViewById(R.id.pgrAd);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        String[] pgr_list = new String[50];
        pgr_list[0] = "ZeRo";
        pgr_list[1] = "MkLeo";
        pgr_list[2] = "Nairo";
        pgr_list[3] = "Dabuz";
        pgr_list[4] = "Ally";
        pgr_list[5] = "Larry Lurr";
        pgr_list[6] = "CaptainZack";
        pgr_list[7] = "komorikiri";
        pgr_list[8] = "Mr. R";
        pgr_list[9] = "Abadango";
        pgr_list[10] = "Salem";
        pgr_list[11] = "Tweek";
        pgr_list[12] = "VoiD";
        pgr_list[13] = "Marss";
        pgr_list[14] = "Fatality";
        pgr_list[15] = "KEN";
        pgr_list[16] = "Ranai";
        pgr_list[17] = "ESAM";
        pgr_list[18] = "Kirihara";
        pgr_list[19] = "Zinoto";
        pgr_list[20] = "ANTi";
        pgr_list[21] = "Locus";
        pgr_list[22] = "9B";
        pgr_list[23] = "Samsora";
        pgr_list[24] = "Elegant";
        pgr_list[25] = "Tsu-";
        pgr_list[26] = "Kameme";
        pgr_list[27] = "falln";
        pgr_list[28] = "MVD";
        pgr_list[29] = "Mr. E";
        pgr_list[30] = "6WX";
        pgr_list[31] = "T";
        pgr_list[32] = "Shuton";
        pgr_list[33] = "Raito";
        pgr_list[34] = "Earth";
        pgr_list[35] = "HIKARU";
        pgr_list[36] = "Ned";
        pgr_list[37] = "Rich Brown";
        pgr_list[38] = "Myran";
        pgr_list[39] = "Manny";
        pgr_list[40] = "ScAtt";
        pgr_list[41] = "NAKAT";
        pgr_list[42] = "Nietono";
        pgr_list[43] = "Javi";
        pgr_list[44] = "AC";
        pgr_list[45] = "WaDi";
        pgr_list[46] = "Edge";
        pgr_list[47] = "JK";
        pgr_list[48] = "Choco";
        pgr_list[49] = "FOW";

        ArrayAdapter<String> pgr_listadapter = new ArrayAdapter<String>(this, R.layout.list_item_white, R.id.list_item_white_id, pgr_list);
        ListView listView = (ListView) findViewById(R.id.ap_listview);
        listView.setAdapter(pgr_listadapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, Tech.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
