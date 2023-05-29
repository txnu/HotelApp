package com.tanuwijaya_202102261.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = findViewById(R.id.imageView1);

        String imageUrl = "https://petualang.travelingyuk.com/uploads/2019/04/derry_sp188_53602204_2184314798550767_6070224238698031528_n.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}