package com.hackhlth.gymrats.utils;

import android.net.Uri;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class NetworkUtils {
    final static String HEROKU_ENDPOINT = "https://gymrats.herokuapp.com/api/alleleans";

    public static URL buildFetchCollectionsUrl(final int userId) {
        final Uri builtUri = Uri.parse(HEROKU_ENDPOINT)
                .buildUpon()
                .appendPath("" + userId)
                .build();

        URL url = null;
        try {
            String urlString = builtUri.toString();
            url = new URL(builtUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return url;
    }

    public static String getResponseFromHttpUrl(URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            } else {
                return null;
            }
        } finally {
            urlConnection.disconnect();
        }
    }
}
