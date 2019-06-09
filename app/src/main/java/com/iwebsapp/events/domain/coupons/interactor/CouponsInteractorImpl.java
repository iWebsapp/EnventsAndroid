package com.iwebsapp.events.domain.coupons.interactor;

import com.iwebsapp.events.domain.coupons.presenter.CouponsPresenter;

public class CouponsInteractorImpl implements CouponsInteractor{
    private CouponsPresenter presenter;

    public CouponsInteractorImpl(CouponsPresenter presenter) {
        this.presenter = presenter;
    }
}
