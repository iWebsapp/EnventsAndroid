package com.mireya.eventsandroid.domain.account.purchases.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.account.purchases.presenter.PurchasesPresenter;
import com.mireya.eventsandroid.domain.account.purchases.presenter.PurchasesPresenterImpl;

public class PurchasesActivity extends AppCompatActivity implements PurchasesView{
    private PurchasesPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchases);
        setUpVariable();
        setUpView();
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new PurchasesPresenterImpl(this);
        }
    }

    private void setUpView() {
    }
}
