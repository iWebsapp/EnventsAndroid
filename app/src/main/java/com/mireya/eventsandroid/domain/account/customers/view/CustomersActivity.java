package com.mireya.eventsandroid.domain.account.customers.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mireya.eventsandroid.R;

public class CustomersActivity extends AppCompatActivity implements CustomersView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);
    }
}
