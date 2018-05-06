package com.hackhlth.gymrats;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CreatureDetailsFragment extends DialogFragment {

    private ImageView mCreatureImageView;
    private TextView mCreatureName;
    private TextView mCreatureDescription;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final Dialog dialog = new Dialog(getActivity());

        LayoutInflater layoutInflater = (LayoutInflater) getActivity()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View layout = layoutInflater.inflate(R.layout.creature_details, null);
        dialog.setContentView(layout);

        mCreatureImageView = layout.findViewById(R.id.creature_image_view);
        mCreatureImageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_whale));
        mCreatureName = layout.findViewById(R.id.creature_name);
        mCreatureName.setText("Peaceful Whale");
        mCreatureDescription = layout.findViewById(R.id.creature_description);
        mCreatureDescription.setText("The stuff whale quietly stalks his prey.");

        return dialog;
    }
}
