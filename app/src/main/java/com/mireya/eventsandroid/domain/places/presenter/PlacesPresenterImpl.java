package com.mireya.eventsandroid.domain.places.presenter;

import com.mireya.eventsandroid.domain.places.interactor.PlacesInteractor;
import com.mireya.eventsandroid.domain.places.interactor.PlacesInteractorImpl;
import com.mireya.eventsandroid.domain.places.view.PlacesView;

public class PlacesPresenterImpl implements PlacesPresenter {
    public PlacesInteractor interactor;
    public PlacesView view;

    public PlacesPresenterImpl(PlacesView view) {
        this.view = view;
        interactor = new PlacesInteractorImpl(this);
    }
}
