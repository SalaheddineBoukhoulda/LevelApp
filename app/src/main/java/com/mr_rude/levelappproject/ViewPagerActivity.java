package com.mr_rude.levelappproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Mr_Rude on 26/10/2018.
 */

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private FragmentCollectionAdapter fragmentCollectionAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);
        viewPager = findViewById(R.id.pager);
        fragmentCollectionAdapter = new FragmentCollectionAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentCollectionAdapter);

    }
}
