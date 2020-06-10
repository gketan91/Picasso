package com.ketan_studio.example.fuckpicasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m = (ImageView)findViewById(R.id.imageview);
        Picasso.with(getApplicationContext()).load("http://i.imgur.com/DvpvklR.png").error(R.drawable.ic_launcher_background).into(m);
    }
}
