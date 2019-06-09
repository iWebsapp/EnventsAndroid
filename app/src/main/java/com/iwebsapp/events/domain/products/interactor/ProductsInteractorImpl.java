package com.iwebsapp.events.domain.products.interactor;

import com.iwebsapp.events.domain.products.presenter.ProductsPresenter;

public class ProductsInteractorImpl implements ProductsInteractor {
    private ProductsPresenter presents;

    public ProductsInteractorImpl(ProductsPresenter presents) {
        this.presents = presents;
    }
}
