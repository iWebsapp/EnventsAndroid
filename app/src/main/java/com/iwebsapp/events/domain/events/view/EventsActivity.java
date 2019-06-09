package com.iwebsapp.events.domain.events.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.iwebsapp.events.R;
import com.iwebsapp.events.domain.events.adapter.EventsAdapter;
import com.iwebsapp.events.domain.events.data.EventsData;
import com.iwebsapp.events.domain.events.presenter.EventsPresenter;
import com.iwebsapp.events.domain.events.presenter.EventsPresenterImpl;
import com.iwebsapp.events.domain.eventsDescription.view.EventDescriptionActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EventsActivity extends AppCompatActivity implements EventsPresenter {
    private EventsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        setUpVariable();
        setUpView();
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new EventsPresenterImpl(this);
        }
    }

    private void setUpView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.myEvent);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);

        List<EventsData> eventsData = new ArrayList<>();
        eventsData.add(new EventsData(1, R.drawable.ic_event, "Fiesta de jim", "27/03/2019"));
        eventsData.add(new EventsData(2, R.drawable.ic_event, "Fiesta de jim", "27/03/2019"));
        eventsData.add(new EventsData(3, R.drawable.ic_event, "Fiesta de jim", "27/03/2019"));
        eventsData.add(new EventsData(4, R.drawable.ic_event, "Fiesta de jim", "27/03/2019"));
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = new EventsAdapter(this, presenter, eventsData);
        recyclerView.setAdapter(adapter);
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

    @Override
    public void goEventDescription() {
        Intent intent = new Intent(this, EventDescriptionActivity.class);
        startActivity(intent);
    }
}
