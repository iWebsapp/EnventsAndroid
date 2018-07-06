package com.mireya.eventsandroid.domain.account.addmenu.presenter;

import com.mireya.eventsandroid.domain.account.addmenu.interactor.AddMenuInteractor;
import com.mireya.eventsandroid.domain.account.addmenu.interactor.AddMenuInteractorImpl;
import com.mireya.eventsandroid.domain.account.addmenu.view.AddMenuView;

public class AddMenuPresenterImpl implements AddMenuPresenter {
    private AddMenuInteractor interactor;
    private AddMenuView view;

    public AddMenuPresenterImpl(AddMenuView view) {
        this.view = view;
        interactor = new AddMenuInteractorImpl(this);
    }

    @Override
    public void goPurchases() {
        view.goPurchases();
    }

    @Override
    public void goTable() {
        view.goTable();
    }
}
