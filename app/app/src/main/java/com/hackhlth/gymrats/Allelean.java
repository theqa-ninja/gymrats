package com.hackhlth.gymrats;

import android.graphics.drawable.Drawable;

public class Allelean {
    private String name;
    private Drawable image;

    public Allelean(String name, Drawable image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public Drawable getImage() {
        return image;
    }
}
