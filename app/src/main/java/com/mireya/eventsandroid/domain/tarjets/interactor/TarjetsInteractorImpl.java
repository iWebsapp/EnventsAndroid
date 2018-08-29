package com.mireya.eventsandroid.domain.tarjets.interactor;

import com.mireya.eventsandroid.domain.account.tables.presenter.TablesPresenter;
import com.mireya.eventsandroid.domain.tarjets.presenter.TarjetPresenter;

public class TarjetsInteractorImpl implements TarjetsInteractor {
    private TarjetPresenter presenter;

    public TarjetsInteractorImpl(TarjetPresenter presenter) {
        this.presenter = presenter;
    }
}
