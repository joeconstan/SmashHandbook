package com.example.joe.smashhandbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;


public class DI extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_di);

        ImageView IMAGE_VIEW = (ImageView) findViewById(R.id.di_iv);
        GlideDrawableImageViewTarget iv = new GlideDrawableImageViewTarget(IMAGE_VIEW);
        Glide.with(this).load(R.raw.twoframegif).into((iv));


    }
}