package com.mireya.eventsandroid.domain.account.promotions.presenter;

import com.mireya.eventsandroid.domain.account.promotions.interactor.PromotionsInteractor;
import com.mireya.eventsandroid.domain.account.promotions.interactor.PromotionsInteractorImpl;
import com.mireya.eventsandroid.domain.account.promotions.view.PromotionsView;

public class PromotionsPresenterImpl implements PromotionsPresenter {
    private PromotionsInteractor interactor;
    private PromotionsView view;

    public PromotionsPresenterImpl(PromotionsView view) {
        this.view = view;
        interactor = new PromotionsInteractorImpl(this);
    }

    @Override
    public void addMenu() {
        view.addMenu();
    }
}
