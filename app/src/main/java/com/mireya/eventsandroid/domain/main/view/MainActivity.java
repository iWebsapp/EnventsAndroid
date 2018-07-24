package com.mireya.eventsandroid.domain.main.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.alerts.view.AlertFragment;
import com.mireya.eventsandroid.domain.coupons.view.CouponsFragment;
import com.mireya.eventsandroid.domain.main.presenter.MainPresenter;
import com.mireya.eventsandroid.domain.main.presenter.MainPresenterImpl;
import com.mireya.eventsandroid.domain.places.view.PlacesFragment;
import com.mireya.eventsandroid.domain.profile.view.ProfileFragment;
import com.mireya.eventsandroid.domain.shopping.view.ShoppingFragment;

public class MainActivity extends AppCompatActivity implements MainView {

    private BottomNavigationViewEx navigation;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpVariable();
        setUpView();
        showProfileFragment();
    }

    private void setUpVariable() {
        if (presenter == null) {
            presenter = new MainPresenterImpl(this);
        }
    }

    private void setUpView() {

        navigation = findViewById(R.id.navigation);
        //navigation.enableAnimation(true);
        //navigation.enableShiftingMode(false);
        //navigation.enableItemShiftingMode(false);

        setUpBottomNavigationBar();

    }

    private void setUpBottomNavigationBar() {
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_profile:
                        showProfileFragment();
                        return true;
                    case R.id.navigation_map:
                        showPlacesFragment();
                        return true;
                    case R.id.navigation_card:
                        showShooppingFragment();
                        return true;
                    case R.id.navigation_cuopons:
                        showCuoponsFragment();
                        return true;
                    case R.id.navigation_notification:
                        showAlertFragment();
                        return true;
                }
                return true;
            }
        });
    }
    private void showProfileFragment() {
        ProfileFragment profileFragment = (ProfileFragment) getSupportFragmentManager().findFragmentByTag(ProfileFragment.IDENTIFIER);
        if(profileFragment == null){
            profileFragment = new ProfileFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, profileFragment, ProfileFragment.IDENTIFIER)
                .commit();
    }

    private void showPlacesFragment() {
        PlacesFragment placesFragment = (PlacesFragment) getSupportFragmentManager().findFragmentByTag(PlacesFragment.IDENTIFIER);
        if(placesFragment == null){
            placesFragment = new PlacesFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, placesFragment, PlacesFragment.IDENTIFIER)
                .commit();
    }

    private void showShooppingFragment() {
        ShoppingFragment shoppingFragment = (ShoppingFragment) getSupportFragmentManager().findFragmentByTag(ShoppingFragment.IDENTIFIER);
        if(shoppingFragment == null){
            shoppingFragment = new ShoppingFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, shoppingFragment, ShoppingFragment.IDENTIFIER)
                .commit();
    }

    private void showCuoponsFragment() {
        CouponsFragment couponsFragment = (CouponsFragment) getSupportFragmentManager().findFragmentByTag(CouponsFragment.IDENTIFIER);
        if(couponsFragment == null){
            couponsFragment = new CouponsFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, couponsFragment, CouponsFragment.IDENTIFIER)
                .commit();
    }

    private void showAlertFragment() {
        AlertFragment alertFragment = (AlertFragment) getSupportFragmentManager().findFragmentByTag(AlertFragment.IDENTIFIER);
        if(alertFragment == null){
            alertFragment = new AlertFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, alertFragment, AlertFragment.IDENTIFIER)
                .commit();
    }
}