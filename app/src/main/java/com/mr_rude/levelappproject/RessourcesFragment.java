package com.mr_rude.levelappproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mr_Rude on 26/10/2018.
 */

public class RessourcesFragment extends android.app.Fragment {
    public RessourcesFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.preferences_fragment,container,false);
        return rootView;
    }
}