package com.mireya.eventsandroid.domain.tarjets.presenter;

import com.mireya.eventsandroid.domain.tarjets.interactor.TarjetsInteractor;
import com.mireya.eventsandroid.domain.tarjets.interactor.TarjetsInteractorImpl;
import com.mireya.eventsandroid.domain.tarjets.view.TarjetView;

public class TarjetPresenterImpl implements TarjetPresenter {
    public TarjetsInteractor interactor;
    public TarjetView view;

    public TarjetPresenterImpl(TarjetView view) {
        this.view = view;
        interactor = new TarjetsInteractorImpl(this);

    }
}
