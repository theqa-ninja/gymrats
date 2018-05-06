package com.hackhlth.gymrats;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mCreatureImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCreatureImageView = findViewById(R.id.creature_image_view);
        mCreatureImageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_whale));

        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DashboardActivity.class));
            }
        });
//        findViewById(R.id.creatureDetailsButton).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(final View view) {
//                FragmentManager fragmentManager = getFragmentManager();
//                DialogFragment creatureDetailsFragment = new CreatureDetailsFragment();
//                creatureDetailsFragment.show(fragmentManager, "Creature Details");
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        final int id = item.getItemId();
        if (id == R.id.action_register_coin) {
            Intent intent = new Intent(MainActivity.this, RegisterCoinActivity.class);
            MainActivity.this.startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
