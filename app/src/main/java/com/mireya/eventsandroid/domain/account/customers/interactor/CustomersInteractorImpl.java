package com.mireya.eventsandroid.domain.account.customers.interactor;

import com.mireya.eventsandroid.domain.account.customers.presenter.CustomersPresenter;

public class CustomersInteractorImpl implements CustomersInteractor {
    private CustomersPresenter presenter;

    public CustomersInteractorImpl(CustomersPresenter presenter) {
        this.presenter = presenter;
    }
}
