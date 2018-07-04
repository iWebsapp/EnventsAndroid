package com.mireya.eventsandroid.domain.account.drink.interactor;

import com.mireya.eventsandroid.domain.account.drink.presenter.DrinkPresenter;

public class DrinkInteractorImpl implements DrinkInteractor {
    private DrinkPresenter presenter;

    public DrinkInteractorImpl(DrinkPresenter presenter) {
        this.presenter = presenter;
    }
}
