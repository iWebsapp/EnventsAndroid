package com.mireya.eventsandroid.domain.configuration.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.configuration.presenter.ConfigurationPresenter;
import com.mireya.eventsandroid.domain.configuration.presenter.ConfigurationPresenterImpl;

public class ConfigurationActivity extends AppCompatActivity implements ConfigurationView{
    public ConfigurationPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
        setUpVariable();
        setUpView();
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new ConfigurationPresenterImpl(this);
        }
    }


    private void setUpView() {
    }


}
