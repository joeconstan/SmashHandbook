package com.example.joe.smashhandbook;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class WaveBounce extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_wavebounce);

        ImageView IMAGE_VIEW = (ImageView) findViewById(R.id.wavebounce_iv);
        GlideDrawableImageViewTarget iv = new GlideDrawableImageViewTarget(IMAGE_VIEW);
        Glide.with(this).load(R.raw.wavebouncegif).into((iv));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
