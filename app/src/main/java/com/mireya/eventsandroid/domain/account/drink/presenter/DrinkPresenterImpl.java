package com.mireya.eventsandroid.domain.account.drink.presenter;

import com.mireya.eventsandroid.domain.account.drink.interactor.DrinkInteractor;
import com.mireya.eventsandroid.domain.account.drink.interactor.DrinkInteractorImpl;
import com.mireya.eventsandroid.domain.account.drink.view.DrinkView;

public class DrinkPresenterImpl implements DrinkPresenter {
    private DrinkInteractor interactor;
    private DrinkView view;

    public DrinkPresenterImpl(DrinkView view) {
        this.view = view;
        interactor = new DrinkInteractorImpl(this);
    }
}
