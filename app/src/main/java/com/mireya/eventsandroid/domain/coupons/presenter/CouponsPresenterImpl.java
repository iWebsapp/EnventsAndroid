package com.mireya.eventsandroid.domain.coupons.presenter;

import com.mireya.eventsandroid.domain.account.customers.interactor.CustomersInteractor;
import com.mireya.eventsandroid.domain.account.customers.interactor.CustomersInteractorImpl;
import com.mireya.eventsandroid.domain.account.customers.view.CustomersView;
import com.mireya.eventsandroid.domain.coupons.interactor.CouponsInteractor;
import com.mireya.eventsandroid.domain.coupons.interactor.CouponsInteractorImpl;
import com.mireya.eventsandroid.domain.coupons.view.CouponsView;

public class CouponsPresenterImpl implements CouponsPresenter {
    public CouponsInteractor interactor;
    public CouponsView view;

    public CouponsPresenterImpl(CouponsView view) {
        this.view = view;
        interactor = new CouponsInteractorImpl(this);
        }
}
