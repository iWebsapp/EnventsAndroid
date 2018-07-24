package com.mireya.eventsandroid.domain.places.view;

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
import com.mireya.eventsandroid.domain.places.presenter.PlacesPresenterImpl;

public class PlacesFragment extends Fragment implements PlacesView{
    public PlacesView presenter;
    public static String IDENTIFIER = "PLACES_FRAGMENT";
    private final String TAG= this.getClass().getSimpleName();

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_places, container, false);
        setUpVariable();
        setUpView(view);
        return view;
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new PlacesPresenterImpl(this);
        }
    }

    private void setUpView(View view) {
        Log.d(TAG, "profile fragment");
    }

}
