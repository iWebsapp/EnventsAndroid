package com.mireya.eventsandroid.domain.splash.presenter;

import com.mireya.eventsandroid.domain.splash.interactor.SplashInteractor;
import com.mireya.eventsandroid.domain.splash.interactor.SplashInteractorImpl;
import com.mireya.eventsandroid.domain.splash.view.SplashView;

public class SplashPresenterImpl implements SplashPresenter {
    private SplashInteractor interactor;
    private SplashView view;

    public SplashPresenterImpl(SplashView view) {
        this.view = view;
        interactor = new SplashInteractorImpl(this);
    }
}
