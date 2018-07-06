package com.mireya.eventsandroid.domain.account.purchases.presenter;

import com.mireya.eventsandroid.domain.account.purchases.interactor.PurchasesInteractor;
import com.mireya.eventsandroid.domain.account.purchases.interactor.PurchasesInteractorImpl;
import com.mireya.eventsandroid.domain.account.purchases.view.PurchasesView;

public class PurchasesPresenterImpl implements PurchasesPresenter {
    private PurchasesInteractor interactor;
    private PurchasesView view;

    public PurchasesPresenterImpl(PurchasesView view) {
        this.view = view;
        interactor = new PurchasesInteractorImpl(this);
    }
}
