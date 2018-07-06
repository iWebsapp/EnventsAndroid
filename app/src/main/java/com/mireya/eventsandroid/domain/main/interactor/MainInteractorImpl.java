package com.mireya.eventsandroid.domain.main.interactor;

import com.mireya.eventsandroid.domain.main.presenter.MainPresenter;

public class MainInteractorImpl implements MainInteractor {
    private MainPresenter presenter;

    public MainInteractorImpl(MainPresenter presenter) {
        this.presenter = presenter;
    }
}
