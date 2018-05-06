package com.hackhlth.gymrats;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class CreatureDetailsFragment extends DialogFragment {

    private ImageView mCreatureImageView;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final Dialog dialog = new Dialog(getActivity());

        LayoutInflater layoutInflater = (LayoutInflater) getActivity()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View layout = layoutInflater.inflate(R.layout.creaure_details, null);
        dialog.setContentView(layout);

        ImageView myImage = layout.findViewById(R.id.creature_image_view);

        myImage.setImageDrawable(getResources().getDrawable(R.drawable.whale));


        return dialog;
    }
}
