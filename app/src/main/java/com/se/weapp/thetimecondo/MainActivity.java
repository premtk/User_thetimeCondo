package com.se.weapp.thetimecondo;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        loadFragment(new AnnounFragment());

        FragmentTransaction fragmentTransactio = getSupportFragmentManager().beginTransaction();

        fragmentTransactio.add(R.id.fragment,new Fragment());
        fragmentTransactio.commit();
    }

    private boolean loadFragment(Fragment fragment){
        if(fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment,fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.annount:                              //hardsai
                fragment = new AnnounFragment();            //hardsai
                break;
            case R.id.total:                                //chompoo
                fragment = new TotalFragment();             //chompoo
                break;
            case R.id.post:                                 //pleng
                fragment = new ParcelFragment();            //pleng
                break;
            case R.id.maint:                                //prem
                fragment = new MaintenanceFragment();       //prem
                break;
            case R.id.map:                                  //P&P
                fragment = new MapFragment();               //P&P
                break;
        }

        return loadFragment(fragment);
    }
}