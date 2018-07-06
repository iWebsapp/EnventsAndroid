package com.mireya.eventsandroid.domain.account.local.presenter;

import com.mireya.eventsandroid.domain.account.local.interactor.LocalInteractor;
import com.mireya.eventsandroid.domain.account.local.interactor.LocalInteractorImpl;
import com.mireya.eventsandroid.domain.account.local.view.LocalView;

public class LocalPresenterImpl implements LocalPresenter {
    private LocalInteractor interactor;
    private LocalView view;

    public LocalPresenterImpl(LocalView view) {
        this.view = view;
        interactor = new LocalInteractorImpl(this);
    }

    @Override
    public void goPromotions() {
        view.goPromotions();
    }
}
