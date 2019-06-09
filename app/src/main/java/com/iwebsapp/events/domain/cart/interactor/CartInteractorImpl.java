package com.iwebsapp.events.domain.cart.interactor;

import com.iwebsapp.events.domain.cart.presenter.CartPresenter;

public class CartInteractorImpl implements CartInteractor {
    private CartPresenter presenter;

    public CartInteractorImpl(CartPresenter presenter) {
        this.presenter = presenter;
    }
}
