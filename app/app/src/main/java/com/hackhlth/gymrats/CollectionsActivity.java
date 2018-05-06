package com.hackhlth.gymrats;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.hackhlth.gymrats.utils.NetworkUtils;

import java.io.IOException;
import java.net.URL;

public class CollectionsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections);
        fetchData();
    }

    private void fetchData() {
        URL fetchDataUrl = NetworkUtils.buildFetchCollectionsUrl(1);
        new FetchDataTask().execute(fetchDataUrl);
    }

    public class FetchDataTask extends AsyncTask<URL, Void, String> {
        @Override
        protected String doInBackground(final URL... urls) {
            final URL url = urls[0];
            String results = null;
            try {
                results = NetworkUtils.getResponseFromHttpUrl(url);
            } catch (final IOException e) {
                e.printStackTrace();
            }
            return results;
        }

        @Override
        protected void onPostExecute(final String s) {
            if (s != null && !s.equals("")) {
                TextView sampleResultTextView = findViewById(R.id.sample_result);
                sampleResultTextView.setText(s);
            }
        }
    }
}
