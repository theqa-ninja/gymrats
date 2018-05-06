package com.hackhlth.gymrats.recommendation;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.hackhlth.gymrats.R;

public enum RecommendationLevel {
    GOOD,
    OKAY,
    BAD,
    NEUTRAL;

    public static Drawable getDrawableBackground(Context context, RecommendationLevel recommendationLevel) {
        Drawable drawable;

        switch (recommendationLevel) {
            case GOOD:
                drawable = context.getResources().getDrawable(R.drawable.green_background);
                break;
            case OKAY:
                drawable = context.getResources().getDrawable(R.drawable.yellow_background);
                break;
            case BAD:
                drawable = context.getResources().getDrawable(R.drawable.red_background);
                break;
            case NEUTRAL:
            default:
                drawable = context.getResources().getDrawable(R.drawable.gray_background);
                break;
        }

        return drawable;
    }
}
