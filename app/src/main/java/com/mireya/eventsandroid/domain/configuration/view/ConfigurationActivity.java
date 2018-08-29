package com.mireya.eventsandroid.domain.configuration.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;
import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.configuration.presenter.ConfigurationPresenter;
import com.mireya.eventsandroid.domain.configuration.presenter.ConfigurationPresenterImpl;
import com.mireya.eventsandroid.domain.tarjets.view.TarjetActivity;

import io.fabric.sdk.android.Fabric;

public class ConfigurationActivity extends AppCompatActivity implements ConfigurationView{
    public ConfigurationPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
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
        TextView manage = findViewById(R.id.tvManage);
        manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfigurationActivity.this, TarjetActivity.class);
                startActivity(intent);
            }
        });
    }


}
