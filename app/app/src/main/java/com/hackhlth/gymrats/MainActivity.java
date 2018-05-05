package com.hackhlth.gymrats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mCreatureImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCreatureImageView = findViewById(R.id.creature_image_view);
        mCreatureImageView.setImageDrawable(getResources().getDrawable(R.drawable.whale));
    }
}
