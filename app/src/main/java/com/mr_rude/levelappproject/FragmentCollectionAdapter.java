package com.mr_rude.levelappproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Mr_Rude on 26/10/2018.
 */

public class FragmentCollectionAdapter extends FragmentStatePagerAdapter {
    public FragmentCollectionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SignupFragment();
            case 1:
                return new PreferencesFirstFragment();
        }
        position = position + 1;
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
