package com.iwebsapp.events.domain.products.presenter;

import com.iwebsapp.events.domain.products.interactor.ProductsInteractor;
import com.iwebsapp.events.domain.products.interactor.ProductsInteractorImpl;
import com.iwebsapp.events.domain.products.view.ProductsView;

public class ProductsPresenterImpl implements ProductsPresenter {
    private ProductsView view;
    private ProductsInteractor interactor;

    public ProductsPresenterImpl(ProductsView view) {
        this.view = view;
        interactor = new ProductsInteractorImpl(this);
    }
}
