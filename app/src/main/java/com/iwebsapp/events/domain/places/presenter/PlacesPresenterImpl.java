package com.iwebsapp.events.domain.places.presenter;

import com.iwebsapp.events.domain.places.interactor.PlacesInteractor;
import com.iwebsapp.events.domain.places.interactor.PlacesInteractorIml;
import com.iwebsapp.events.domain.places.view.PlacesView;

public class PlacesPresenterImpl implements PlacesPresenter{
    private PlacesView view;
    private PlacesInteractor interactor;

    public PlacesPresenterImpl(PlacesView view) {
        this.view = view;
        interactor = new PlacesInteractorIml(this);
    }
}
