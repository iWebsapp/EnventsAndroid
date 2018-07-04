package com.mireya.eventsandroid.domain.account.addmenu.interactor;

import com.mireya.eventsandroid.domain.account.addmenu.presenter.AddMenuPresenter;

public class AddMenuInteractorImpl implements AddMenuInteractor {
    private AddMenuPresenter presenter;

    public AddMenuInteractorImpl(AddMenuPresenter presenter) {
        this.presenter = presenter;
    }
}
