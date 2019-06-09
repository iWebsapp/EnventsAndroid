package com.iwebsapp.events.domain.products.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.iwebsapp.events.R;
import com.iwebsapp.events.domain.products.presenter.ProductsPresenter;
import com.iwebsapp.events.domain.products.presenter.ProductsPresenterImpl;

import java.util.Objects;

public class ProductsActivity extends AppCompatActivity implements ProductsView{
    private ProductsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        setUpView();
        setUpVariable();
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new ProductsPresenterImpl(this);
        }
    }

    private void setUpView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }
}
