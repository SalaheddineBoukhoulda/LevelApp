package com.mr_rude.levelappproject;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mr_Rude on 26/10/2018.
 */

public class SignupFragment extends android.support.v4.app.Fragment {
    public SignupFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.signup,container,false);
        return rootView;
    }
}
