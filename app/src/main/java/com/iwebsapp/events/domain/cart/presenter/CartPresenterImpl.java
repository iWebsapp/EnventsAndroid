package com.iwebsapp.events.domain.cart.presenter;

import com.iwebsapp.events.domain.cart.interactor.CartInteractor;
import com.iwebsapp.events.domain.cart.interactor.CartInteractorImpl;
import com.iwebsapp.events.domain.cart.view.CartView;

public class CartPresenterImpl implements CartPresenter{
    private CartView view;
    private CartInteractor interactor;

    public CartPresenterImpl(CartView view) {
        this.view = view;
        interactor = new CartInteractorImpl(this);
    }
}
