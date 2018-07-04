package com.mireya.eventsandroid.domain.account.customers.presenter;

import com.mireya.eventsandroid.domain.account.customers.interactor.CustomersInteractor;
import com.mireya.eventsandroid.domain.account.customers.interactor.CustomersInteractorImpl;
import com.mireya.eventsandroid.domain.account.customers.view.CustomersView;

public class CustomersPresenterImpl implements CustomersPresenter {
    private CustomersInteractor interactor;
    private CustomersView view;

    public CustomersPresenterImpl(CustomersView view) {
        this.view = view;
        interactor = new CustomersInteractorImpl(this);
    }
}
