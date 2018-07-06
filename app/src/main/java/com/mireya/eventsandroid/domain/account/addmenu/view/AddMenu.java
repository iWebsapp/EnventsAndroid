package com.mireya.eventsandroid.domain.account.addmenu.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.account.addmenu.presenter.AddMenuPresenter;
import com.mireya.eventsandroid.domain.account.addmenu.presenter.AddMenuPresenterImpl;
import com.mireya.eventsandroid.domain.account.purchases.view.PurchasesActivity;
import com.mireya.eventsandroid.domain.account.tables.view.TableActivity;

public class AddMenu extends AppCompatActivity implements AddMenuView{
    private AddMenuPresenter presenter;
    private ImageView imglike, dislike;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_menu);
        setUpVariable();
        setUpView();
    }

    private void setUpVariable() {
        if (presenter == null) {
            presenter = new AddMenuPresenterImpl(this);
        }
    }

    private void setUpView() {
        imglike = findViewById(R.id.like);
        dislike = findViewById(R.id.dislike);
        btnNext = findViewById(R.id.next);
        imglike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imglike.setImageResource(R.drawable.likegreen);
                dislike.setImageResource(R.drawable.dislike);
            }
        });

        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike.setImageResource(R.drawable.dislikered);
                imglike.setImageResource(R.drawable.like);
            }
        });

    }

    @Override
    public void goPurchases() {
        Intent intent = new Intent(this, PurchasesActivity.class);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        startActivity(intent);
    }

    @Override
    public void goTable() {
        Intent intent = new Intent(this, TableActivity.class);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        startActivity(intent);
    }
}
