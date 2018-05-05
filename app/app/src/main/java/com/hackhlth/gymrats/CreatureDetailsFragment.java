package com.hackhlth.gymrats;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CreatureDetailsFragment extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, final Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.creaure_details, container,
                false);
        getDialog().setTitle("DialogFragment Tutorial");
        return rootView;
    }
}
