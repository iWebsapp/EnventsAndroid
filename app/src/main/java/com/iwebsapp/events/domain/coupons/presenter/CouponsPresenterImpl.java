package com.iwebsapp.events.domain.coupons.presenter;

import com.iwebsapp.events.domain.coupons.interactor.CouponsInteractor;
import com.iwebsapp.events.domain.coupons.interactor.CouponsInteractorImpl;
import com.iwebsapp.events.domain.coupons.view.CouponsView;

public class CouponsPresenterImpl implements CouponsPresenter {
    private CouponsView view;
    private CouponsInteractor interactor;

    public CouponsPresenterImpl(CouponsView view) {
        this.view = view;
        interactor = new CouponsInteractorImpl(this);
    }
}
