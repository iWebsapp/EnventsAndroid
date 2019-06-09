package com.iwebsapp.events.domain.main.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.iwebsapp.events.R;
import com.iwebsapp.events.domain.alerts.view.AlertsFragment;
import com.iwebsapp.events.domain.cart.view.CartFragment;
import com.iwebsapp.events.domain.coupons.view.CouponsFragment;
import com.iwebsapp.events.domain.main.presenter.MainPresenter;
import com.iwebsapp.events.domain.main.presenter.MainPresenterImpl;
import com.iwebsapp.events.domain.places.view.PlacesFragment;
import com.iwebsapp.events.domain.profile.view.ProfileFragment;

public class MainActivity extends AppCompatActivity implements MainView{
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
        if (presenter == null){
            presenter = new MainPresenterImpl(this);
        }
    }

    private void setUpView() {
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_profile:
                    showProfileFragment();
                    return true;
                case R.id.navigation_places:
                    showPlacesFragment();
                    return true;
                case R.id.navigation_coupons:
                    showCouponsFragment();
                    return true;
                case R.id.navigation_shopping_cart:
                    showCartFragment();
                    return true;
                case R.id.navigation_alerts:
                    showAlertFragment();
                    return true;
            }
            return false;
        }
    };

    private void showProfileFragment (){
        ProfileFragment profileFragment = (ProfileFragment) getSupportFragmentManager().findFragmentByTag(ProfileFragment.IDENTIFIER);
        if (profileFragment == null){
            profileFragment = new ProfileFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, profileFragment, ProfileFragment.IDENTIFIER)
                .commit();
    }

    private void showAlertFragment(){
        AlertsFragment alertsFragment = (AlertsFragment) getSupportFragmentManager().findFragmentByTag(AlertsFragment.IDENTIFIER);
        if (alertsFragment == null){
            alertsFragment = new AlertsFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, alertsFragment, AlertsFragment.IDENTIFIER)
                .commit();
    }

    private void showCartFragment(){
        CartFragment cartFragment = (CartFragment) getSupportFragmentManager().findFragmentByTag(CartFragment.IDENTIFIER);
        if (cartFragment == null){
            cartFragment = new CartFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, cartFragment, CartFragment.IDENTIFIER)
                .commit();
    }

    private void showCouponsFragment(){
        CouponsFragment couponsFragment = (CouponsFragment) getSupportFragmentManager().findFragmentByTag(CouponsFragment.IDENTIFIER);
        if (couponsFragment == null){
            couponsFragment = new CouponsFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, couponsFragment, CouponsFragment.IDENTIFIER)
                .commit();
    }

    private void showPlacesFragment(){
        PlacesFragment placesFragment = (PlacesFragment) getSupportFragmentManager().findFragmentByTag(PlacesFragment.IDENTIFIER);
        if (placesFragment == null){
            placesFragment = new PlacesFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, placesFragment, PlacesFragment.IDENTIFIER)
                .commit();
    }

}
