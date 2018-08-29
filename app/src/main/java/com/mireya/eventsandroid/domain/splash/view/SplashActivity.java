package com.mireya.eventsandroid.domain.splash.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.crashlytics.android.Crashlytics;
import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.account.login.view.LoginActivity;
import com.mireya.eventsandroid.domain.splash.presenter.SplashPresenter;
import com.mireya.eventsandroid.domain.splash.presenter.SplashPresenterImpl;

import io.fabric.sdk.android.Fabric;

public class SplashActivity extends AppCompatActivity implements SplashView{
    private SplashPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_splash);
        setupVariable();
        setUpView();
    }

    private void setupVariable() {
        if (presenter == null){
            presenter = new SplashPresenterImpl(this);
        }
    }

    private void setUpView() {
        int DURACION_SPLASH = 1500;
        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
