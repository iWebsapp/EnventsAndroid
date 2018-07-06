package com.mireya.eventsandroid.domain.account.purchases.interactor;

import com.mireya.eventsandroid.domain.account.purchases.presenter.PurchasesPresenter;

public class PurchasesInteractorImpl implements PurchasesInteractor {
    private PurchasesPresenter presenter;

    public PurchasesInteractorImpl(PurchasesPresenter presenter) {
        this.presenter = presenter;
    }
}
