package com.mireya.eventsandroid.domain.account.tables.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.account.tables.presenter.TablesPresenter;
import com.mireya.eventsandroid.domain.account.tables.presenter.TablesPresenterImpl;

public class TableActivity extends AppCompatActivity implements TablesView{
    private TablesPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        setUpVariable();
        setUpView();
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new TablesPresenterImpl(this);
        }
    }

    private void setUpView() {
    }
}
