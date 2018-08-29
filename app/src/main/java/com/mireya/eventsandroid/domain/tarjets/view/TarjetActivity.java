package com.mireya.eventsandroid.domain.tarjets.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.crashlytics.android.Crashlytics;
import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.tarjets.adapter.TarjetAdapter;
import com.mireya.eventsandroid.domain.tarjets.data.TarjetData;
import com.mireya.eventsandroid.domain.tarjets.presenter.TarjetPresenter;
import com.mireya.eventsandroid.domain.tarjets.presenter.TarjetPresenterImpl;

import java.util.ArrayList;
import java.util.List;

import io.fabric.sdk.android.Fabric;

public class TarjetActivity extends AppCompatActivity implements TarjetView {

    public TarjetPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_tarjet);
        setupVariable();
        setUpView();
    }

    private void setupVariable() {
        if (presenter == null){
            presenter = new TarjetPresenterImpl(this);
        }
    }

    private void setUpView() {
        List<TarjetData> teacherData = new ArrayList<>();
        teacherData.add(new TarjetData(1, "******0027", "3412", "Mireya Jim"));
        teacherData.add(new TarjetData(2, "******0027", "3412", "Mireya Jim"));
        teacherData.add(new TarjetData(3, "******0027", "3412", "Mireya Jim"));
        teacherData.add(new TarjetData(4, "******0027", "3412", "Mireya Jim"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = new TarjetAdapter(this, presenter, teacherData);
        recyclerView.setAdapter(adapter);
    }
}
