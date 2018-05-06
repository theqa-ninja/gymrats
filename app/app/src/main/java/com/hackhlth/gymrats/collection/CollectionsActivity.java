package com.hackhlth.gymrats.collection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.hackhlth.gymrats.Allelean;
import com.hackhlth.gymrats.R;

import java.util.ArrayList;
import java.util.List;

public class CollectionsActivity extends AppCompatActivity {

    private CollectionAdapter collectionAdapter;

    private GridView alleleanGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections);

        List<Allelean> alleleans = new ArrayList<>();
        alleleans.add(new Allelean("Gym Rat", getResources().getDrawable(R.drawable.ic_gym_rat)));

        collectionAdapter = new CollectionAdapter(this, alleleans);

        alleleanGrid = findViewById(R.id.alleleanGrid);
        alleleanGrid.setAdapter(collectionAdapter);
    }
}
