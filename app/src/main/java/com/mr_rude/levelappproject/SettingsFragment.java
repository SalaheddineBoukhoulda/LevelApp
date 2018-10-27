package com.mr_rude.levelappproject;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.steamcrafted.lineartimepicker.dialog.LinearTimePickerDialog;

/**
 * Created by Mr_Rude on 26/10/2018.
 */

public class SettingsFragment extends android.app.Fragment {
    public SettingsFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.settings_fragment,container,false);
        LinearTimePickerDialog dialog = LinearTimePickerDialog.Builder.with(getActivity()).build();
        dialog.show();
        return rootView;
    }
}
