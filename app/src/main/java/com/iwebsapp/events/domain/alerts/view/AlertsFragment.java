package com.iwebsapp.events.domain.alerts.view;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iwebsapp.events.R;
import com.iwebsapp.events.domain.alerts.presenter.AlertsPresenter;
import com.iwebsapp.events.domain.alerts.presenter.AlertsPresenterImpl;

public class AlertsFragment extends Fragment implements AlertsPresenter {
    private AlertsPresenter presenter;
    public  static String IDENTIFIER = "ALERTS_FRAGMENT";

    public AlertsFragment() { }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alerts, container, false);
        setUpVariable();
        setUpView(view);
        return view;
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new AlertsPresenterImpl(this);
        }
    }

    private void setUpView(View view) {
    }
}
