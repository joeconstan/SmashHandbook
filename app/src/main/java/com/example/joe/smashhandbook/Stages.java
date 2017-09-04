package com.example.joe.smashhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Stages extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stages);


        Button sv = (Button) findViewById(R.id.smashvilleButton);
        Button fd = (Button) findViewById(R.id.fdButton);
        Button lc = (Button) findViewById(R.id.lylatButton);
        Button dl = (Button) findViewById(R.id.dreamlandButton);
        Button tnc = (Button) findViewById(R.id.towncityButton);
        Button bf = (Button) findViewById(R.id.battlefieldButton);

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


    }
}
