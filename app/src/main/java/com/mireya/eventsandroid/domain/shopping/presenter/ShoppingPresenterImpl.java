package com.mireya.eventsandroid.domain.shopping.presenter;

import com.mireya.eventsandroid.domain.shopping.interactor.ShoppingInteractor;
import com.mireya.eventsandroid.domain.shopping.interactor.ShoppingInteractorImpl;
import com.mireya.eventsandroid.domain.shopping.view.ShoppingView;

public class ShoppingPresenterImpl implements ShoppingPresenter {
    public ShoppingInteractor interactor;
    public ShoppingView view;

    public ShoppingPresenterImpl(ShoppingView view) {
        this.view = view;
        interactor = new ShoppingInteractorImpl(this);
    }
}
