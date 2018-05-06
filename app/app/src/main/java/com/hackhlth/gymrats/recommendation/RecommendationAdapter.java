package com.hackhlth.gymrats.recommendation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hackhlth.gymrats.R;

import java.util.List;

public class RecommendationAdapter extends BaseAdapter {

    private Context context;
    private List<Recommendation> recommendationList;

    RecommendationAdapter(Context context, List<Recommendation> recommendationList) {
        this.context = context;
        this.recommendationList = recommendationList;
    }

    @Override
    public int getCount() {
        return recommendationList.size();
    }

    @Override
    public Object getItem(int i) {
        return recommendationList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item_recommendation, null, false);

            viewHolder = new ViewHolder();
            viewHolder.recommendationLevel = view.findViewById(R.id.recommendationLevel);
            viewHolder.traitName = view.findViewById(R.id.traitName);
            viewHolder.allele1 = view.findViewById(R.id.allele1);
            viewHolder.allele2 = view.findViewById(R.id.allele2);
            viewHolder.recommendation = view.findViewById(R.id.recommendation);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Recommendation recommendation = (Recommendation) getItem(i);
        if (recommendation != null) {
            viewHolder.recommendationLevel.setBackground(RecommendationLevel.getDrawableBackground(context, recommendation.getRecommendationLevel()));
            viewHolder.traitName.setText(recommendation.getTraitName());
            viewHolder.allele1.setText(recommendation.getAllele1());
            viewHolder.allele2.setText(recommendation.getAllele2());
            viewHolder.recommendation.setText(recommendation.getRecommendation());
        }

        return view;
    }

    class ViewHolder {
        View recommendationLevel;
        TextView traitName;
        TextView allele1;
        TextView allele2;
        TextView recommendation;
    }
}
