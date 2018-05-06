package com.hackhlth.gymrats.recommendation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.hackhlth.gymrats.R;

import java.util.ArrayList;
import java.util.List;

public class RecommendationActivity extends AppCompatActivity {

    private RecommendationAdapter recommendationAdapter;

    private ListView recommendationList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);

        recommendationList = findViewById(R.id.recommendationList);

        Recommendation recommendation = new Recommendation();
        recommendation.setRecommendationLevel(RecommendationLevel.GOOD);
        recommendation.setTraitName("Calcium");
        recommendation.setAllele1("T");
        recommendation.setAllele2("T");
        recommendation.setRecommendation("Your genetics may indicate that you are more likely to have increased calcium levels, but that is only if you are getting sufficient calcium in your diet.");

        Recommendation recommendation2 = new Recommendation();
        recommendation2.setRecommendationLevel(RecommendationLevel.GOOD);
        recommendation2.setTraitName("Alcohol Flush");
        recommendation2.setAllele1("G");
        recommendation2.setAllele2("G");
        recommendation2.setRecommendation("Likely not sensitive to alcohol. Drink in moderation.");

        List<Recommendation> recommendations = new ArrayList<>();
        recommendations.add(recommendation);
        recommendations.add(recommendation2);

        recommendationAdapter = new RecommendationAdapter(this, recommendations);

        recommendationList.setAdapter(recommendationAdapter);
    }
}
