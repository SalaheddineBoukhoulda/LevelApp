package com.mr_rude.levelappproject;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Mr_Rude on 26/10/2018.
 */

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    private BottomNavigationView bottomNavigationView;
    private FragmentManager fragmentManager;
    private HomeFragment homeFragment;
    private RessourcesFragment ressourcesFragment;
    private SettingsFragment settingsFragment;
    private int menuId;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        // We Initialize the fragments
        homeFragment = new HomeFragment();
        ressourcesFragment = new RessourcesFragment();
        settingsFragment = new SettingsFragment();

        //Set the Dashboardfragment as the starting one
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().add(R.id.main_content,homeFragment).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.apps_fragment:
                fragmentManager.beginTransaction().replace(R.id.main_content,homeFragment).commit();
                break;
            case R.id.ressources_fragment:
                fragmentManager.beginTransaction().replace(R.id.main_content,ressourcesFragment).commit();
                break;
            case R.id.settings:
                fragmentManager.beginTransaction().replace(R.id.main_content,settingsFragment).commit();
        }
        return false;
    }
}
