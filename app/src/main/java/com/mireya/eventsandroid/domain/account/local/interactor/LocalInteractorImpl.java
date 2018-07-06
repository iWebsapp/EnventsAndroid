package com.mireya.eventsandroid.domain.account.local.interactor;

import com.mireya.eventsandroid.domain.account.local.presenter.LocalPresenter;

public class LocalInteractorImpl implements LocalInteractor {
    private LocalPresenter presenter;

    public LocalInteractorImpl(LocalPresenter presenter) {
        this.presenter = presenter;
    }
}
