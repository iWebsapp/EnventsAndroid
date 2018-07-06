package com.mireya.eventsandroid.domain.account.promotions.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.account.addmenu.view.AddMenu;
import com.mireya.eventsandroid.domain.account.promotions.presenter.PromotionsPresenter;
import com.mireya.eventsandroid.domain.account.promotions.presenter.PromotionsPresenterImpl;

public class PromotionsActivity extends AppCompatActivity implements PromotionsView{
    private PromotionsPresenter presenter;
    private Button btnFollowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotions);
        setupVariable();
        setUpView();
    }

    private void setupVariable() {
        if (presenter == null){
            presenter = new PromotionsPresenterImpl(this);
        }
    }

    private void setUpView() {
        btnFollowing = findViewById(R.id.next);
        btnFollowing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addMenu();
            }
        });
    }

    @Override
    public void addMenu() {
        Intent intent = new Intent(this, AddMenu.class);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        startActivity(intent);
    }
}
