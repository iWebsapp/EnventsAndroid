package com.mireya.eventsandroid.domain.account.promotions.interactor;

import com.mireya.eventsandroid.domain.account.promotions.presenter.PromotionsPresenter;

public class PromotionsInteractorImpl implements PromotionsInteractor {
    private PromotionsPresenter presenter;

    public PromotionsInteractorImpl(PromotionsPresenter presenter) {
        this.presenter = presenter;
    }
}
