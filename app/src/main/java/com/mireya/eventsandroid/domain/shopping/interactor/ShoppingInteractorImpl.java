package com.mireya.eventsandroid.domain.shopping.interactor;

import com.mireya.eventsandroid.domain.shopping.presenter.ShoppingPresenter;

public class ShoppingInteractorImpl implements ShoppingInteractor {
    public ShoppingPresenter presenter;

    public ShoppingInteractorImpl(ShoppingPresenter presenter) {
        this.presenter = presenter;
    }
}
