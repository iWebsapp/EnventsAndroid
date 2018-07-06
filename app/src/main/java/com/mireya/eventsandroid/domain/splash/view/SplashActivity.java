package com.mireya.eventsandroid.domain.splash.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.account.login.view.LoginActivity;
import com.mireya.eventsandroid.domain.splash.presenter.SplashPresenter;
import com.mireya.eventsandroid.domain.splash.presenter.SplashPresenterImpl;

public class SplashActivity extends AppCompatActivity implements SplashView{
    private SplashPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
