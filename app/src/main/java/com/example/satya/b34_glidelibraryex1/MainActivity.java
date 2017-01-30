package com.example.satya.b34_glidelibraryex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imageView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.im1);
        Glide.
                with(this).
                load("https://www.mapsofindia.com/maps/india/india-flag.jpg").
                placeholder(R.mipmap.ic_launcher).
                crossFade().
                into(imageView);
    }
}
