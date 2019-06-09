package com.iwebsapp.events.domain.places.view;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iwebsapp.events.R;
import com.iwebsapp.events.domain.places.presenter.PlacesPresenter;
import com.iwebsapp.events.domain.places.presenter.PlacesPresenterImpl;

public class PlacesFragment extends Fragment implements PlacesPresenter {
    private PlacesPresenter presenter;
    public static String IDENTIFIER = "PLACES_FRAGMENT";

    public PlacesFragment() { }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_places, container, false);
        setUpVariable();
        setUpView(view);
        return  view;
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new PlacesPresenterImpl(this);
        }
    }

    private void setUpView(View view) {
    }

}
