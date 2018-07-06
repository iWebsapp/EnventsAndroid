package com.mireya.eventsandroid.domain.account.create.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.account.create.presenter.CreateAccountPresenter;
import com.mireya.eventsandroid.domain.account.create.presenter.CreateAccountPresenterImpl;
import com.mireya.eventsandroid.domain.account.local.view.LocalActivity;

public class CreateAccount extends AppCompatActivity implements CreateAccountView {
    private CreateAccountPresenter presenter;
    private Button following;

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
        following = findViewById(R.id.btnNext);
        following.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLocales();
            }
        });
    }

    @Override
    public void goLocales() {
        Intent intent = new Intent(this, LocalActivity.class);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        startActivity(intent);

    }
}
