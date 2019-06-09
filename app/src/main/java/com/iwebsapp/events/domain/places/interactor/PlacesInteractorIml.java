package com.iwebsapp.events.domain.places.interactor;

import com.iwebsapp.events.domain.places.presenter.PlacesPresenter;

public class PlacesInteractorIml implements PlacesInteractor {
    private PlacesPresenter presenter;

    public PlacesInteractorIml(PlacesPresenter presenter) {
        this.presenter = presenter;
    }
}
