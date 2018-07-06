package com.mireya.eventsandroid.domain.account.local.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.account.local.presenter.LocalPresenter;
import com.mireya.eventsandroid.domain.account.local.presenter.LocalPresenterImpl;
import com.mireya.eventsandroid.domain.account.promotions.view.PromotionsActivity;

public class LocalActivity extends AppCompatActivity implements LocalView {
    private LocalPresenter presenter;
    private Button btnFollowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        setUpVariable();
        setUpView();
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new LocalPresenterImpl(this);
        }
    }

    private void setUpView() {
        btnFollowing = findViewById(R.id.btnNext);
        btnFollowing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPromotions();
            }
        });
    }

    @Override
    public void goPromotions() {
        Intent intent = new Intent(this, PromotionsActivity.class);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        startActivity(intent);
    }
}
