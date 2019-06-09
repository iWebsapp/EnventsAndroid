package com.iwebsapp.events.domain.main.interactor;

import com.iwebsapp.events.domain.main.presenter.MainPresenter;

public class MainInteractorImpl implements MainInteractor {
    private MainPresenter presenter;

    public MainInteractorImpl(MainPresenter presenter) {
        this.presenter = presenter;
    }
}
