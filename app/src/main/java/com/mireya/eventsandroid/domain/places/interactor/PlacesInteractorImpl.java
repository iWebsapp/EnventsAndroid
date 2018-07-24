package com.mireya.eventsandroid.domain.places.interactor;

import com.mireya.eventsandroid.domain.places.presenter.PlacesPresenter;

public class PlacesInteractorImpl implements PlacesInteractor {
    public PlacesPresenter presenter;

    public PlacesInteractorImpl(PlacesPresenter presenter) {
        this.presenter = presenter;
    }
}
