package com.mireya.eventsandroid.domain.account.drink.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mireya.eventsandroid.R;

public class DrinkActivity extends AppCompatActivity implements DrinkView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
    }
}
