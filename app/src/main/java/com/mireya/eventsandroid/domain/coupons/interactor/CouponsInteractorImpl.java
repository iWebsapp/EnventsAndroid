package com.mireya.eventsandroid.domain.coupons.interactor;

import com.mireya.eventsandroid.domain.account.customers.interactor.CustomersInteractor;
import com.mireya.eventsandroid.domain.account.customers.presenter.CustomersPresenter;
import com.mireya.eventsandroid.domain.coupons.presenter.CouponsPresenter;

public class CouponsInteractorImpl implements CouponsInteractor {
    public CouponsPresenter presenter;

    public CouponsInteractorImpl(CouponsPresenter presenter) {
        this.presenter = presenter;
    }
}
