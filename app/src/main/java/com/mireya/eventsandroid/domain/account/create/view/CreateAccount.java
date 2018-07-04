package com.mireya.eventsandroid.domain.account.create.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.account.create.presenter.CreateAccountPresenter;
import com.mireya.eventsandroid.domain.account.create.presenter.CreateAccountPresenterImpl;

public class CreateAccount extends AppCompatActivity implements CreateAccountView {
    private CreateAccountPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        setUpVariable();
        setUpView();
    }

    private void setUpVariable() {
        if (presenter == null) {
            presenter = new CreateAccountPresenterImpl(this);
        }
    }
    private void setUpView() {
    }
}
