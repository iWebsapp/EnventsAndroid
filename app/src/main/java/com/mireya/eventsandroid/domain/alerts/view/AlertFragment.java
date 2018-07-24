package com.mireya.eventsandroid.domain.alerts.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.alerts.presenter.AlertsPresenter;
import com.mireya.eventsandroid.domain.alerts.presenter.AlertsPresenterImpl;

public class AlertFragment extends Fragment implements AlertView{
    public AlertsPresenter presenter;
    public static String IDENTIFIER = "COUPONS_FRAGMENT";
    private final String TAG= this.getClass().getSimpleName();

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alert, container, false);
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
        Log.d(TAG, "profile fragment");
    }
}
