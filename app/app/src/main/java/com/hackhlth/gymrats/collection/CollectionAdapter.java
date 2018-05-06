package com.hackhlth.gymrats.collection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hackhlth.gymrats.Allelean;
import com.hackhlth.gymrats.R;
import com.hackhlth.gymrats.recommendation.Recommendation;
import com.hackhlth.gymrats.recommendation.RecommendationLevel;

import java.util.List;

public class CollectionAdapter extends BaseAdapter {

    private Context context;
    private List<Allelean> alleleanList;

    public CollectionAdapter(Context context, List<Allelean> alleleanList) {
        this.context = context;
        this.alleleanList = alleleanList;
    }

    @Override
    public int getCount() {
        return alleleanList.size();
    }

    @Override
    public Object getItem(int i) {
        return alleleanList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item_allelean, null, false);

            viewHolder = new ViewHolder();
            viewHolder.name = view.findViewById(R.id.name);
            viewHolder.image = view.findViewById(R.id.image);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Allelean allelean = (Allelean) getItem(i);
        if (allelean != null) {
            viewHolder.name.setText(allelean.getName());
            viewHolder.image.setImageDrawable(allelean.getImage());
        }

        return view;
    }

    class ViewHolder {
        TextView name;
        ImageView image;
    }
}
