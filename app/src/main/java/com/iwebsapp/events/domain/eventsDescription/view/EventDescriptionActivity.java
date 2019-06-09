package com.iwebsapp.events.domain.eventsDescription.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.iwebsapp.events.R;
import com.iwebsapp.events.domain.eventsDescription.adapter.EventDescriptionAdapter;
import com.iwebsapp.events.domain.eventsDescription.data.EventDescriptionData;
import com.iwebsapp.events.domain.eventsDescription.presenter.EventDescriptionPresenter;
import com.iwebsapp.events.domain.eventsDescription.presenter.EventDescriptionPresenterImpl;
import com.iwebsapp.events.domain.products.view.ProductsActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EventDescriptionActivity extends AppCompatActivity implements EventDescriptionView{
    private EventDescriptionPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_description);
        setUpVariable();
        setUpView();
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new EventDescriptionPresenterImpl(this);
        }
    }

    private void setUpView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);

        List<EventDescriptionData> eventDescriptionData = new ArrayList<>();
        eventDescriptionData.add(new EventDescriptionData(1, R.drawable.ic_about, R.string.information));
        eventDescriptionData.add(new EventDescriptionData(2, R.drawable.ic_comments, R.string.coments));
        eventDescriptionData.add(new EventDescriptionData(3, R.drawable.ic_coupons, R.string.coupons));
        eventDescriptionData.add(new EventDescriptionData(4, R.drawable.ic_promotions, R.string.promotions));
        eventDescriptionData.add(new EventDescriptionData(5, R.drawable.ic_products, R.string.products));
        eventDescriptionData.add(new EventDescriptionData(6, R.drawable.ic_table_food, R.string.table_food));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = new EventDescriptionAdapter(this, presenter, eventDescriptionData);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void goProducts() {
        Intent intent = new Intent(this, ProductsActivity.class);
        startActivity(intent);
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
