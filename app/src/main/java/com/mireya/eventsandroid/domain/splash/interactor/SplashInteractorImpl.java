package com.mireya.eventsandroid.domain.splash.interactor;

import com.mireya.eventsandroid.domain.splash.presenter.SplashPresenter;

public class SplashInteractorImpl implements SplashInteractor{
    private SplashPresenter presenter;

    public SplashInteractorImpl(SplashPresenter presenter) {
        this.presenter = presenter;
    }
}
