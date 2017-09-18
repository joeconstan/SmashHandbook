package com.example.joe.smashhandbook;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Tech extends BaseToolbarActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);


        MobileAds.initialize(this, "4A51EAF0C631CA74D07FC7762D27FCD0");
        AdView adView = (AdView) findViewById(R.id.techAd);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);



        String[] tech_list = new String[12];
        tech_list[0] = "B-Reverse";
        tech_list[1] = "Dash Dance";
        tech_list[2] = "DI";
        tech_list[3] = "Extended Dash Dancing";
        tech_list[4] = "Instant Ledge Wall Jump";
        tech_list[5] = "Jab Lock";
        tech_list[6] = "Lagless Ledge Get Up";
        tech_list[7] = "Perfect Pivot";
        tech_list[8] = "Shield Drop";
        tech_list[9] = "Two Frame";
        tech_list[10] = "Wall Cling/Jump";
        tech_list[11] = "Wavebounce";


        ArrayAdapter<String> tech_listAdapter = new ArrayAdapter<String>(this, R.layout.list_item_white, R.id.list_item_white_id, tech_list);
        ListView listView = (ListView) findViewById(R.id.at_listview);
        listView.setAdapter(tech_listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        Intent zero_intent = new Intent(view.getContext(), BReverse.class);
                        startActivity(zero_intent);
                        break;
                    case 1:
                        Intent one_intent = new Intent(view.getContext(), DashDance.class);
                        startActivity(one_intent);
                        break;
                    case 2:
                        Intent two_intent = new Intent(view.getContext(), DI.class);
                        startActivity(two_intent);
                        break;
                    case 3:
                        Intent three_intent = new Intent(view.getContext(), ExDD.class);
                        startActivity(three_intent);
                        break;
                    case 4:
                        Intent four_intent = new Intent(view.getContext(), ILWJ.class);
                        startActivity(four_intent);
                        break;
                    case 5:
                        Intent five_intent = new Intent(view.getContext(), JabLock.class);
                        startActivity(five_intent);
                        break;
                    case 6:
                        Intent six_intent = new Intent(view.getContext(), ILGU.class);
                        startActivity(six_intent);
                        break;
                    case 7:
                        Intent seven_intent = new Intent(view.getContext(), PerfectPivot.class);
                        startActivity(seven_intent);
                        break;
                    case 8:
                        Intent eight_intent = new Intent(view.getContext(), ShieldDrop.class);
                        startActivity(eight_intent);
                        break;
                    case 9:
                        Intent nine_intent = new Intent(view.getContext(), TwoFrame.class);
                        startActivity(nine_intent);
                        break;
                    case 10:
                        Intent ten_intent = new Intent(view.getContext(), WallCling.class);
                        startActivity(ten_intent);
                        break;
                    case 11:
                        Intent eleven_intent = new Intent(view.getContext(), WaveBounce.class);
                        startActivity(eleven_intent);
                        break;


                    default:
                        break;
                }
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, Tech.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
